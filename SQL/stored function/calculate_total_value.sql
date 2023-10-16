/*Design a user-defined function that takes order quantity and unit price 
as input and calculates the total order value for each order.
*/

delimiter //
CREATE  function total_order(order_quantity int,price int)
 RETURNS integer DETERMINISTIC
BEGIN
declare total_order int;
 set total_order=order_quantity*price;

RETURN total_order;
END
//
delimiter ;


select total_order(20,300)
select new_total_order(25,300)


