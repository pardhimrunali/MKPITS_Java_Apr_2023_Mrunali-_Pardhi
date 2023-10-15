/*54.	Display the first name, last name, and email of customers who
 have rented the film titled "Spice Sorcerer".*/
 
 select first_name,last_name,email from customer join rental on
 customer.customer_id=rental.customer_id join inventory
 on inventory.inventory_id=rental.rental_id join film 
 on film.film_id=inventory.inventory_id where title="Spice Sorcerer"