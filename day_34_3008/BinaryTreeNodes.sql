// https://www.hackerrank.com/challenges/binary-search-tree-1/problem?isFullScreen=true

SELECT n,
CASE
    WHEN p IS NULL THEN 'Root'
    WHEN n NOT IN(SELECT p FROM bst WHERE p IS NOT NULL) THEN 'Leaf'
    ELSE 'Inner'
END
FROM bst
ORDER BY n
