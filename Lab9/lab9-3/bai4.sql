SELECT h.hacker_id,
    h.name
FROM Submissions s
    LEFT JOIN Hackers h USING(hacker_id)
    LEFT JOIN Challenges c USING(challenge_id)
    LEFT JOIN Difficulty d USING(difficulty_level)
WHERE -- full score
    s.score = d.score
GROUP BY h.hacker_id,
    h.name
HAVING -- completed more than one challenge
    COUNT(s.hacker_id) > 1
ORDER BY COUNT(h.hacker_id) DESC,
    h.hacker_id ASC;