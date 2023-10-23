/*67.	Get the film titles and rental dates for all rentals made on October 20, 2005.*/

select title,rental_date from film
join inventory on
 inventory.film_id=film.film_id 
 join rental on
 rental.inventory_id=inventory.inventory_id
 where date(rental_date)='2005-10-20'
 
 select rental_date from rental