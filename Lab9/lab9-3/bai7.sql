with cte as (
    select c.hacker_id as hacker,
        h.name as name,
        count(*) as challenges_created
    from hackers h
        join challenges c on h.hacker_id = c.hacker_id
    group by hacker,
        name
    order by challenges_created desc
),
cte2 as (
    select *,
        count(*) over(partition by challenges_created) as num_hackers
    from cte
)
select hacker,
    name,
    challenges_created
from cte2
where challenges_created = (
        select max(challenges_created)
        from cte
    )
    or num_hackers = 1
order by challenges_created desc,
    hacker;