// https://www.codewars.com/kata/58112f8004adbbdb500004fe/train/sql

SELECT 'US' AS location,
id,
name,
price,
card_name,
card_number,
transaction_date
FROM ussales
WHERE price > 50.00

UNION ALL

SELECT 'EU' AS location,
id,
name,
price,
card_name,
card_number,
transaction_date
FROM eusales
WHERE price > 50.00

ORDER BY location, id;
