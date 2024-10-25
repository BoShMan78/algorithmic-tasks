// https://www.hackerrank.com/challenges/draw-the-triangle-2/problem?isFullScreen=true

WITH RECURSIVE pattern (stars, level) AS (
    SELECT CAST(REPEAT('* ', 1) AS CHAR(255)), 1
    UNION ALL
    SELECT CAST(REPEAT('* ', level + 1) AS CHAR(255)), level + 1
    FROM pattern
    WHERE level < 20
)
SELECT stars
FROM pattern;
