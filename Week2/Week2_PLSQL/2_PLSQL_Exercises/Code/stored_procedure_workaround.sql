DECLARE
    n NUMBER := 5;
BEGIN
    IF n > 0 THEN
        DBMS_OUTPUT.PUT_LINE(n || ' is Positive');
    ELSIF n < 0 THEN
        DBMS_OUTPUT.PUT_LINE(n || ' is Negative');
    ELSE
        DBMS_OUTPUT.PUT_LINE('It is Zero');
    END IF;
END;
/