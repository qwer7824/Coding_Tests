-- 코드를 입력하세요
SELECT MCDP_CD as 진료과코드,count(MCDP_CD) as 5월예약건수 from APPOINTMENT
where MONTH(APNT_YMD) = 5
GROUP BY MCDP_CD
ORDER BY count(MCDP_CD) asc , MCDP_CD asc