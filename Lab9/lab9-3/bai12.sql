SELECT *
FROM (
        SELECT c.contest_id,
            c.hacker_id,
            c.name,
            SUM(A) A,
            SUM(B) B,
            SUM(C) C,
            SUM(D) D
        FROM Contests c
            LEFT JOIN Colleges co ON co.contest_id = c.contest_id
            LEFT JOIN Challenges ch ON ch.college_id = co.college_id
            LEFT JOIN (
                SELECT challenge_id,
                    SUM(v.total_views) C,
                    SUM(v.total_unique_views) D
                FROM View_Stats v
                GROUP BY challenge_id
            ) E ON E.challenge_id = ch.challenge_id
            LEFT JOIN (
                SELECT challenge_id,
                    SUM(s.total_submissions) A,
                    SUM(s.total_accepted_submissions) B
                FROM Submission_Stats s
                GROUP BY challenge_id
            ) F ON F.challenge_id = ch.challenge_id
        GROUP BY c.contest_id,
            c.hacker_id,
            c.name
        ORDER BY c.contest_id
    ) AS G
WHERE A != 0
    AND B != 0
    AND C != 0
    AND D != 0;