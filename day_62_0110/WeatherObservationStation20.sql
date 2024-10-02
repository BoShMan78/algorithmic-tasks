// https://www.hackerrank.com/challenges/weather-observation-station-20/problem?isFullScreen=true

SET @row_number = 0;
SET @total_rows = (SELECT COUNT(*) FROM station);

SELECT ROUND(AVG(lat_n), 4) AS median_lat_n
FROM (
    SELECT lat_n
    FROM (
        SELECT lat_n, @row_number := @row_number + 1 AS row_num
        FROM station
        ORDER BY lat_n
    ) AS ordered_lat
    WHERE row_num IN (FLOOR((@total_rows + 1) / 2), CEIL((@total_rows + 1) / 2))
) AS median_values;

