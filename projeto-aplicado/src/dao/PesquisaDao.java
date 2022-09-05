package dao;

import java.util.ArrayList;
import java.util.List;

import model.Pesquisa;

public class PesquisaDao {
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisa = new ArrayList<>();
	
	public static PesquisaDao getInstance() {
		if(instance == null) {
			instance = new PesquisaDao();
			
		}
		return instance;
	}

	public void salvar(Pesquisa pesqusia) {
		listaPesquisa.add(pesqusia);
	}
	
	public void atualizar(Pesquisa pesquisa) {
		listaPesquisa.set(pesquisa.getId(), pesquisa);
	}
	
	public void excluir(int idPesquisa) {
		listaPesquisa.remove(idPesquisa);
	}
	
	public List<Pesquisa> listar(){
		return listaPesquisa;
		
	}

}
