/*76.	Retrieve the rental date and return date for each rental made
 by customer "George Davis".*/
 
 select rental_date,return_date 
 from rental
 join 
 customer
 where 
 customer.first_name='George' and last_name='Davis'