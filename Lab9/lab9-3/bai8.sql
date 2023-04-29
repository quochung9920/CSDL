select hacker_id,
    name,
    sum(max_score) total_score
from (
        select scl.hacker_id,
            name,
            challenge_id,
            max(score) max_score
        from submissions scl
            left join hackers hcl on scl.hacker_id = hcl.hacker_id
        group by 1,
            2,
            3
    ) score_max
group by 1,
    2
having total_score != 0
order by 3 desc,
    1;