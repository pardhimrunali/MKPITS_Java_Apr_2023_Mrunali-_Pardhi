/*13.Get the names of all customers who have rented more than 5 films.*/
use sakila
SELECT DISTINCT customer.first_name,last_name
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
GROUP BY customer.first_name
HAVING COUNT(rental.rental_id) >5