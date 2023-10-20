/*Assignment 5: Hierarchical View
Create a hierarchical view named film_actors_hierarchy that 
displays the film title and the actors for each film, organized in a 
hierarchical structure, using the film and actor tables.*/

use sakila
create view film_actors_hierarchy 
as select film.title,actor.first_name,actor.last_name from 
film join film_actor on
film.film_id=film_actor.film_id join 
actor on
actor.actor_id=actor.actor_id

select * from film_actors_hierarchy 