-- 코드를 입력하세요
SELECT PRODUCT_CODE
      ,COUNT(PRODUCT_CODE) 
FROM 
(
SELECT PRODUCT_ID
     , SUBSTR(PRODUCT_CODE, 1, 2) AS PRODUCT_CODE
     , PRICE
FROM PRODUCT 
)
GROUP BY PRODUCT_CODE
ORDER BY PRODUCT_CODE