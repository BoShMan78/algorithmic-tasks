// https://leetcode.com/problems/find-customer-referee/description/?envType=study-plan-v2&envId=top-sql-50

SELECT name
FROM customer
WHERE referee_id != 2 OR referee_id IS NULL
