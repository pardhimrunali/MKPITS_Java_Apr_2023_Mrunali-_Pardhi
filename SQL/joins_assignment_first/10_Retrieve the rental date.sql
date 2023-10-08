/*10.Retrieve the rental date and 
rental duration for each rental made by customer "Linda Williams"*/

select* from film /*film id*/
select* from inventory  /*inventory id*/ /*film id*/
select* from rental /*customerid*/ /*inventory id*/
select* from customer /*customerid*/




select rental_duration,rental_date from film join inventory 
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id join
 customer on customer.customer_id=rental.customer_id where first_name='Linda'
 and last_name='Williams'
