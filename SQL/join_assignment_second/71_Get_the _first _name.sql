/*71.	Get the first name, last name, and email of customers who have rented more than 18 films.*/
use sakila

select first_name,last_name,email,rental_id from customer
join
rental 
on 
customer.customer_id=rental.customer_id 
group by rental_id>18