/*Display the film titles and rental durations for all rentals made on May 15, 2005.*/
select * from film /*film_id*/
select * from inventory /*film_id---------store_id*/
select * from customer /*store_id---------------customerid*/
select * from rental/*customerid*/

select title,rental_duration from film join inventory 
on film.film_id=inventory.film_id join customer on 
customer.store_id=inventory.store_id join rental on 
rental.customer_id=customer.customer_id where date(rental_date)='2005-05-15'



select title,rental_duration from film join inventory 
on film.film_id=inventory.film_id join customer on 
customer.store_id=inventory.store_id join rental on 
rental.customer_id=customer.customer_id where date(rental_date)='2005-05-24'

