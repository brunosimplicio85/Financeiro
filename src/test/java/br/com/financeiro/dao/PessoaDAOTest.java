package br.com.financeiro.dao;



import org.junit.Test;

import br.com.financeiro.domain.Cidade;
import br.com.financeiro.domain.Pessoa;


public class PessoaDAOTest {
	@Test
	
	public void salvar(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		@SuppressWarnings("unused")
		Cidade cidade = cidadeDAO.buscar(3L);
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Bruno Silveira Simplicio");
		pessoa.setCpf("010.288.361-04");
		pessoa.setRg("001139204");
		pessoa.setRua("Das Nissoes");
		
		pessoa.setBairro("Ponta Aguda");
		pessoa.setCep("89.051-000");
		pessoa.setComplemento("Casa");
		pessoa.setTelefone("(47)3333-3333");
		pessoa.setCelular("(47)99719-3315");
		pessoa.setEmail("bruno@email.com");
		
		
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
		System.out.println("Pessoa salvo com sucesso.");
	}

}
