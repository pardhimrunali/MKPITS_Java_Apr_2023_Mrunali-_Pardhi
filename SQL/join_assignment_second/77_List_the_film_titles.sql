/*77.	List the film titles and rental dates for
 all rentals made by customer "Laura Anderson".*/
 
 select title,rental_date from 
 film join 
 inventory
 on
 film.film_id=inventory.film_id
 join rental
 on
 inventory.inventory_id=rental.inventory_id
 join customer
 on
 rental.customer_id=customer.customer_id
 where customer.first_name='Laura' and last_name='Anderson'