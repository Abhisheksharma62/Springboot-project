SHOW DATABASES;
USE db;
SELECT DATABASE();
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT
);
INSERT INTO student
(id,name,salary)
VALUES
(1,"ABHISHEK","6000");
SELECT * FROM student;
DROP TABLE student;
SHOW TABLES;
DROP TABLE student;