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
			<h3>게시글 상세보기</h3>		
		</div>
	</div>		

	<div class="container mt-3" align="center">

			<table>
						<tr>
						<th>제목(추천 ${ board.getUbd_like_cnt()} )</th>
						<td>${ board.getUbd_subject() }</td>
						</tr>
						<tr>
						<th>작성자</th>
						<td>${ board.getMember_nick() }</td>
						</tr>
						<tr>
						<th>내용</th>
						<td>${ board.getUbd_content() }</td>
						</tr>
						<tr>
						<th>등록일</th>
						<td>${ board.getUbd_regdate() }</td>
						</tr>
						<tr>
						<th>조회수</th>
						<td>${ board.ubd_readcount }</td>
						</tr>								
			</table>

			<a href="like.do?ubd_no=${ board.getUbd_no() }">추천</a>
			
			<div class="container" align="center">
				<a href="updateBoard.do?ubd_no=${board.getUbd_no()}" class="btn btn-warning mt-3">게시글수정</a>
				<a href="getBoardList.do" class="btn btn-primary mt-3">게시글목록</a>	
				<a href="#" onclick="deleteBoard()" class="btn btn-danger mt-3">게시글삭제</a>
			</div>
		
	</div>
	
	<script>
		function deleteBoard() {
			if(confirm("이 게시글을 삭제하겠습니까?")) {
		    	self.location.href = "deleteBoard.do?ubd_no=${ board.ubd_no }";
		    }
		}
	</script>
</body>
</html>
