create database online_shop;

use online_shop;

create table book(
    id int primary key auto_increment,
    name varchar(50) not null,
    notes varchar(100)
);

CREATE VIEW bookview AS 
SELECT * FROM book;

insert into bookview (id, name) values (2, "War and Peace");
DROP VIEW bookview;