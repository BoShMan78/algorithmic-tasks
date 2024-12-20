// https://www.codewars.com/kata/58094559c47d323ebd000035/train/sql

SELECT 
  p.id, 
  p.name, 
  COUNT(s.id) AS sale_count,
  RANK() OVER (ORDER BY COUNT(s.id) DESC) AS sale_rank
FROM people p
JOIN sales s ON s.people_id = p.id
GROUP BY p.id
ORDER BY sale_count DESC
