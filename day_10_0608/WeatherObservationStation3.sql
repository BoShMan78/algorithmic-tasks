// https://www.hackerrank.com/challenges/weather-observation-station-3/problem?isFullScreen=true

SELECT DISTINCT city
FROM station
WHERE id%2=0
