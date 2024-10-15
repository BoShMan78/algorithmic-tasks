// https://www.hackerrank.com/challenges/sql-projects/problem?isFullScreen=true

WITH projectgrouped AS ( 
    SELECT start_date, 
            end_date, 
            date_sub(end_date, interval row_number() OVER (ORDER BY end_date)day) AS project_id      
    FROM projects)

SELECT MIN(start_date) AS start_date, MAX(end_date) AS end_date 
FROM projectgrouped 
GROUP BY project_id 
ORDER BY datediff(MAX(end_date), MIN(start_date)), start_date;
