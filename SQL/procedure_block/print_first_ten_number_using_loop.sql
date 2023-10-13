
DELIMITER //
CREATE  PROCEDURE priint_loop()
BEGIN
declare counter int;
SET counter = 1;

label:LOOP
    SELECT counter;
    SET counter = counter + 1;
    IF counter > 5 THEN
        LEAVE label;
    END IF;
END LOOP;
END

//
DELIMITER ;
call priint_using_loop();
call priint_loop();