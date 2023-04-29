CREATE TABLE unique_cats (
    cat_id INT NOT NULL PRIMARY KEY,
    name VARCHAR(100),
    age INT,
);

INSERT INTO unique_cats (cat_id, name, age)
VALUES (1, 'Mittens', 3),
       (2, 'Fluffy', 5),
       (3, 'Whiskers', 2);

CREATE TABLE unique_cats2 (
    cat_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT
);

INSERT INTO unique_cats2 (name, age) 
VALUES ('Skippy', 4),
        ('Jiff', 3),
        ('Jiff', 3),
        ('Jiff', 3),
        ('Skippy', 4);

CREATE TABLE employees (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    age INT NOT NULL,
    current_status VARCHAR(255) NOT NULL DEFAULT 'enloyed'
);

INSERT INTO employees (first_name, last_name, age)
VALUES ('John', 'Smith', 30);

SELECT * FROM employees;