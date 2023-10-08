use sakila 
/*2.Display the rental date and return date for each rental 
along with the customer's first name and last name. */
select * from rental /*inventory id*/
select * from inventory/*inventory id*//*store id*/
select * from customer/*store id*/
select rental_date,return_date,first_name,last_name from rental join 
inventory on rental.inventory_id=inventory.inventory_id join customer on
customer.store_id=inventory.store_id
