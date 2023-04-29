SELECT COUNT(*) as num_book
FROM books;

SELECT COUNT(*), released_year as num_book
FROM books
GROUP BY released_year;

SELECT SUM(stock_quantity) as sum_stock
FROM books;

SELECT AVG(released_year) as avg_released_year
FROM books
GROUP BY author_lname;

SELECT CONCAT(author_fname, ' ', author_lname) as fullname, MAX(pages) as pages
FROM books;
