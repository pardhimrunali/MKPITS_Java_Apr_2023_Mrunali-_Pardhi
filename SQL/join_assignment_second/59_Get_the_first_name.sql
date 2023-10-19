/*59.	Get the first name, last name, and email of 
customers who have rented more than 15 films.*/

select customer.first_name,customer.last_name,customer.email from customer join
rental on rental.customer_id=customer.customer_id group by
 customer.customer_id having
 count(rental.rental_id)>15