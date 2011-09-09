package domainModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSet;
import javax.persistence.*;

@Entity
@Table(name="autenticacao")
public class Usuario {

    //Atributos Usuario autenticacao
	
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAutenticacao")
	private int idAutenticacao;
        
	
	@Column(name="usuario")
	private String usuario;
        
        @Column(name="nome")
	private String nome;
	
	@Column(name="senha")
	private String senha;
        
        //Motodos Usuario autenticacao

	public int getidAutenticacao() {
		return idAutenticacao;
	}

	public void setidAutenticacao(int idAutenticacao) {
		this.idAutenticacao = idAutenticacao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
        
        public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
        
/*
public Connection conectarBD(){

	
        
	try{
		Class.forName ("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://localhost:3306/prontuario" ;
               // conn = DriverManager.getConnection(url,"root", 123);
		
	} catch (Exception e) {
		return conn;
        }
}
         
         
        
	//public String usuario = " ";
	private boolean  result = false;
public  verificarUsuario (String usuario,String senha){
    
		String sql = "";
		Connection conn = conectarBD();

		sql+= "select usuario = "+ "'" + usuario +"'";
		sql+= "select senha = "+ "'" + senha +"'";
		try{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery (sql);
			if (rs.next()){	
                            result = true;
				usuario = rs.getString ("usuario");
			}
		} catch (Exception e) {
		
		}
}

         * 
         */
}
