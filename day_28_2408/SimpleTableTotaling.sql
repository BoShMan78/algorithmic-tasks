// https://www.codewars.com/kata/5809575e166583acfa000083/train/sql

SELECT
rank() OVER (ORDER BY SUM(points) DESC) AS rank,
CASE 
  WHEN clan = '' THEN '[no clan specified]'
  ELSE clan
END AS clan,
SUM(points) AS total_points,
COUNT(*) AS total_people

FROM people
GROUP BY
  CASE
    WHEN clan = '' THEN '[no clan specified]'
    ELSE clan
  END
ORDER BY
  total_points DESC;
