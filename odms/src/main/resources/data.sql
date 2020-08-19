CREATE TABLE order (
  order_id INT or  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  order_date date NOT NULL,
  shipping_address VARCHAR(500) NOT NULL,
 
);
 

CREATE TABLE orderItem(
order_id INT 
product_code INTEGER ,
product_name VARCHAR(250),
quantity INT
);
  