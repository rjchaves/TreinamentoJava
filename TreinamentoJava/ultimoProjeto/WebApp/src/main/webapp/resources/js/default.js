

function abrirTelaCadastroCategoria(){
	var url = "/WebApp/categoria/cadastro-categoria.html";
	
	$.get(url, '', function(data){
		$('#conteudo-principal').html(data);
	})
}

function abrirTelaListarCategoria(){
	var url = "/WebApp/categoria/pesquisa-categoria.html";
	
	$.get(url, '', function(data){
		$('#conteudo-principal').html(data);
	})
}

function abrirTelaCadastrarUsuario(){
	var url = "/WebApp/usuario/cadastro-usuario.html";
	
	$.get(url, '', function(data){
		$('#conteudo-principal').html(data);
	})
}

function abrirTelaCadastrarFilme(){
	var url = "/WebApp/filme/cadastro-filme.html";
	
	$.get(url, '', function(data){
		$('#conteudo-principal').html(data);
	})
}

function mostrarModal(titulo, mensagem){
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	
	$('#modal-mensagens').modal('show');
}