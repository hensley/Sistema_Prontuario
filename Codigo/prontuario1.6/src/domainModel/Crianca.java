
package domainModel;

/**
 *
 * @author JORDANA
 */

import javax.persistence.*;
@Entity
@Table(name="crianca")
public class Crianca {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcrianca")
	private int idcrianca;
    
        @Column(name="responsavel")
	private String responsavel;
     
        @Column(name="data_nascimento_crianca")
	private String data_nascimento_crianca;
      
        @Column(name="peso")
	private String peso;
       
        @Column(name="altura")
	private String altura;
        
        @Column (name="nome_crianca")
        private String nome_crianca;
        
        @Column (name="sexo_crianca")
        private String sexo_crianca;     
        
        @Column (name="data_cadastro")
        private String data_cadastro;
                
                        

    /**
     * @return the idcrianca
     */
    public int getIdcrianca() {
        return idcrianca;
    }

    /**
     * @param idcrianca the idcrianca to set
     */
    public void setIdcrianca(int idcrianca) {
        this.idcrianca = idcrianca;
    }

    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    /**
     * @return the data_nascimento
     */
    public String getData_nascimento_crianca() {
        return data_nascimento_crianca;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento_crianca(String data_nascimento_crianca) {
        this.data_nascimento_crianca = data_nascimento_crianca;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public String getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }

    /**
     * @return the nome
     */
    public String getNome_crianca() {
        return nome_crianca;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome_crianca(String nome_crianca) {
        this.nome_crianca = nome_crianca;
    }

    /**
     * @return the sexo
     */
    public String getSexo_crianca() {
        return sexo_crianca;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo_crianca(String sexo_crianca) {
        this.sexo_crianca = sexo_crianca;
    }

    /**
     * @return the data_cadastro
     */
    public String getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}
