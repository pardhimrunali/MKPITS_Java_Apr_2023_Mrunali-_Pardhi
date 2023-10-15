/*55.	Get the film titles and rental dates 
for all rentals made on September 5, 2005.*/

select rental_date from rental

select title,rental_date from film join
inventory on film.film_id=inventory.film_id join
rental on rental.inventory_id=inventory.inventory_id where date(rental_date)=24-05-2005