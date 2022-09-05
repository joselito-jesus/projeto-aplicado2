package dao;

import java.util.ArrayList;
import java.util.List;

import model.CandidatoxPesquisa;

public class CandidatoxPesquisaDao {

	private static CandidatoxPesquisaDao instance;
	private List<CandidatoxPesquisa> listaCandidatoxPesquisa = new ArrayList<>();
	
	public static CandidatoxPesquisaDao getInstance() {
		if(instance == null) {
			instance = new CandidatoxPesquisaDao();
			
		}
		return instance;
	}
	
	public void salvar(CandidatoxPesquisa candidatoxpesquisa) {
		listaCandidatoxPesquisa.add(candidatoxpesquisa);
	}
	public void atualizar(CandidatoxPesquisa candidatoxpesquisa) {
		listaCandidatoxPesquisa.set(candidatoxpesquisa.getId(), candidatoxpesquisa);
	}
	public void excluir(int idCandidatoxPesquisa) {
		listaCandidatoxPesquisa.remove(idCandidatoxPesquisa);
	}
	public List<CandidatoxPesquisa> listar(){
		return listaCandidatoxPesquisa;
		
	}
}

