function checkForm(form) {
	console.log(form);
	console.log(form.username);
	console.log(form.username.value);
	
	const username = form.username.value;
	
	if(username === "") {
		alert("id는 필수 입력값입니다.")
	} else {
		form.submit();
	}
	
}