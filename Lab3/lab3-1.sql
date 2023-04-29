USE cat_app;
CREATE TABLE people(
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    age INT
);
INSERT INTO people (first_name, last_name, age)
VALUES ('Tina', 'Belcher', 13),
    ('Gene', 'Belcher', 11),
    ('Louise', 'Belcher', 9),
    ('Bob', 'Belcher', 40),
    ('Linda', 'Belcher', 40);

SELECT * FROM people;

DROP TABLE people;

SHOW TABLES;