-- 코드를 입력하세요

  SELECT ANIMAL_ID, NAME
    FROM ANIMAL_OUTS
   MINUS
  SELECT O.ANIMAL_ID, O.NAME
    FROM ANIMAL_INS I, ANIMAL_OUTS O
   WHERE I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY ANIMAL_ID