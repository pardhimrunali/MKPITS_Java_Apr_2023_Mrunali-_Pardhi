/*List the film titles and rental dates for all 
rentals made by the customer with customer_id 200.*/

use sakila

select* from film /*film id*/
select* from inventory  /*inventory id*/ /*film id*/
select* from rental /*customerid*/ /*inventory id*/
select* from customer /*customerid*/


select title,rental_date from film join inventory 
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id join
 customer on customer.customer_id=rental.customer_id where customer.customer_id=200
