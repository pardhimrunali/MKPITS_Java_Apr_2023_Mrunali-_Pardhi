/*7.Compute the average rental rate for each film category.*/

select title,avg(rental_rate) from 
film group by title