/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domainModel;

/**
 *
 * @author JORDANA
 */


import javax.persistence.*;
@Entity
@Table(name="vacina")
public class Vacina {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idvacina")
	private int idvacina;
   
        
        @Column(name="data_aplicacao")
	private String data_aplicacao;
        
        @Column(name="tipo_vacina")
	private String tipo_vacina;
        
        @Column(name="funcionario_responsavel")
	private String funcionario_responsavel;
  
        @Column(name="filho")
	private String filho;
        
        @Column(name="responsavel")
	private String responsavel;

    /**
     * @return the idvacina
     */
    public int getIdvacina() {
        return idvacina;
    }

    /**
     * @param idvacina the idvacina to set
     */
    public void setIdvacina(int idvacina) {
        this.idvacina = idvacina;
    }

    /**
     * @return the data_aplicacao
     */
    public String getData_aplicacao() {
        return data_aplicacao;
    }

    /**
     * @param data_aplicacao the data_aplicacao to set
     */
    public void setData_aplicacao(String data_aplicacao) {
        this.data_aplicacao = data_aplicacao;
    }

    /**
     * @return the tipo_vacina
     */
    public String getTipo_vacina() {
        return tipo_vacina;
    }

    /**
     * @param tipo_vacina the tipo_vacina to set
     */
    public void setTipo_vacina(String tipo_vacina) {
        this.tipo_vacina = tipo_vacina;
    }

    /**
     * @return the funcionario_responsavel
     */
    public String getFuncionario_responsavel() {
        return funcionario_responsavel;
    }

    /**
     * @param funcionario_responsavel the funcionario_responsavel to set
     */
    public void setFuncionario_responsavel(String funcionario_responsavel) {
        this.funcionario_responsavel = funcionario_responsavel;
    }

    /**
     * @return the filho
     */
    public String getFilho() {
        return filho;
    }

    /**
     * @param filho the filho to set
     */
    public void setFilho(String filho) {
        this.filho = filho;
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
}
