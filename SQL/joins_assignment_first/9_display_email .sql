/*Display the first name, last name, and email of customers
 who have rented the film titled "Flight Lies"*/
 
 select* from customer /*customerid*/
select* from rental /*customerid*/ /*store_id*/
select* from inventory  /*store_id*/ /*film id*/
select* from film /*film id*/

select first_name,last_name,email from customer join rental on
customer.customer_id=rental.customer_id join inventory
on inventory.store_id=customer.store_id join film 
on film.film_id=inventory.film_id where title='Flight Lies'