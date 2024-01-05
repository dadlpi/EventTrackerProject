
DROP DATABASE IF EXISTS salestrackerdb;
CREATE DATABASE IF NOT EXISTS salestrackerdb;


USE salestrackerdb;
CREATE TABLE CUSTOMER(
id INTEGER PRIMARY KEY AUTO_INCREMENT,
firstname VARCHAR(40) NOT NULL,
lastname VARCHAR(60),
active_ind TINYINT NOT NULL,
create_date DATETIME,
modify_date DATETIME,
description TEXT
);


DROP USER IF EXISTS salestrackerapp@localhost;
CREATE USER IF NOT EXISTS salestrackerapp@localhost IDENTIFIED BY 'salestrackerapp';
GRANT SELECT, INSERT, UPDATE, DELETE ON salestrackerdb.* TO salestrackerapp@localhost;

START TRANSACTION;

INSERT INTO CUSTOMER (id, firstname, lastname, active_ind, create_date, modify_date, description) 
values (1, 'Diego', 'De La Puente', 1, '2024-01-05', '2024-01-05', 'he is interested in doing big purchases');

COMMIT;
