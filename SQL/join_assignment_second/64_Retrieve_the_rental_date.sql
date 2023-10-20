/*64.	Retrieve the rental date and return date 
for each rental made by customer "Mary Harris".*/

select rental_date,return_date from
rental join customer
on 
customer.customer_id=rental.customer_id
where customer.first_name='Mary' and customer.last_name=''