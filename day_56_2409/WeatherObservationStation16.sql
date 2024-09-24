// https://www.hackerrank.com/challenges/weather-observation-station-16/problem?isFullScreen=true

SELECT ROUND(MIN(lat_n), 4)
FROM station
WHERE lat_n>38.778
