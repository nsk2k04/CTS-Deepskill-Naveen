DECLARE
    v_num NUMBER := 1;
BEGIN
    WHILE v_num <= 10 LOOP
        IF MOD(v_num, 2) = 0 THEN
            DBMS_OUTPUT.PUT_LINE(v_num || ' is Even');
        ELSE
            DBMS_OUTPUT.PUT_LINE(v_num || ' is Odd');
        END IF;

        v_num := v_num + 1;
    END LOOP;
END;
/