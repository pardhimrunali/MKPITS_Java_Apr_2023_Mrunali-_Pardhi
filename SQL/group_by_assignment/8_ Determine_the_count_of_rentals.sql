/*8. Determine the count of rentalsDetermine the count of rentals for each film.*/
select film.film_id,count(rental_id) from
film  join inventory on
film.film_id=inventory.film_id join 
rental on 
rental.inventory_id=inventory.inventory_id 
group  by film_id