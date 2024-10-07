// https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=true

SELECT country.continent,
FLOOR (AVG(city.population)) AS avg_cty_population
FROM city
JOIN country ON city.countrycode = country.code
GROUP BY country.continent
