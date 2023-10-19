/*Aggregated View
Create a view named monthly_rental_stats that displays the month, year, and the
 total number of rentals for each month in the rental table.*/
 
 CREATE VIEW monthly_rental_stats AS
SELECT 
    MONTH(rental_date) AS month,
    YEAR(rental_date) AS year,
    COUNT(*) AS total_rentals
FROM 
    rental
GROUP BY 
    YEAR(rental_date), MONTH(rental_date);
    
    
     select * from monthly_rental_stats