// https://www.hackerrank.com/challenges/weather-observation-station-8/problem?isFullScreen=true

SELECT DISTINCT city
FROM station
WHERE city REGEXP '^[AEIOU]' AND city REGEXP '[aeiou]$'
