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
@Table(name="consulta")
public class Consulta {
     @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idconsulta")
	private int idconsulta;
   
        
        @Column(name="tipo_consulta")
	private String tipo_consulta;
        
        @Column(name="pessoa")
	private int pessoa;
        
          @Column(name="paciente")
	private int paciente;
          
          @Column(name="data_consulta")
	private String data_consulta;
        
          
         @Column(name="pessoa_f")
	private String pessoa_f;          

    /**
     * @return the idconsulta
     */
    public int getIdconsulta() {
        return idconsulta;
    }

    /**
     * @param idconsulta the idconsulta to set
     */
    public void setIdconsulta(int idconsulta) {
        this.idconsulta = idconsulta;
    }

    /**
     * @return the cpf
     */
    public int getPaciente() {
        return paciente;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the tipo_consulta
     */
    public String getTipo_consulta() {
        return tipo_consulta;
    }

    /**
     * @param tipo_consulta the tipo_consulta to set
     */
    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
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
     * @return the data_consulta
     */
    public String getData_consulta() {
        return data_consulta;
    }

    /**
     * @param data_consulta the data_consulta to set
     */
    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    /**
     * @return the pessoa_f
     */
    public String getPessoa_f() {
        return pessoa_f;
    }

    /**
     * @param pessoa_f the pessoa_f to set
     */
    public void setPessoa_f(String pessoa_f) {
        this.pessoa_f = pessoa_f;
    }
        
    
}
