// https://www.hackerrank.com/challenges/harry-potter-and-wands/problem?isFullScreen=true

SELECT w.id, p.age, w.coins_needed, w.power
FROM wands w
JOIN wands_property p ON w.code = p.code
WHERE p.is_evil = 0
AND w.coins_needed = (
    SELECT MIN(w2.coins_needed)
    FROM wands w2
    JOIN wands_property p2 ON w2.code = p2.code
    WHERE p2.is_evil = 0
    AND w2.power = w.power
    AND p2.age = p.age
)
ORDER BY w.power DESC, p.age DESC
