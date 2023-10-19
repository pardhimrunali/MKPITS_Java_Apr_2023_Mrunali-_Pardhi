/*7. Active customers:
Identify customers who have rented in the last 30 days.*/

select * from rental

select customer.customer_id from
 customer join rental on
customer.customer_id=rental.customer_id
WHERE rental.rental_date >= CURDATE() - INTERVAL 30 DAY
GROUP BY customer.customer_id
HAVING COUNT(rental.rental_id) > 0;



