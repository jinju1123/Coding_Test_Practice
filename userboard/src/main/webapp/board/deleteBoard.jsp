<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
   <title>Spring Framework</title>
   <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">   
   <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" 
      integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" 
      crossorigin="anonymous">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>   
</head>
<body>
  <div class="container" align="center">
		<div class="mt-4 p-5 bg-primary text-white rounded">
			<h3>게시글 삭제</h3>
		
		</div>
		<br>
		
		<form action="deleteBoard.do" method="post">
			<input type="hidden" name="ubd_no" value="${ board.getUbd_no()}">
			<input type="hidden" name="curPage" value="${searchVO.getCurPage()}">
			<input type="hidden" name="rowSizePerPage" value="${searchVO.getRowSizePerPage()}">
			<input type="hidden" name="searchCategory" value="${searchVO.getSearchCategory()}">
			<input type="hidden" name="searchType" value="${searchVO.getSearchType()}">
			<input type="hidden" name="searchWord" value="${searchVO.getSearchWord()}">
			<button type="submit" class="btn btn-danger text-white"><b>${board.getUbd_no() }. 제목 "${board.getUbd_subject()}"</b>를 삭제하겠습니까?</button>
			<a href="getBoardList.do" class="btn btn-info text-white ms-3">게시글목록</a>
		</form>
	</div>		   
</body>
</html>   