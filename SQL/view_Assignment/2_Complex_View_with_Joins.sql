/*Assignment 2: Complex View with Joins
Create a view named customer_rental_info that displays the customer's first name, 
last name, email, rental date, and film title for each rental transaction in the Sakila database.
 Utilize appropriate joins to obtain the necessary information.*/
 
 /*creating view in sakila*/
 
 use sakila
 
 create view customer_rental_info as
 select
 first_name,last_name,email,rental_date,title from
 customer join rental on
 customer.customer_id=rental.customer_id 
 join inventory on rental.inventory_id=rental.inventory_id
 join film on film.film_id=inventory.film_id
 
 /*show the created view*/
 
select * from customer_rental_info