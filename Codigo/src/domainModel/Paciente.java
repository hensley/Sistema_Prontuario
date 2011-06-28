package domainModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPaciente")
	private int idPaciente;
	
	@Column(name="idFamilia")
	private String idfamilia;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="profissao")
	private String Profissao;
		
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="data_nascimento")
	private String data_nascimento;
	
	@Column(name="idade")
	private String idade;

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return Profissao;
	}

	public void setProfissao(String profissao) {
		Profissao = profissao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getIdfamilia() {
		return idfamilia;
	}

	public void setIdfamilia(String idfamilia) {
		this.idfamilia = idfamilia;
	}


}
