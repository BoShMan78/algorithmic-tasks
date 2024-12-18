// https://leetcode.com/problems/recyclable-and-low-fat-products/?envType=study-plan-v2&envId=top-sql-50

SELECT product_id
FROM products
WHERE low_fats = 'Y' AND recyclable = 'Y'
