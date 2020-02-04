DROP TABLE IF EXISTS courses;

DROP TABLE IF EXISTS teachers;

CREATE TABLE teachers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  surname VARCHAR(250) NOT NULL
);
 
CREATE TABLE courses (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  active BOOLEAN NOT NULL,
  teacher INT NOT NULL,
  title VARCHAR(250) NOT NULL,
  level VARCHAR(250) NOT NULL,
  hours VARCHAR(250) NOT NULL
);

INSERT INTO teachers (id, name, surname) VALUES
  (1, 'Alexander', 'Echavarria'),
  (2, 'Gonzalo', 'Fuentes'),
  (3, 'Natalia', 'Jimenez'),
  (4, 'Samuel', 'García');


INSERT INTO courses (id, active, teacher, title, level, hours) VALUES
  (1, 0, 1, 'Java 01', 'Basico', 25),
  (2, 0, 2, 'Java 02', 'asico', 22),
  (3, 0, 3, 'Java 03', 'Intermedio', 23),
  (4, 0, 4, 'Java 04', 'Dificil', 30);
