/**
 * 
 */

//获取session
function getSession(role){
	var that=this;
	axios.post('../../getSession',role).then(function (res) {
		if(res.data[0] !=null){
		that.session_vue.login=res.data[0][0];
		sessionStorage.removeItem("studentNumber");
		sessionStorage.setItem("studentNumber",that.session_vue.login.stuNum);
	}else{
		alert("未登录");
		window.location.replace('../../')
	} 
    
    }).catch(function (error) {
    alert(error);
    });
}

//用户退出
function exitSys(){
	var that=this;
	axios.get('../../exitSys?exit=student').then(function (res) {
	  if(res.data.result==true){
		  window.location.replace("../../")
		  console.log("注销成功")
	  }
	  else{
		  alert("注销失败");
		  window.location.reload();
	  }
	 
    }).catch(function (error) {
    alert(error);
    });
}

var session_vue=new Vue({
	el:"#session_app",
	data:{
		login:{
			name:""
		}
	}

});
