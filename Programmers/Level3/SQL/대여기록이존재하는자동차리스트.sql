-- 코드를 입력하세요
SELECT distinct(c.CAR_ID) from car_rental_company_car c
join car_rental_company_rental_history ch on c.car_id = ch.car_id
where c.car_type = '세단' and month(ch.start_date) = 10
order by car_id desc