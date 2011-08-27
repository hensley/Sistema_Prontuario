package domainModel;


import javax.persistence.*;

@Entity
@Table(name="pessoa")
public class Pessoa {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpessoa")
	private int idPessoa;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="rg")
	private String rg;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="conselho_classe")
	private String conselho_classe;	

	@Column(name="profissao")
	private String Profissao;
	
	@Column(name="logradouro")
	private String logradouro;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="complemento")
	private String comeplemento;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="telefone_fixo")
	private String telefone_fixo;
	
	@Column(name="telefone_celular")
	private String telefone_celular;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="data_nascimento")
	private String data_nascimento;

		
	//Métodos
	

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getConselho_classe() {
		return conselho_classe;
	}

	public void setConselho_classe(String conselho_classe) {
		this.conselho_classe = conselho_classe;
	}

	public String getProfissao() {
		return Profissao;
	}

	public void setProfissao(String profissao) {
		Profissao = profissao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComeplemento() {
		return comeplemento;
	}

	public void setComeplemento(String comeplemento) {
		this.comeplemento = comeplemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone_fixo() {
		return telefone_fixo;
	}

	public void setTelefone_fixo(String telefone_fixo) {
		this.telefone_fixo = telefone_fixo;
	}

	public String getTelefone_celular() {
		return telefone_celular;
	}

	public void setTelefone_celular(String telefone_celular) {
		this.telefone_celular = telefone_celular;
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
	
		
}
