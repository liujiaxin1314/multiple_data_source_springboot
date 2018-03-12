//$(function(){
//	$.get('http://localhost:8080/multiple_data_source_springboot/user/queryUser',{"user_id":5},function(result){
//		if(result.errorCode == 'SUCCESS'){
//			alert("恭喜你！");
//		}
//	},'json');
//});

function textMysql(){
	$.get('http://localhost:8080/multiple_data_source_springboot/user/queryUser',{"user_id":5},function(result){
		if(result.errorCode == 'SUCCESS'){
			alert("恭喜你！mysql!!!");
		}
	},'json');
}

function textOracle(){
	$.get('http://localhost:8080/multiple_data_source_springboot/company/queryCompany',{"compid":53292600000289},function(result){
		if(result.errorCode == 'SUCCESS'){
			alert("恭喜你！oracle!!!");
		}
	},'json');
}