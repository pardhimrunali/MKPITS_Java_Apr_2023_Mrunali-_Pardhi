/*68.	Retrieve the film titles rented by the customer with customer_id 170*/

select title from film
join inventory 
on
inventory.film_id=film.film_id 
 join rental on
 rental.inventory_id=inventory.inventory_id
 join customer on
 rental.customer_id=customer.customer_id
 where customer.customer_id=1700
 