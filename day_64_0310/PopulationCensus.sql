// https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true

SELECT SUM(city.population)
FROM city
LEFT JOIN country
ON city.countrycode = country.code
WHERE country.continent = 'Asia'
