/*Calculate Age from Birthdate
Develop a user-defined function that takes a person's birthdate as 
input and calculates their current age in years.
*/

delimiter //
create function  calculates_Age(person_birthdate date , current_dates date)
returns int deterministic
begin
declare age_in_year int;
set age_in_year=DateDiff(current_dates,person_birthdate)/365;
return age_in_year;
end
//
delimiter ;

select  calculates_Age('1999-03-23','2023-10-16');


