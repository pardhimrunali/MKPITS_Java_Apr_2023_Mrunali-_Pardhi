delimiter //
CREATE FUNCTION calculate_gst(amount decimal(5,2)) 
RETURNS decimal(5,2)
    DETERMINISTIC
BEGIN
declare gst int;
set gst=amount*0.18;
RETURN gst;
END
//
delimiter ;

select calculate_gst(40)