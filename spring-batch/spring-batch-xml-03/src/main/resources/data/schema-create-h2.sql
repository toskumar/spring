DROP TABLE IF EXISTS person;

CREATE TABLE IF NOT EXISTS person(id BIGINT AUTO_INCREMENT, first_name VARCHAR, last_name VARCHAR, dob DATE);

INSERT INTO person (first_name, last_name, dob) VALUES ('Sobin1', 'John', '1978-01-01');
INSERT INTO person (first_name, last_name, dob) VALUES ('Sobin2', 'John', '1978-01-02');
INSERT INTO person (first_name, last_name, dob) VALUES ('Sobin3', 'John', '1978-01-03');
INSERT INTO person (first_name, last_name, dob) VALUES ('Sobin4', 'John', '1978-01-04');
INSERT INTO person (first_name, last_name, dob) VALUES ('Sobin5', 'John', '1978-01-05');
INSERT INTO person (first_name, last_name, dob) VALUES ('Sobin6', 'John', '1978-01-06');
