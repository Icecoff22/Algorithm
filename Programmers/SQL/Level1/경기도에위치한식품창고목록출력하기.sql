SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, 
coalesce(FREEZER_YN, 'N') as FREEZER_YN
from food_warehouse
where warehouse_name like '%경기%'
order by warehouse_id