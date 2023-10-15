/*51.	Get the names of customers who have rented the film titled "Golden Groove"*/
use sakila
select * from film
select * from inventory
select * from customer

select first_name,last_name from customer join store
on customer.store_id=store.store_id join inventory on
inventory.store_id=store.store_id join film on
film.film_id=inventory.film_id where title="Golden Groove"
