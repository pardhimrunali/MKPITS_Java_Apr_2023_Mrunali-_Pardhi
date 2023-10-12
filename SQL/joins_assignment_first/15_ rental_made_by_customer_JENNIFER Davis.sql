/*15.Retrieve the rental date and return date for
 each rental made by customer "JENNIFER Davis".*/
 use sakila
  select * from rental /*customer id*/
 select * from customer/*customer id*/
 
 select rental_date,return_date from rental join 
 customer on rental.customer_id=customer.customer_id where
 first_name="JENNIFER" and last_name="Davis"