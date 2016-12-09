$(document).ready(function() {
	var operacao = "/ControleAPI/categoria/listarCategorias" 
	var listaCategorias = $("#categoria-filme");
		
		$.ajax({
			url: operacao
		}).done(function (data){
			var lista = data;
			var linhaTabela = '';
			
			for(i = 0; i < lista.length; i++){
				var option  = $('<option>');
				option.val(lista[i].id);
				option.text(lista[i].descricao);
				listaCategorias.append(option);
			}
		})
});

function cadastrarFilme(){
	var filmeDTO = new Object();
	var operacao = "/ControleAPI/filme/cadastrar" 
	filmeDTO.descricao = $("#descricao-filme").val();
	filmeDTO.ano = $("#ano-filme").val();
	filmeDTO.resumo = $("#resumo-filme").val();
	filmeDTO.classificacao = $("#ano-filme").val();
	filmeDTO.duracao = $("#duracao-filme").val();
	
	filmeDTO.categoriaDTO = new Object();
	filmeDTO.categoriaDTO.id = $("#categoria-filme").val();
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(filmeDTO),
		contentType: "application/json"
	}).done(function (data){
		var mensagem = '';
		var titulo = '';
		if(data.mensagem != undefined && data.mensagem != null && data.mensagem != ''){
			titulo = 'Atenção';
			mensagem = data.mensagem;
		}else{
			titulo = "Sucesso";
			mensagem = "Filme cadastrado com sucesso.";
		}
		
		mostrarModal(titulo, mensagem);
	});
}

