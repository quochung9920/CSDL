SELECT 10 != 10;
SELECT 15 > 14 && 99 – 5 <= 94;
SELECT 1 IN (5,3) || 9 BETWEEN 8 AND 10;

SELECT * FROM books WHERE released_year < 1980;

SELECT * FROM books 
WHERE author_lname = 'Eggers' || author_lname = 'Chabon';

SELECT * FROM books 
WHERE author_lname = 'Lahiri' && released_year < 2000;

SELECT * FROM books
WHERE pages BETWEEN 99 AND 201;

SELECT title, author_lname,
       (CASE
            WHEN title LIKE '%stories%' THEN 'Short Stories'
            WHEN title IN ('Just Kids', 'A Heartbreaking Work of Staggering Genius') THEN 'Memoir'
            ELSE 'Novel'
        END) AS TYPE
FROM books;
