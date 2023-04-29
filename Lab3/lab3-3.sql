CREATE TABLE cats (
    cat_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    breed VARCHAR(100),
    age INT
);

INSERT INTO cats (name, breed, age)
VALUES ('Mittens', 'Tabby', 3),
       ('Fluffy', 'Siamese', 5),
       ('Whiskers', 'Tabby', 2),
       ('Skippy', 'Tabby', 4),
       ('Jiff', 'Tabby', 3),
       ('Jiff', 'Tabby', 3),
       ('Jiff', 'Tabby', 3),
       ('Skippy', 'Tabby', 4);

SELECT cat_id FROM cats;
SELECT name, breed FROM cats;
SELECT name, age FROM cats;

SELECT cat_id AS id, name FROM cats;
SELECT name AS 'cat name', breed AS 'kitty breed' FROM cats;

    