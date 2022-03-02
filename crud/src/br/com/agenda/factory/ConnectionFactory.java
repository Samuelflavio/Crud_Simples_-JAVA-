package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//nome do usuario mysql
	private static final String USERNAME = "root";
	//senha do banco
	private static final String PASSWORD = "";
	//Caminho do banco de dados, porta
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	//conexão
	
	public static Connection createConnectionToMysql() throws Exception {
		//carrega a classe
		Class.forName("com.mysql.jdbc.Driver");
		
		//Cria a conexão com o banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	
		
	}
	
	public static void main(String[]args) throws Exception {
		
		//recuperar conexão
		Connection con = createConnectionToMysql();
		
		//testar se a conexão é nula
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}

	
}
