// https://www.hackerrank.com/challenges/weather-observation-station-9/problem?isFullScreen=true

SELECT DISTINCT city
FROM station
WHERE NOT city REGEXP '^[AEIOU]' 
