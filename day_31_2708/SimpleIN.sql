// https://www.codewars.com/kata/58113c03009b4fcc66000d29/train/sql

SELECT departments.id, departments.name
FROM departments
WHERE departments.id IN (
  SELECT departments.id
  FROM sales
  WHERE sales.price > 98
);
