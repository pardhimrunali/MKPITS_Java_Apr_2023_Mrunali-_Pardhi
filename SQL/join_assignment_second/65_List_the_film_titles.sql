/*65.List the film titles and rental dates for all rentals made by customer "Robert Smith".*/

select title,rental_date 
from
film join
inventory 
on 
film.film_id=inventory.film_id
join rental 
on
rental.inventory_id=inventory.inventory_id
join
customer 
on customer.customer_id=rental.customer_id
where customer.first_name='Robert' and customer.last_name='Smith'


 