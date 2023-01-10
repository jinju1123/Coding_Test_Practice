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
	<div class="container"  align="center">
		<div class="mt-4 p-5 bg-primary text-white rounded">
			<h3>게시글 상세</h3>		
		</div>
	</div>		

	<div class="container mt-3" align="center">
		<form action="updateBoard.do" method="post">
			<input name="ubd_no" type="hidden" value="${board.ubd_no}" />
			<div class="input-group mb-3">
  				<input type="text" class="form-control" name="ubd_subject" value="${ board.ubd_subject }">
			</div>
			<div class="input-group mb-3">
  				<input type="text" class="form-control" name="member_nick" value="${ board.member_nick }" disabled>
			</div>
			<div class="input-group mb-3">
			  <textarea class="form-control"  name="ubd_content" rows="15" >${ board.ubd_content }</textarea>
			</div>	
			<div class="input-group mb-3">

  				<input type="text" class="form-control" name="ubd_regdate" value="${board.ubd_regdate }" disabled>
			</div>
			<div class="input-group mb-3">
  				<input type="text" class="form-control" name="ubd_readcount" value="${ board.ubd_readcount }" disabled>
			</div>
			
			<div class="container" align="center">
				<input type="submit" class="btn btn-primary mt-3" value="게시글수정"/>
				<a href="deleteBoard.do?ubd_no=${board.getUbd_no()}" class="btn btn-primary mt-3">게시글삭제</a>
				<a href="getBoardList.do" class="btn btn-primary mt-3">게시글목록</a>			
			</div>
		</form>			
	</div>

	<script>
		function deleteBoard() {
			if(confirm("자료를 삭제하겠습니까?")) {
		    	self.location.href = "deleteBoard.do?ubd_no=${ board.ubd_no }";
		    }
		}
	</script>
</body>
</html>
