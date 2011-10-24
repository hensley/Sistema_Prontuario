package domainModel;

import javax.persistence.*;


@Entity
@Table(name="familia")
public class Familia {

    //Atributos Familia
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idfamilia")
	private int idFamilia;
	
	@Column(name="logradouro")
	private String logradouro;
        
        @Column(name="cpf")
	private String cpf;
        
        @Column(name="nome")
	private String nome;
	
        @Column(name="numero")
	private String numero;
	
	@Column(name="complemento")
	private String complemento;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="cep")
	private String cep;
	
	@Column(name="data_cadastro")
	private String data_cadastro;
        
        @Column(name="profissao")
	private String profissao;
		
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="data_nascimento")
	private String data_nascimento;
        
        
        //Motodos Familia
        
        public Familia() {
            nome = "";
        }

	public int getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
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
		return complemento;
	}

	public void setComeplemento(String comeplemento) {
		this.complemento = comeplemento;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
        public String getCpf(){
            return cpf;
        }
	public void setCpf (String cpf){
            this.cpf=cpf;
        }
	public String getNome() {
		return nome;
	}
        public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
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

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
