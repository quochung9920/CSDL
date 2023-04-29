SELECT CURTIME();
SELECT CURDATE();
SELECT DATEOFWEEK(CURDATE());
SELECT DATEOFWEEK(NOW());
SELECT DATE_FORMAT(NOW(), '%w') + 1;
SELECT DAYNAME(NOW());
SELECT DATE_FORMAT(NOW(), '%W');
SELECT DATE_FORMAT(CURDATE(), '%m/%d/%Y');
SELECT DATE_FORMAT(NOW(), '%M %D at %h:%i');

CREATE TABLE tweets (
  content VARCHAR(140),
  username VARCHAR(20),
  create_at TIMESTAMP DEFAULT NOW()
);

INSERT INTO tweets (content, username) VALUES ('this is my first tweet', 'coltscat');
INSERT INTO tweets (content, username) VALUES ('this is my second tweet', 'coltscat');


