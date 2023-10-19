/*56.	Retrieve the film titles rented by the customer with customer_id 140.*/
use sakila

select * from customer

select title from film join inventory
on film.film_id=inventory.film_id join store
on inventory.store_id=store.store_id join customer
on store.store_id=customer.store_id where customer_id=140