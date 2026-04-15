CREATE TABLE student(
  id INT PRIMARY Key,
  name VARCHAR(50) NOT null,
  email VARCHAR(50) NOT null
) 

CREATE TABLE test(
  id INT PRIMARY Key,
  student_id INT,
  test_name VARCHAR(50) NOT null,
  exam_day DATE,
  score INT,
  FOREIGN KEY(id) REFERENCES student(id)
) 