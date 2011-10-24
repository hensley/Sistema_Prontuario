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
@Table(name="coleta")
public class Coleta {

    //Atributos Coleta
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcoleta")
	private int idcoleta;
        
        @Column(name="psf")
	private String psf;
        
        @Column(name="paciente")
	private String paciente;
        
        @Column(name="data_coleta")
	private String data_coleta;

        @Column(name="funcionario_responsavel_coleta")
	private String funcionario_responsavel_coleta;

    /**
     * @return the idcoleta
     */
    public int getIdcoleta() {
        return idcoleta;
    }

    /**
     * @param idcoleta the idcoleta to set
     */
    public void setIdcoleta(int idcoleta) {
        this.idcoleta = idcoleta;
    }

    /**
     * @return the psf
     */
    public String getPsf() {
        return psf;
    }

    /**
     * @param psf the psf to set
     */
    public void setPsf(String psf) {
        this.psf = psf;
    }

    /**
     * @return the paciente
     */
    public String getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the data_coleta
     */
    public String getData_coleta() {
        return data_coleta;
    }

    /**
     * @param data_coleta the data_coleta to set
     */
    public void setData_coleta(String data_coleta) {
        this.data_coleta = data_coleta;
    }

    /**
     * @return the funcionario_responsavel_coleta
     */
    public String getFuncionario_responsavel_coleta() {
        return funcionario_responsavel_coleta;
    }

    /**
     * @param funcionario_responsavel_coleta the funcionario_responsavel_coleta to set
     */
    public void setFuncionario_responsavel_coleta(String funcionario_responsavel_coleta) {
        this.funcionario_responsavel_coleta = funcionario_responsavel_coleta;
    }
}
         
         