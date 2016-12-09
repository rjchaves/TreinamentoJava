
function consultarCategoria(){
	
	var idCategoria = $('#cod-categoria').val();
	var operacao = '/ControleAPI/categoria/' + idCategoria;
	
	$.ajax({
		url: operacao
	}).done(function(data){
		console.log(data);
		if(data.mensagem != null && data.mensagem != ''){
			$('#descricao-categoria').html(data.mensagem);
		}else{
			$('#descricao-categoria').html(data.descricao);
		}
	});
}

function cadastrarCategoria(){
	var descricao = $("#descricao-categoria").val();
	var categoriaDTO = new Object();
	var operacao = "/ControleAPI/categoria/criarCategoria" 
		
	categoriaDTO.descricao = descricao;

	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(categoriaDTO),
		contentType: "application/json"
	}).done(function (data){
		var mensagem = '';
		var titulo = '';
		if(data.mensagem != undefined && data.mensagem != null && data.mensagem != ''){
			titulo = 'Atenção';
			mensagem = data.mensagem;
		}else{
			titulo = "Sucesso";
			mensagem = "Categoria cadastrado com sucesso.";
		}
		
		mostrarModal(titulo, mensagem);
	});
}



function listarCategorias(){
	var operacao = "/ControleAPI/categoria/listarCategorias" 
		
	$.ajax({
		url: operacao
	}).done(function (data){
		var lista = data;
		var linhaTabela = '';
		
		for(i = 0; i < lista.length; i++){
			linhaTabela = linhaTabela + '<tr>';
			
			linhaTabela = linhaTabela + '<td>';
			linhaTabela = linhaTabela + lista[i].id;
			linhaTabela = linhaTabela + '</td>';
			
			linhaTabela = linhaTabela + '<td>';
			linhaTabela = linhaTabela + lista[i].descricao;
			linhaTabela = linhaTabela + '</td>';
			
			linhaTabela = linhaTabela + "</tr>";
		}
		$('#lista').empty();
		$('#lista').append(linhaTabela);
	})
	
	
}