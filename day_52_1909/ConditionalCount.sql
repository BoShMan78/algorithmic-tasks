// https://www.codewars.com/kata/5816a3ecf54413a113000074/train/sql

WITH MonthlyPayments AS (
    SELECT 
        EXTRACT(MONTH FROM payment_date) AS month,
        COUNT(*) AS total_count,
        SUM(amount) AS total_amount
    FROM payment
    GROUP BY EXTRACT(MONTH FROM payment_date)
),
MikePayments AS (
    SELECT 
        EXTRACT(MONTH FROM payment_date) AS month,
        COUNT(*) AS mike_count,
        SUM(amount) AS mike_amount
    FROM payment
    WHERE staff_id = 1
    GROUP BY EXTRACT(MONTH FROM payment_date)
),
JonPayments AS (
    SELECT 
        EXTRACT(MONTH FROM payment_date) AS month,
        COUNT(*) AS jon_count,
        SUM(amount) AS jon_amount
    FROM payment
    WHERE staff_id = 2
    GROUP BY EXTRACT(MONTH FROM payment_date)
)

SELECT 
    mp.month,
    mp.total_count,
    mp.total_amount,
    COALESCE(mp_m.mike_count, 0) AS mike_count,
    COALESCE(mp_m.mike_amount, 0) AS mike_amount,
    COALESCE(jp.jon_count, 0) AS jon_count,
    COALESCE(jp.jon_amount, 0) AS jon_amount
FROM MonthlyPayments mp
LEFT JOIN MikePayments mp_m ON mp.month = mp_m.month
LEFT JOIN JonPayments jp ON mp.month = jp.month
ORDER BY mp.month;
