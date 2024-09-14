// https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true

SELECT MAX(total_earnings), COUNT(*)
FROM (
    SELECT salary * months AS total_earnings
    FROM employee
) AS EmployeeEarnings
WHERE total_earnings = (
    SELECT MAX(salary * months) 
    FROM employee
);
