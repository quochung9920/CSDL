
SELECT ROUND(LAT_N,4) 
FROM STATION 
WHERE LAT_N < 137.2345 
ORDER BY ROUND(LAT_N,4) DESC LIMIT 1