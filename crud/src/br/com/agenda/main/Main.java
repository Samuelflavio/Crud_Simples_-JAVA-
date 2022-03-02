package br.com.agenda.main;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {
	
	public static void main(String[]args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Maria Tereza");
		contato.setId(55);
		contato.setDataCadastro(new Date());
		
		contatoDao.save(contato);
		
	}

}
