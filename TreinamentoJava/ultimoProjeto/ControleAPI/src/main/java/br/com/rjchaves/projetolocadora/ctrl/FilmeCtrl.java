package br.com.rjchaves.projetolocadora.ctrl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.rjchaves.projetolocadora.dao.FilmeDAO;
import br.com.rjchaves.projetolocadora.modelo.Categoria;
import br.com.rjchaves.projetolocadora.modelo.Filme;
import br.com.rjchaves.projetolocadora.dto.BaseDTO;
import br.com.rjchaves.projetolocadora.dto.CategoriaDTO;
import br.com.rjchaves.projetolocadora.dto.FilmeDTO;
import br.com.rjchaves.projetolocadora.dto.ListFilmeDTO;

@Path("/filme")
public class FilmeCtrl {
	@GET
	@Produces("application/json")
	@Path("/listar")
	public ListFilmeDTO listarFilmes(){
		List<FilmeDTO> filmesDTO = new ArrayList<>();
		ListFilmeDTO listFilmeDTO = new ListFilmeDTO();
		try {
			List<Filme> filmes = new FilmeDAO().pesq(null);
			for(Filme filme : filmes){
				filmesDTO.add(converterFilmeParaFilmeDTO(filme));
			}
			listFilmeDTO.setRetorno(filmesDTO);
		} catch (Exception e) {
			String mensagem ="Erro ao listar filmes";
			listFilmeDTO.setMensagem(mensagem+e.getMessage());
		}
		
		return listFilmeDTO;
	}
	
	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cadastrar")
	public BaseDTO cadastrarFilme(FilmeDTO filmeDTO){
		try{
			validarCamposObrigatorios(filmeDTO);
			Filme filme = converterFilmeDTOParaFilme(filmeDTO);
			FilmeDAO filmeDAO = new FilmeDAO();
			filmeDAO.criar(filme);
			filmeDTO.setId(filme.getId());
		}catch (Exception e) {
			filmeDTO.setMensagem(e.getMessage());
		}
		
		return filmeDTO;
	}
	
	public static Filme converterFilmeDTOParaFilme(FilmeDTO filmeDTO){
		/*Filme filme = new Filme();
		filme.setAno(filmeDTO.getAno());
		filme.setCategoria(CategoriaCtrl.converterDTOEmCategoria(filmeDTO.getCategoriaDTO()));
		filme.setClassificao(filmeDTO.getClassificao());
		filme.setDescricao(filmeDTO.getDescricao());
		filme.setDuracao(filmeDTO.getDuracao());
		filme.setResumo(filmeDTO.getResumo());
		
		return filme;*/
		Calendar anoCalendar = Calendar.getInstance();
		Calendar duracaoCalendar = Calendar.getInstance();
		
		SimpleDateFormat stdf = new SimpleDateFormat("hh:mm");
		anoCalendar.set(Integer.parseInt(filmeDTO.getAno()), 0, 1, 0, 0, 0);
		try {
			duracaoCalendar.setTime(stdf.parse(filmeDTO.getDuracao()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
				
		Filme filme = new Filme();
		filme.setId(filmeDTO.getId());
		filme.setDescricao(filmeDTO.getDescricao());
		filme.setAno(anoCalendar);
		filme.setDuracao(duracaoCalendar);
		filme.setResumo(filmeDTO.getResumo());
		Categoria categoria = new CategoriaCtrl().converterDTOEmCategoria(filmeDTO.getCategoriaDTO());
		filme.setCategoria(categoria);
		filme.setClassificao(filmeDTO.getClassificacao());
		return filme;
	}
	
	public static FilmeDTO converterFilmeParaFilmeDTO(Filme filme){
		/*FilmeDTO filmeDTO = new FilmeDTO();
		filmeDTO.setAno(filme.getAno());
		filmeDTO.setCategoria(CategoriaCtrl.converterCategoriaEmDTO(filme.getCategoria()));
		filmeDTO.setClassificao(filme.getClassificao());
		filmeDTO.setDescricao(filme.getDescricao());
		filmeDTO.setDuracao(filme.getDuracao());
		filmeDTO.setResumo(filme.getResumo());
		
		return filmeDTO;*/
		SimpleDateFormat stdf = new SimpleDateFormat("hh:mm");
		FilmeDTO filmeDTO = new FilmeDTO();
		filmeDTO.setId(filme.getId());
		filmeDTO.setDescricao(filme.getDescricao());
		filmeDTO.setAno(String.valueOf(filme.getAno().get(Calendar.YEAR)));
		filmeDTO.setClassificacao(filme.getClassificao());
		filmeDTO.setDuracao(stdf.format(filme.getDuracao().getTime()));
		filmeDTO.setResumo(filme.getResumo());
		CategoriaDTO categoriaDTO = CategoriaCtrl.converterCategoriaEmDTO(filme.getCategoria());
		filmeDTO.setCategoriaDTO(categoriaDTO);
		return filmeDTO;
	}
	
	
	private void validarCamposObrigatorios(FilmeDTO filmeDTO) throws Exception{
		if(filmeDTO.getDescricao() == null || filmeDTO.getDescricao().isEmpty()){
			throw new Exception("Campo descrição é obrigatório");
		}
		
		if(filmeDTO.getCategoriaDTO() == null || filmeDTO.getCategoriaDTO().getId() == null){
			throw new Exception("Campo categoria inválido");
		}
	}
}
