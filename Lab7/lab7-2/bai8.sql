SELECT CONCAT(CAST(SUM(LAT_N) as DECIMAL(10, 2)), " ", CAST(SUM(LONG_W) as DECIMAL(10, 2))) 
FROM STATION;