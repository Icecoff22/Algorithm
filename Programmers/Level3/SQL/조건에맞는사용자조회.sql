-- 코드를 입력하세요
SELECT u.user_id, u.nickname, concat(u.city, ' ', u.street_address1, ' ', ifnull(u.street_address2, '')) as '전체주소', concat(left(u.tlno, 3), '-', mid(u.tlno, 4, 4), '-', right(u.tlno, 4)) as '전화번호' from used_goods_user u
join (select writer_id from used_goods_board group by writer_id having count(*) >= 3) b on u.user_id = b.writer_id
order by u.user_id desc