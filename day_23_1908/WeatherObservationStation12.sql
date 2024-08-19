// https://www.hackerrank.com/challenges/weather-observation-station-12/problem?isFullScreen=true

SELECT DISTINCT city
FROM station
WHERE NOT city REGEXP '^[AEIOU]' AND 
NOT city REGEXP '[aeiou]$'
