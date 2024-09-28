// https://www.hackerrank.com/challenges/weather-observation-station-18/problem?isFullScreen=true

SELECT ROUND(
    (ABS(MAX(lat_n) - MIN(lat_n)) + ABS(MAX(long_w) - MIN(long_w))), 4)
FROM station
