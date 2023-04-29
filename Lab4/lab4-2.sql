SELECT CONCAT(author_fname, ' ', author_lname) AS fullname
FROM books;

SELECT CONCAT_WS(' - ', author_fname, author_lname) AS fullname
FROM books;

SELECT SUBSTRING('data analyst', 6, 8);

SELECT REPLACE('data analyst', 'analyst', 'science');

UPDATE books
SET title = REPLACE(title, ' ', '->');

SELECT REVERSE('data analyst');

SELECT CHAR_LENGTH('database');

SELECT CHAR_LENGTH(title) FROM books;


SELECT UPPER('database');

UPDATE books
SET title = REPLACE(title, '->', ' ');

SELECT UPPER(title) FROM books;

SELECT LOWER('DATABASE');

SELECT LOWER(title) FROM books;