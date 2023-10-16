use bookshop
/*Problem Statement 4: Calculate BMI (Body Mass Index)
Create a user-defined function that takes a person's weight (in kilograms) and height 
(in meters) as input and calculates their BMI.*/

delimiter //
CREATE FUNCTION function_bmi(weight float,height float)
RETURNS double deterministic
BEGIN
declare bmi double;
set bmi=weight*height;
RETURN bmi;
END
//
delimiter ;

select  function_bmi(39.05,5.3)