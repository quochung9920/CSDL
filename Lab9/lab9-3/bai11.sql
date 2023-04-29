SELECT A.X,
    A.Y
FROM Functions AS A
    INNER JOIN Functions AS B
WHERE (A.X = B.Y)
    AND (A.Y = B.X)
    AND (A.X < A.Y)
UNION
SELECT X,
    Y
FROM Functions
GROUP BY X,
    Y
HAVING (X = Y)
    AND (COUNT(*) > 1)
ORDER BY X;