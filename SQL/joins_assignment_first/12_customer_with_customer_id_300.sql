/*Display the film titles rented by the customer with customer_id 300.*/
use sakila 
select * from film /*film_id*/
select * from  inventory/*film_id*//*inventory_id*/
 select * from rental/*inventory_id*//*customer_id*/
select * from  customer/*customer_id*/

select title from film join inventory
on film.film_id=inventory.film_id join rental on
rental.inventory_id=inventory.inventory_id join customer
on customer.customer_id=rental.customer_id where customer.customer_id=300
 
