delimiter \\
CREATE  FUNCTION new_getamounts(cust_id int)
 RETURNS integer DETERMINISTIC
BEGIN
declare amt int;
select sum(amount) into amt from payment where customer_id=cust_id;



RETURN amt;
END
\\
delimiter ;

select new_getamounts(10)