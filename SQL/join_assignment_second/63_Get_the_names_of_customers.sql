/*63.	Get the names of customers who have rented the film titled "Princess Giant".*/

select customer.first_name,last_name from customer
join rental 
on customer.customer_id=rental.customer_id
join 
inventory on
rental.inventory_id=inventory.inventory_id
join
film
on film.film_id=inventory.film_id
where film.title='Princess Giant'