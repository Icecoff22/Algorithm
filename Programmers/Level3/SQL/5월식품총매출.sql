-- 코드를 입력하세요
SELECT fp.product_id, fp.product_name, sum(fp.price * fo.amount) as total_price from food_product fp
join food_order fo on fp.product_id = fo.product_id
where date_format(fo.produce_date, '%Y-%m') = '2022-05'
group by fp.product_id, fp.product_name
order by total_price desc, fp.product_id asc