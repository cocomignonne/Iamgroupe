<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>급여관리 메인페이지</title>
  
  <c:set var="root" value="${pageContext.request.contextPath}"/>
  
  <!-- Favicon -->
  <link rel="shortcut icon" href="../resources/img/svg/looo.png" type="image/x-icon">
  <!-- Custom styles -->
  <link rel="stylesheet" href="../resources/css/style.min.css">

<script>

</script>
<style>

</style>

</head>
<body>

<!-- 메인 메뉴바(좌측 사이드) -->
<%@ include file="/WEB-INF/views/common/headerSide.jsp" %>

<!-- ! Main -->
<main class="main users chart-page" id="skip-target">
	<div class="container">
	       
		<hr>     
		<div style="height: 40px; text-align: left;">
			<h1>급여관리 메인페이지</h1> <br> 오늘 날짜 <h4 style="color: rgb(50, 48, 48); font-weight: 600;" id="currentDate"></h4>
		</div>
		<br>
		<br>
		<hr>

		<div class="row stat-cards">

		
          <div class="col-md-6 col-xl-3">
            <article class="stat-cards-item">
              <div class="stat-cards-icon primary">
                <i data-feather="bar-chart-2" aria-hidden="true"></i>
              </div>
              <div class="stat-cards-info">
                <p class="stat-cards-info__num">김철수 대리</p>
                <p class="stat-cards-info__title">개발1실 웹개발2팀</p>
                <hr>
              </div>
            </article>
          </div>
          
          <div class="col-md-12 col-xl-9">
            <article class="stat-cards-item">
              <div class="stat-cards-icon warning">
                <i data-feather="file" aria-hidden="true"></i>
              </div>
              <div class="stat-cards-info">
                <p class="stat-cards-info__num">급여지급 현황</p>
                <p class="stat-cards-info__title">급여일 : 매월 25일</p>
                <p class="stat-cards-info__progress">
                  <span class="stat-cards-info__profit success">
                    <i data-feather="trending-up" aria-hidden="true"></i>다음 급여일까지 : 9일
                  </span>
                </p>
                <hr>
                
              <div class="users-table table-wrapper">
	              <table class="posts-table">
	                <thead>
	                  <tr class="users-table-info">
	                    <th>월</th>
	                    <th>월급여</th>
	                    <th>상여금</th>
	                    <th>공제액</th>
	                    <th>최종지급액</th>
	                  </tr>
	                </thead>
	                <tbody>
	                
	                  <tr>
	                    <td>
	                      1월
	                    </td>
	                    <td>
	                      <span class="badge-disabled">2,000,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-pending">400,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-trashed">600,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-active">1,800,000원</span>
	                    </td>
	                  </tr>
	                  
	                  <tr>
	                    <td>
	                      2월
	                    </td>
	                    <td>
	                      <span class="badge-disabled">2,000,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-pending">900,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-trashed">600,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-active">2,300,000원</span>
	                    </td>
	                  </tr>
	                  
	                 <tr>
	                    <td>
	                      3월
	                    </td>
	                    <td>
	                      <span class="badge-disabled">2,000,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-pending">400,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-trashed">600,000원</span>
	                    </td>
	                    <td>
	                      <span class="badge-active">1,800,000원</span>
	                    </td>
	                  </tr>

	                </tbody>
	              </table>
            </div>
                
                
                
              </div>
            </article>
          </div>
          

        </div>


	</div>
</main>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>


<script type="text/javascript">
	let today = new Date();
	let year = today.getFullYear(); 
	let month = today.getMonth() + 1
	let day = today.getDate();

	document.getElementById("currentDate").innerHTML = year + '-' + (("00"+month.toString()).slice(-2)) + '-' + (("00"+day.toString()).slice(-2));
	document.getElementById("currentDate2").innerHTML = year + '-' + (("00"+month.toString()).slice(-2)) + '-' + (("00"+day.toString()).slice(-2));
</script>

	<!-- Custom scripts -->
	<script src="${root}/resources/js/script.js"></script>
</body>

</html>