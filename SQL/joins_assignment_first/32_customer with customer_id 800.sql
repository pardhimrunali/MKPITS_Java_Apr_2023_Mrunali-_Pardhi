/*32.Retrieve the film titles rented by the customer with customer_id 800.*/
 select * from film /*film id*/
 select * from inventory/*film id*//*store id*/
 select * from customer/*store id*/
 use sakila 
 select title from film join inventory
 on film.film_id=inventory.film_id join customer on
 customer.store_id=inventory.store_id where customer_id=800
 
 