-- 코드를 입력하세요
SELECT a.BOOK_ID,b.AUTHOR_NAME,
DATE_FORMAT(a.PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
FROM BOOK a
LEFT OUTER JOIN AUTHOR b
ON a.AUTHOR_ID = b.AUTHOR_ID
Where a.CATEGORY = "경제"
ORDER BY a.PUBLISHED_DATE