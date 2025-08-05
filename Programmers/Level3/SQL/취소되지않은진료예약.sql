SELECT a.APNT_NO, p.PT_NAME, p.PT_NO, a.MCDP_CD, d.DR_NAME, a.APNT_YMD from APPOINTMENT a
left outer join patient p on p.pt_no = a.pt_no
left outer join doctor d on d.dr_id = a.mddr_id
where a.mcdp_cd = 'CS' 
and date(a.apnt_ymd) = '2022-04-13'
and a.apnt_cncl_yn = 'N'
order by a.apnt_ymd asc