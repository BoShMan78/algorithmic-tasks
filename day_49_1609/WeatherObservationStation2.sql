// https://www.hackerrank.com/challenges/weather-observation-station-2/problem?isFullScreen=true

SELECT 
    ROUND(SUM(lat_n), 2), 
    ROUND(SUM(long_w), 2)
FROM station
