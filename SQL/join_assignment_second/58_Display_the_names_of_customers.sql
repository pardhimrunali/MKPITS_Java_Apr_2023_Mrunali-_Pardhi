/*58.	Display the names of customers who have rented the film titled "Scream Human".*/
use sakila


select first_name,last_name from  customer join rental 
on  customer.customer_id=rental.customer_id join inventory 
on inventory.inventory_id=rental.inventory_id join film on
film.film_id=inventory.film_id where title='Scream Human'