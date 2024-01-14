-- 코드를 입력하세요
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE,"%Y-%m-%d") as PUBLISHED_DATE
from BOOK 
where category="인문" AND YEAR(PUBLISHED_DATE) = "2021"
ORDER BY PUBLISHED_DATE ASC