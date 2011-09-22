
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
     
        @Column(name="data_nascimento")
	private String data_nascimento;
      
        @Column(name="peso")
	private String peso;
       
        @Column(name="altura")
	private String altura;

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
    public String getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
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
}
