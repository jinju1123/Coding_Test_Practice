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
			<h3>게시글 등록</h3>
		</div>
	</div>
	
	<div class="container mt-5 justify-content-center">
		<form action="insertBoard.do" method="post" enctype="multipart/form-data">
			<div class="modal-content">				
				<div class="modal-header bg-primary text-white">
					<h1 class="motal-title fs-5" id="staticBackdropLabel">글등록하기</h1>
				</div> <!-- modal-header -->
				
					<div class="input-group mb-3">
						<input type="text" name="member_nick" class="form-control" id="member_nick" placeholder="유저 닉네임" readonly>
					</div>
					
					<div class="input-group mb-3">
						<input type="text" name="ubd_dogType" class="form-control" id="ubd_dogType" required placeholder="견종을 입력하세요">
					</div>
					<div class="input-group mb-3">
						<input type="text" name="ubd_subject" class="form-control" id="ubd_subject" required placeholder="제목을 입력하세요">
					</div>
					<div class="input-group mb-3">
					  <textarea class="form-control"  name="ubd_content" rows="15" required placeholder="내용을 입력하세요"></textarea>
					</div>
					<div class="input-group mb-3">
						<input type="date" name="date" id="currentDate">
					</div>
					<div class="input-group mb-3">
					  <input type="file" class="form-control" name="uploadFile" id="uploadFile" aria-describedby="uploadFile" aria-label="Upload">
					</div>
					
				</div> 
					
				<div class="modal-footer">	
				<input type="hidden" name="uploadFile" value=""/>
				    <input type="submit" class="btn btn-primary" value="등록"/>
				    <button type="button" class="btn btn-primary" onclick="history.go(-1)">취소</button>					
				</div> 
			</div> 
		</form>	
	</div>
	<script>
 	 document.getElementById('currentDate').value = new Date().toISOString().substring(0, 10);
	</script>
</body>
</html>		