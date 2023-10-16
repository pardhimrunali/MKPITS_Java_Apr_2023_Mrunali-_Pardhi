/*Problem Statement 3: String Reversal
Design a user-defined function that takes a string as input and returns the reversed string.
*/
delimiter //
CREATE FUNCTION `new_function_reverse`(stringinput varchar(255))
RETURNS varchar(255) deterministic
BEGIN
declare reverse_of_string varchar(255);
set reverse_of_string=reverse(stringinput);


RETURN reverse_of_string;
END

//
delimiter ;

select new_function_reverse("hiii,byeee")