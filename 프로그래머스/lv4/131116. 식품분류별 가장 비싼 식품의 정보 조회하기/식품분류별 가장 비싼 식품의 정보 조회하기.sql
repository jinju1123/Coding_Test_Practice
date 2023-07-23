-- 코드를 입력하세요

  SELECT CATEGORY
       , PRICE
       , PRODUCT_NAME
    FROM FOOD_PRODUCT
   WHERE PRICE IN 
   (
    SELECT MAX(PRICE)
    FROM FOOD_PRODUCT 
    WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
    GROUP BY CATEGORY
   )
   AND CATEGORY IN ('과자', '국', '김치', '식용유')
ORDER BY 2 DESC
