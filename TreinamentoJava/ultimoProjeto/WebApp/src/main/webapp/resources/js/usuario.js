//$('input[name=tipo-usuario]:checked').val()
$(document).ready(function() {
	$('input[name="op-usuario"]').on('change', function() {
		if ($(this).val() == 'cliente') {
			$("#submeter-usuario").attr('onclick', 'cadastrarUsuario();');
			$("#form-funcionario").fadeOut(200);
		} else {
			$("#submeter-usuario").attr('onclick', 'cadastrarFuncionario();');
			$("#form-funcionario").fadeIn(200);
		}
	});
	
	 $('input[type=radio][name=bedStatus]').change(function() {
	        if (this.value == 'cliente') {
	        	alert("cliente");
	        }
	        else if (this.value == 'funcionario') {
	        	alert("funcionarios");
	        }
	    });
});

function cadastrarUsuario() {
	if (testaCamposUsuario()) {
		
		var operacao = "/ControleAPI/usuario/cadastrarcliente"
		var usuarioDTO = getUsuarioDTO();
		
		$.ajax({
			method : "POST",
			url : operacao,
			data : JSON.stringify(usuarioDTO),
			contentType : "application/json"
		}).done(
				function(data) {
					var mensagem = '';
					var titulo = '';
					if (data.mensagem != undefined && data.mensagem != null
							&& data.mensagem != '') {
						titulo = 'Atenção';
						mensagem = data.mensagem;
					} else {
						titulo = "Sucesso";
						mensagem = "Usuario cadastrado com sucesso";
					}

					mostrarModal(titulo, mensagem);
				});
	}
}

function cadastrarFuncionario(){
	if (testaCamposUsuario() && testaCamposFuncionario()) {
		
		var funcionarioDTO =  getFuncionarioDTO();
		var operacao = "/ControleAPI/usuario/cadastrarfuncionario"
		
		$.ajax({
			method : "POST",
			url : operacao,
			data : JSON.stringify(funcionarioDTO),
			contentType : "application/json"
		}).done(
				function(data) {
					alert("data");
					var mensagem = '';
					var titulo = '';
					if (data.mensagem != undefined && data.mensagem != null
							&& data.mensagem != '') {
						titulo = 'Atenção';
						mensagem = data.mensagem;
					} else {
						titulo = "Sucesso";
						mensagem = "Funcionário cadastrado com sucesso";
					}

					mostrarModal(titulo, mensagem);
				});
	}
}

function getUsuarioDTO(){
	var usuarioDTO = new Object();
	usuarioDTO.nome = $("#nome-usuario").val();
	usuarioDTO.telefone = $("#telefone-usuario").val();
	usuarioDTO.celular = $("#celular-usuario").val();
	usuarioDTO.email = $("#email-usuario").val();
	usuarioDTO.endereco = new Object();
	usuarioDTO.endereco.rua = $("#rua-usuario").val();;
	usuarioDTO.endereco.numero = $("#numero-rua-usuario").val();
	usuarioDTO.endereco.bairro = $("#bairro-usuario").val();
	usuarioDTO.endereco.cidade = $("#cidade-usuario").val();
	usuarioDTO.endereco.estado = $("#estado-usuario").val();
	usuarioDTO.endereco.cep = $("#cep-usuario").val();
	usuarioDTO.endereco.complemento = $("#complemento-rua-usuario").val();
	
	return usuarioDTO;
}

function getFuncionarioDTO(){
	
	var funcionarioDTO = new Object();
	funcionarioDTO.login = $("#login-funcionario").val();
	funcionarioDTO.senha = $("#senha-funcionario").val();
	funcionarioDTO.salario = $("#salario-funcionario").val();
	funcionarioDTO.usuario = getUsuarioDTO();
	return funcionarioDTO;
}




function testaCamposUsuario() {
	var vazios = $(".input-usuario").filter(function() {
		return ($(this).val() == '');
	}).get();

	if (vazios.length > 0) {
		var titulo = "Erro";
		var mensagem = "Certifique-se de ter inserido todos os campos";
		mostrarModal(titulo, mensagem);
		return false;
	}
	return true;
}


function testaCamposFuncionario() {
	var vazios = $(".input-funcionario").filter(function() {
		return ($(this).val() == '');
	}).get();
	if(!testaCamposUsuario()){
		return false;
	}
	else if (vazios.length > 0) {
		var titulo = "Erro";
		var mensagem = "Certifique-se de ter inserido todos os campos";
		mostrarModal(titulo, mensagem);
		return false;
	}else if(isNaN(Number($("#salario-funcionario").val()))){
		var titulo = "Erro";
		var mensagem = "Certifique-se de inserir um valor correto para salário";
		mostrarModal(titulo, mensagem);
		return false;
	}
	return true;
}