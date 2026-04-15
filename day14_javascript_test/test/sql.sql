CREATE  TABLE users(
  注文ID INT PRIMARY Key,
  氏名 VARCHAR(50) NOT null,
  Eメール VARCHAR(50) NOT null UNIQUE
);

CREATE TABLE orders (
   従業員ID INT PRIMARY KEY,
   ユーザーID INT,
   製品名 VARCHAR(100),
   購入日 DATE,
   FOREIGN KEY (ユーザーID) REFERENCES users(従業員ID)
);

CREATE TABLE users(
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE orders (
  id INT PRIMARY KEY,
  user_id INT,
  product_name VARCHAR(100),
  purchase_date DATE,
  FOREIGN KEY (user_id) REFERENCES users(id)
);