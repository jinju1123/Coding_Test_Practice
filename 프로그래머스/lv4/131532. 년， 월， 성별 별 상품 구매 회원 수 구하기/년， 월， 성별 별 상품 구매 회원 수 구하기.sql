--   SELECT TO_CHAR(S.SALES_DATE, 'YYYY') AS YEAR
--        , TO_CHAR(S.SALES_DATE, 'FMMM') AS MONTH
--        , I.GENDER 
--        , COUNT(DISTINCT I.USER_ID) AS USERS
--     FROM USER_INFO I, ONLINE_SALE S
--    WHERE I.USER_ID = S.USER_ID
--      AND I.GENDER IS NOT NULL
-- GROUP BY TO_CHAR(S.SALES_DATE, 'YYYY') 
--        , TO_CHAR(S.SALES_DATE, 'FMMM') 
--        , I.GENDER 
-- ORDER BY 1, 2, 3


  SELECT YEAR
       , MONTH
       , GENDER
       , COUNT(DISTINCT USER_ID) AS USERS
    FROM (SELECT TO_CHAR(S.SALES_DATE,'YYYY') AS YEAR,
                 TO_NUMBER(TO_CHAR(SALES_DATE,'MM')) AS MONTH,
                 I.GENDER, 
                 I.USER_ID 
            FROM USER_INFO I, ONLINE_SALE S
           WHERE I.USER_ID = S.USER_ID 
             AND I.GENDER IS NOT NULL)
GROUP BY YEAR, MONTH, GENDER
ORDER BY YEAR, MONTH, GENDER