
CREATE DATABASE db_product;

CREATE TABLE IF NOT EXISTS products
( id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(128) NOT NULL,
  quota VARCHAR (128) NOT NULL,
  price VARCHAR (128) NOT NULL,
  PRIMARY KEY (id)
);

