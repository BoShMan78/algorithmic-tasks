// https://www.hackerrank.com/challenges/weather-observation-station-7/problem?isFullScreen=true

SELECT DISTINCT city
FROM station
WHERE city REGEXP '[aeiou]$'
