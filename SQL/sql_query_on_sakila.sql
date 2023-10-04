use sakila
/* Retrieve all customer names and their email addresses*/

select  first_name ,email from customer

/* Retrieve the number of distinct films in the inventory*/
SELECT COUNT(DISTINCT film_id) AS distinct_films_count FROM film;

/* Retrieve the rental details for a specific rental ID*/
select *from rental
SELECT * 
FROM rental 
WHERE rental_id = 5;

/* Retrieve all film titles and their lengths (in minutes)*/

select title,length from film

/* Retrieve the staff details for a specific staff ID*/
select * from staff
select * from staff where staff_id=1

/*Retrieve the customers from a specific city*/
select * from customer
select * from city


/* Retrieve the most recent rentals*/
select * from rental order by last_update desc

/*Retrieve the distinct film categories available*/
SELECT DISTINCT category_id
FROM film_category

/* Retrieve the rental history for a specific customer*/