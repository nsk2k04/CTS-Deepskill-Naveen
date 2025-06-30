-- Employees Table
CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER,
    PerformanceRating NUMBER
);

-- Bonuses Table
CREATE TABLE Bonuses (
    BonusID NUMBER PRIMARY KEY,
    EmployeeID NUMBER,
    BonusAmount NUMBER,
    BonusDate DATE
);
INSERT INTO Employees VALUES (1, 'John', 'Sales', 50000, 4);
INSERT INTO Employees VALUES (2, 'Maria', 'HR', 60000, 2);
INSERT INTO Employees VALUES (3, 'Steve', 'IT', 70000, 5);
INSERT INTO Employees VALUES (4, 'Anna', 'IT', 55000, 3);

INSERT INTO Bonuses VALUES (201, 1, 1000, SYSDATE);
INSERT INTO Bonuses VALUES (202, 2, 800, SYSDATE);
INSERT INTO Bonuses VALUES (203, 3, 1200, SYSDATE);
INSERT INTO Bonuses VALUES (204, 4, 900, SYSDATE);

COMMIT;
BEGIN
  FOR rec IN (
    SELECT e.EmployeeID, b.BonusID
    FROM Employees e
    JOIN Bonuses b ON e.EmployeeID = b.EmployeeID
    WHERE e.PerformanceRating >= 4
  ) LOOP
    UPDATE Bonuses
    SET BonusAmount = BonusAmount + 500
    WHERE BonusID = rec.BonusID;
  END LOOP;

  COMMIT;
END;

SELECT e.Name, e.PerformanceRating, b.BonusAmount
FROM Employees e
JOIN Bonuses b ON e.EmployeeID = b.EmployeeID;