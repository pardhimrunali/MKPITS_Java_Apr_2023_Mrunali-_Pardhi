/*Retrieve the film titles rented by the customer with customer_id 100*/
use sakila
select* from film /*film id*/
select* from inventory  /*inventory id*/ /*film id*/
select* from rental /*customerid*/ /*inventory id*/
select* from customer where first_name='robin'/*customerid*/


select title from film join inventory 
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id join
 customer on customer.customer_id=rental.customer_id where customer.customer_id=100 
