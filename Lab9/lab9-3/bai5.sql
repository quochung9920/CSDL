select concat(NAME, '(', substring(OCCUPATION, 1, 1), ')')
from OCCUPATIONS
order by NAME;
select concat(
        'There are a total of ',
        cnt,
        ' ',
        lower(OCCUPATION),
        's.'
    )
from (
        select OCCUPATION,
            count(*) as cnt
        from OCCUPATIONS
        group by OCCUPATION
    ) a
order by cnt;