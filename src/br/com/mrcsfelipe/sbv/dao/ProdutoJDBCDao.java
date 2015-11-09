package br.com.mrcsfelipe.sbv.dao;

import java.util.List;

import br.com.mrcsfelipe.sbv.model.Produto;

public class ProdutoJDBCDao extends Dao implements ProdutoDao{

	
	
	public ProdutoJDBCDao() {
		
	}

	@Override
	public long salvarProduto(Produto p) throws Exception {
long idObject = 0;
		
		
		try {
			open();
			
			stmt = con.prepareStatement("INSERT INTO "
					+ "	produto(nome, data_fabricacao, marca, modelo, preco, qtd_estoque) "
					+ " values(?,?,?,?,?,?) returning id_cliente");
			
			stmt.setString(1, p.getNome());
			//stmt.setDate(2, p.getDataFabricacao());
			stmt.setString(3, p.getMarca() );
			stmt.setString(4, p.getModelo());
			stmt.setDouble(5, p.getValor());
			stmt.setInt(6, p.getQuantidadeEstoque() );
			rs = stmt.executeQuery();
			if(rs.next()){
				idObject = rs.getLong("id_produto");
			}
			stmt.close();
			close();
			return idObject;
			
		} catch (Exception e) {
			try {
				close();
				return 0;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean editarProduto(Produto p) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluirProduto(Produto p) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Produto> listarProduto(Produto p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
