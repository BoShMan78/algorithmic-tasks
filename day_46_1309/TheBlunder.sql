// https://www.hackerrank.com/challenges/the-blunder/problem?isFullScreen=true

WITH ModifiedSalary AS (
    SELECT salary,
        CAST(REPLACE(CAST(salary AS CHAR), '0', '') AS UNSIGNED) AS modified_salary
    FROM employees)

SELECT
    CEIL(ABS(AVG(salary) - AVG(modified_salary)))
FROM ModifiedSalary
