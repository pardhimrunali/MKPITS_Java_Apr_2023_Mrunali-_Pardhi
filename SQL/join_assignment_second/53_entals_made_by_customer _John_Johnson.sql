/*53.	List the film titles and rental dates
 for all rentals made by customer "John Johnson".*/
 
 select title,rental_date from film join inventory 
 on film.film_id=inventory.film_id  join  rental on
 rental.inventory_id=inventory.inventory_id join customer
 on customer.customer_id=rental.customer_id where first_name="John" and last_name="Johnson"