use product_management
select * from products
DELIMITER //
CREATE TRIGGER afte_sales_trigger
AFTER INSERT ON sales FOR EACH ROW
BEGIN
UPDATE products
    set quantity=quantity-NEW.quantity_sale
    where product_id=NEW.product_id;
END;
//
DELIMITER ;

insert into sales values(101,01,25)

