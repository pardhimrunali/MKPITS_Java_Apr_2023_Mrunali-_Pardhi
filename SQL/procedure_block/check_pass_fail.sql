DELIMITER //
CREATE PROCEDURE checkm(IN marks int)
begin
if (marks<20) then
select "fail";
else 
if(marks>=20 and marks<60) then
select "pass";
else 
select "p";
end if;
end if;
end
//
DELIMITER ;
call checkm(100)
