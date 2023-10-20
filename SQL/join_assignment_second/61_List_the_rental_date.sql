/*61.List the rental date and rental duration for
 each rental made by customer "Paul Jackson".*/

use sakila

select rental_duration,rental_date
 from
 film 
join 
inventory on
film.film_id=inventory.film_id
join
rental on
inventory.inventory_id=rental.inventory_id 
join customer
on
rental.customer_id=customer.customer_id
where customer.first_name='Paul' and customer.last_name='Jackson'
