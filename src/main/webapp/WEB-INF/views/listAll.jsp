<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>제목</th>
			<th>내용</th>
			<th>날짜</th>
		</tr>
		
		<tbody>
			<c:forEach items = "${selectList}" var ="list">
				<tr>
					<td>${list.no }</td>
					<td>${list.id }</td>
					<td>${list.name }</td>
					<td>${list.title }</td>
					<td>${list.contents }</td>
					<td>${list.date }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form id="write-main">
	<input type="text" id="write-do-id" name="write-do-id" placeholder="내용을 입력하세요." />
	<input type="text" id="write-do-name" name="write-do-name" placeholder="내용을 입력하세요." />
	<input type="text" id="write-do-title" name="write-do-title" placeholder="내용을 입력하세요." />
	<input type="text" id="write-do-contents" name="write-do-contents" placeholder="내용을 입력하세요." />
	<button type="button" id="write-uproad">enter</button>
	</form>
	
	<script>
		var id = "";
		var name = "";
		var title = "";
		var contents = "";
		
		console.log("test js");
		
		$("#write-uproad").on("click", function(){
			
			console.log("button click test");
			
			id= $("#write-do-id").val();
			name= $("#write-do-name").val();
			title= $("#write-do-title").val();
			contents= $("#write-do-contents").val();
			
			console.log(id,name,title,contents);
			
			var data ={
					id : id,
					name : name,
					title : title,
					contents : contents
					}
			
			console.log(data);
			
			$.ajax({
				type: "POST",
				url: "/practice/insertList.do",
				data: data,
				dataType: "json",
				success: function(res){
					location.reload();
					console.log("성공");
				},
				error: function(xhr){
					console.log(xhr.status);
				}
			})
		});
		
	</script>
</body>
</html>