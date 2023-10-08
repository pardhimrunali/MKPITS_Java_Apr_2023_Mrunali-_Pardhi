use sakila
/*3.List the names of actors who have appeared in the film titled "Chamber Italian".*/

select * from actor /*actor id*/
select * from film_actor /*actor_id --------film_id*/
select * from film /*film_id*/




select first_name,last_name,title from actor join
film_actor on actor.actor_id=film_actor.actor_id join film on
film.film_id=film_actor.film_id where title='Chamber Italian'

