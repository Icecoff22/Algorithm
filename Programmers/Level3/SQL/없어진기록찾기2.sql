-- 코드를 입력하세요
SELECT outs.animal_id as ANIMAL_ID, outs.name as NAME from animal_ins ins
right join animal_outs outs on ins.animal_id = outs.animal_id
where ins.datetime is null
order by ins.animal_id