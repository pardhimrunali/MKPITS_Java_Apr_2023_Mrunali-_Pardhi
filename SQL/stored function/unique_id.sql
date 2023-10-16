use bookshop
/*
Problem Statement 5: Generate a Unique Customer ID
Design a user-defined function that generates a unique customer ID based on a predefined pattern 
and the customer's personal details.*/
delimiter //
CREATE FUNCTION unique_id_customer(nameof_customer varchar(15),date_of_birth date)
RETURNS varchar(15) deterministic
BEGIN
declare unique_id varchar(15);
set unique_id=concat(date_of_birth,nameof_customer);

RETURN unique_id;
END

//function_uinique_id
delimiter ;
 drop function unique_id_of_customer

select unique_id_customer('radha','2023-11-03')