-- 코드를 입력하세요
SELECT ins.animal_id as ANIMAL_ID, ins.name as NAME from animal_ins ins
left join animal_outs outs on ins.animal_id = outs.animal_id
where outs.datetime is not null
order by timestampdiff(day, ins.datetime, outs.datetime) desc
limit 2