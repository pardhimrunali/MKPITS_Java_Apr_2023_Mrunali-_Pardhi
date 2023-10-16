/*2. Determine the count of rentals for each customer.*/

use sakila 
select customer.customer_id,count(rental_id)
from customer join rental on
customer.customer_id=rental.customer_id
group by rental_id