package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Computador;

public class ComputadorDAO {
	
	private Connection conexao;
	private PreparedStatement prepararSQL;
	private ResultSet resultado; 
	
	public ComputadorDAO() throws ClassNotFoundException, SQLException {
		conexao = new Conexaojava().getConexao();
	}
	
	public boolean inserir(Computador computador) throws SQLException {
		String sql= "insert into computador(ip,nome,descricao,sala,bloco) values(?,?,?,?,?)";
		prepararSQL =conexao.prepareStatement(sql); 
		prepararSQL.setString(1, computador.getIp());
		prepararSQL.setString(2, computador.getNome());
		prepararSQL.setString(3, computador.getDescricao());
		prepararSQL.setInt(4, computador.getSala());
		prepararSQL.setString(5, ""+computador.getBloco());
		prepararSQL.execute();
		prepararSQL.close();
		return prepararSQL.execute();
		
		
		
	}
	

}
