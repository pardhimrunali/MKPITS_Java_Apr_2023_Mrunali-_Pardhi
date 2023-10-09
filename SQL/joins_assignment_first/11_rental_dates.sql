/*11.List the film titles and rental dates
 for all rentals made by customer "Mary SMITH".*/
 
 select * from film /*film_id*/
select * from  inventory/*film_id*//*inventory_id*/
 select * from rental/*inventory_id*//*customer_id*/
select * from  customer/*customer_id*/

select first_name, last_name,title,rental_date from film join inventory
on film.film_id=inventory.film_id join rental on
rental.inventory_id=inventory.inventory_id join customer
on customer.customer_id=rental.customer_id where first_name='mary' and last_name='SMITH'
 
