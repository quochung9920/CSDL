select name
from (
        select students.id as s_id,
            name,
            salary
        from students
            left join packages on students.id = packages.id
    ) as exp1
    inner join (
        select friends.id sf_id,
            friends.friend_id,
            salary
        from friends
            left join packages on friends.friend_id = packages.id
    ) as exp2 on exp1.s_id = exp2.sf_id
where exp2.salary > exp1.salary
order by exp2.salary;