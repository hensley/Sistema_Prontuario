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
@Table(name="exame")
public class Exame {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idexame")
	private int idexame;
   
        
        @Column(name="paciente")
	private int paciente;
        
        @Column(name="data_exame")
	private String data_exame;
         
        @Column(name="tipo_exame")
	private String tipo_exame;
          
        @Column(name="pessoa")
	private int pessoa;
        
        @Column(name="laboratorio")
	private String laboratorio;

    /**
     * @return the idexame
     */
    public int getIdexame() {
        return idexame;
    }

    /**
     * @param idexame the idexame to set
     */
    public void setIdexame(int idexame) {
        this.idexame = idexame;
    }

    /**
     * @return the paciente
     */
    public int getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the data_exame
     */
    public String getData_exame() {
        return data_exame;
    }

    /**
     * @param data_exame the data_exame to set
     */
    public void setData_exame(String data_exame) {
        this.data_exame = data_exame;
    }

    /**
     * @return the tipo_exame
     */
    public String getTipo_exame() {
        return tipo_exame;
    }

    /**
     * @param tipo_exame the tipo_exame to set
     */
    public void setTipo_exame(String tipo_exame) {
        this.tipo_exame = tipo_exame;
    }

    /**
     * @return the pessoa
     */
    public int getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the laboratorio
     */
    public String getLaboratorio() {
        return laboratorio;
    }

    /**
     * @param laboratorio the laboratorio to set
     */
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
}
