/*31.Get the film titles and rental dates for all rentals made on may 25, 2005.*/
use sakila
select * from film /*film id*/
 select * from inventory /*film id---------inventory id*/
select * from rental /*inventory id*/

select title from film join
inventory
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id
where date(rental_date)='2005-05-27'