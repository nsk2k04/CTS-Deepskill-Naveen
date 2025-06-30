CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    AccountType VARCHAR2(20),
    Balance NUMBER
);
INSERT INTO Accounts VALUES (1, 'Savings', 10000);
INSERT INTO Accounts VALUES (2, 'Current', 20000);
COMMIT;

CREATE OR REPLACE PROCEDURE ApplyYearlyFee AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance - 500
    WHERE AccountType = 'Current';

    COMMIT;
END;
BEGIN
    ApplyYearlyFee;
END;
/

SELECT * FROM Accounts;

CREATE OR REPLACE PROCEDURE DeductPenaltyFromLowRating AS
BEGIN
    UPDATE Employees
    SET Salary = Salary - 2000
    WHERE PerformanceRating <= 2;

    COMMIT;
END;
/

-- Run it
BEGIN
    DeductPenaltyFromLowRating;
END;
/

-- Check
SELECT * FROM Employees;

CREATE OR REPLACE PROCEDURE SplitBonusEqually (
    p_Emp1 IN NUMBER,
    p_Emp2 IN NUMBER,
    p_Bonus IN NUMBER
) AS
v_HalfBonus NUMBER;
BEGIN
    v_HalfBonus := p_Bonus / 2;

    UPDATE Employees SET Salary = Salary + v_HalfBonus WHERE EmployeeID = p_Emp1;
    UPDATE Employees SET Salary = Salary + v_HalfBonus WHERE EmployeeID = p_Emp2;

    COMMIT;
END;
/

-- Run it
BEGIN
    SplitBonusEqually(1, 3, 10000);
END;
/

-- Check
SELECT * FROM Employees;

/