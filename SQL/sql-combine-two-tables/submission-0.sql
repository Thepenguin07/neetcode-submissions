-- Write your query below
select a.first_name,a.last_name,b.city,b.state from person as a left join address as b on a.person_id=b.person_id; 