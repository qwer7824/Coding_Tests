SELECT USER_ID,PRODUCT_ID 
from ONLINE_SALE 
GROUP BY USER_ID, PRODUCT_ID
HAVING count(*) >= 2
ORDER BY USER_ID, PRODUCT_ID DESC