SELECT id,
    m.age,
    min_galleons,
    m.power
FROM wands wa
    LEFT JOIN wands_property wp ON wa.code = wp.code
    RIGHT JOIN (
        SELECT age,
            MIN(coins_needed) min_galleons,
            power
        FROM wands w
            LEFT JOIN wands_property wp ON w.code = wp.code
        WHERE is_evil != 1
        GROUP BY 1,
            3
    ) m ON m.min_galleons = wa.coins_needed
    AND m.power = wa.power
    AND m.age = wp.age
ORDER BY 4 DESC,
    2 DESC;