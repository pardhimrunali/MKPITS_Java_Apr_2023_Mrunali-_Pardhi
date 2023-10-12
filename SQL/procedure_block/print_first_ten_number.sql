DELIMITER //
create procedure printfirstennum()
begin 
declare counter int;
SET counter   = 1;

WHILE counter <10 DO
    SELECT counter;
    SET counter = counter+1;
END WHILE;
select counter;
end

//
DELIMITER ;

call printfirsttennumber();
call printnumber();