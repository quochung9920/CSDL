CREATE TABLE students (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(150) NOT NULL
);

CREATE TABLE papers (
    title VARCHAR(150),
    grade INTEGER,
    student_id INTEGER,
    FOREIGN KEY (student_id) REFERENCES students(id)
);

INSERT INTO students(first_name) VALUES('Caleb'), ('Sâmntha'),('Raj'),('Carlos'),('Lisa');

INSERT INTO papers (student_id, title, grade ) VALUES
(1, 'My First Book Report', 60),
(1, 'My Second Book Report', 75),
(2, 'Russian Lit Through The Ages', 94),
(2, 'De Montaigne and The Art of The Essay', 98),
(4, 'Borges and Magical Realism', 89);

SELECT * FROM students;
SELECT * FROM papers;

SELECT first_name, title, grade
FROM students
LEFT JOIN papers 
ON students.id = papers.student_id;

SELECT first_name, IFNULL(title, 'MISSING'), IFNULL(grade, 0)
FROM students
LEFT JOIN papers 
ON students.id = papers.student_id;

SELECT first_name, IFNULL(AVG(grade), 0.0000) AS average
FROM students
LEFT JOIN papers
ON students.id = papers.student_id
GROUP BY first_name
ORDER BY average DESC;

SELECT first_name, 
    IFNULL(AVG(grade), 0.0000) AS average, 
    IF(AVG(grade) > 0, 'PASSING', 'FAILING') AS passing_status
FROM students
LEFT JOIN papers
ON students.id = papers.student_id
GROUP BY first_name
ORDER BY average DESC;