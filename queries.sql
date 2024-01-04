-- To print employee_id, employee_name, and department_name

SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;


-- To print all employees and their salaries in descending order of their salary

SELECT employee_id, employee_name, salary
FROM employee
ORDER BY salary DESC;


-- To print the average salary of employees in each department with the department name

SELECT d.department_name, AVG(e.salary) AS average_salary
FROM department d
JOIN employee e ON d.department_id = e.department_id
GROUP BY d.department_name;