/*69.	List the rental date and return date for
 all rentals made by customer "Donald Davis".*/
 
 select rental_date,return_date from
rental
 join customer
 on
 customer.customer_id=rental.customer_id
 where  customer.first_name='Donald' and last_name='Davis'