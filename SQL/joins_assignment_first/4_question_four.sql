use sakila
/*4.Get the titles of all films rented by the customer named "William Brown".*/
select* from customer /*customerid*/
select* from rental /*customerid*/ /*inventory id*/
select* from inventory  /*inventory id*/ /*film id*/
select* from film /*film id*/



select first_name,title from film join inventory on 
film.film_id=inventory.film_id join rental on
rental.inventory_id=inventory.inventory_id join 
customer on customer.customer_id=rental.customer_id where first_name='william' 


