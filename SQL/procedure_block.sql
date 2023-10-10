use sakila

DELIMITER //
create procedure get_film_name()
BEGIN
select title,film_id from film;
END
//
DELIMITER ;

call get_film_name()