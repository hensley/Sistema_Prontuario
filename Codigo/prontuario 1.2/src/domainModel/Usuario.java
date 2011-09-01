package domainModel;

import javax.persistence.*;

@Entity
@Table(name="autenticacao")
public class Usuario {

    //Atributos Usuario autenticacao
	
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAutenticacao")
	private String idAutenticacao;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="senha")
	private String senha;
        
        //Motodos Usuario autenticacao

	public String getidAutenticacao() {
		return idAutenticacao;
	}

	public void setidAutenticacao(String idAutenticacao) {
		this.idAutenticacao = idAutenticacao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
