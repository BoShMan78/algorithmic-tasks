// https://www.hackerrank.com/challenges/draw-the-triangle-1/problem?isFullScreen=true

WITH RECURSIVE pattern (stars, level) AS (
    SELECT REPEAT('* ', 20), 20
    UNION ALL
    SELECT REPEAT('* ', level - 1), level - 1
    FROM pattern
    WHERE level > 1
)
SELECT stars 
FROM pattern;
