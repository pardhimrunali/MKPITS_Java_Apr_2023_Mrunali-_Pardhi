
use sakila
DELIMITER //
create procedure subtraction(num1 int,num2 int)
BEGIN
DECLARE sub int;
set  sub=num1-num2;
select sub;
end

//
DELIMITER ;

call subtraction(19,2);