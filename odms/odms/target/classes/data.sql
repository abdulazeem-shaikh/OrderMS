

CREATE TABLE myOrder (
  order_id INT   PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  order_date VARCHAR(250),
  address VARCHAR(250) 
);



CREATE TABLE orderItems(
order_id INT ,
product_code INTEGER ,
product_name VARCHAR(250),
quantity INT
);
  

