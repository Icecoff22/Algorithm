-- 코드를 입력하세요
SELECT ins.name, ins.datetime from animal_ins ins
where not exists ( select 1 from animal_outs outs where ins.animal_id = outs.animal_id)
order by datetime asc
limit 3;