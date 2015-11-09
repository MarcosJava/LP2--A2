package br.com.mrcsfelipe.sbv.teste;

import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import br.com.mrcsfelipe.sbv.dao.ProdutoDao;
import br.com.mrcsfelipe.sbv.dao.ProdutoJDBCDao;
import br.com.mrcsfelipe.sbv.model.Produto;

public class ProdutoBancoTeste {

	
	Produto p = new Produto("Honda Civic",
			"Civic", "Honda", new Date(), 80500.00, 5);
	ProdutoDao produto = new ProdutoJDBCDao();
	
	@Test
	public void salvarProduto(){
		try {
			long id = produto.salvarProduto(p);
			assertEquals(id, 1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
