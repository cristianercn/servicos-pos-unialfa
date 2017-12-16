package br.com.unialfa.pos.soa.rest.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.unialfa.pos.soa.rest.core.model.entity.Tarefa;
import br.com.unialfa.pos.soa.rest.core.model.entity.Usuario;
import br.com.unialfa.pos.soa.rest.core.model.entity.UsuarioTarefa;

public interface TarefaService {
	Page<Tarefa> obtemTodasAsTarefas(Pageable pageable);

	Tarefa gravaTarefa(Tarefa tarefa) throws Exception;

	void removeTarefa(Long id);

	Tarefa obtemTarefaPorId(Long id);

	Page<UsuarioTarefa> obtemTodasAsAlocacoes(Long idTarefaSelecionada, Pageable pageable);
	

	UsuarioTarefa alocaTarefa(UsuarioTarefa usuarioTarefa);

	UsuarioTarefa desalocaTarefa(Long id);
	
	List<Usuario> listaUsuariosPorTarefa(Long idtarefa);
}
