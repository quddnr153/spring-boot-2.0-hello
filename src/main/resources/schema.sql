CREATE TABLE IF NOT EXISTS employee
(
  employee_seq BIGINT AUTO_INCREMENT PRIMARY KEY
, employee_id VARCHAR(255) NOT NULL
, employee_name VARCHAR(255) NOT NULL
, employee_password VARCHAR(255) NOT NULL
, request_date TIMESTAMP
, modify_date TIMESTAMP
, status VARCHAR(255)
);