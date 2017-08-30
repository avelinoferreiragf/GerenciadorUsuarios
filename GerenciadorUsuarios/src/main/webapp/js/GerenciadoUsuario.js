$(document).ready(function() {
	$("#btnInserir").click(novoUsuario);
});

$(document).on({
    ajaxStart: function() { $("body").addClass("loading");},
    ajaxStop: function() { $("body").removeClass("loading"); }    
});
var novoUsuario = function() {
	var loginUsuario = $("#login").val();
	var nomeUsuario = $("#nome").val();
	var emailUsuario = $("email").val();
	var usuarioJSON = JSON.stringify({id: null, login : loginUsuario, nome : nomeUsuario, email: emailUsuario});
	$.ajax({
		url: "rest/usuario/novo"
		, type:"PUT"
		, contentType : "application/json"
		, dataType : "json"
		, data: usuarioJSON
		, success: function(data) {
			alert(data.responseText);
      	}
		, error: function(data) {
			alert(data.responseText);
      	}
	});
};

