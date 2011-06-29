package domainModel;

import javax.persistence.*;

@Entity
@Table(name="autenticacao")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAutenticacao")
	private int idUser;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="senha")
	private String senha;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
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
