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
        
        @Column(name="nome")
	private String nome;
        
        @Column(name="data_coleta")
	private String data_coleta;
        
        @Column(name="protocolo")
	private String protocolo;

        @Column(name="funcionario")
	private String funcionario;
        
         
         
   // METODOS
        
        public int getidcoleta() {
		return idcoleta;
	}

	public void setidcoleta(int idcoleta) {
		this.idcoleta = idcoleta;
	}
        public String getpsf() {
		return psf;
	}

	public void setpsf(String psf) {
		this.psf = psf;
	}
        public String getdata_coleta() {
		return data_coleta;
	}

	public void setdata_coleta(String data_coleta) {
		this.data_coleta = data_coleta;
	}
        public String getprotocolo() {
		return protocolo;
	}

	public void setprotocolo(String protocolo) {
		this.protocolo = protocolo;
	}

        public String getFuncionario() {
                 return funcionario;
         }

        public void setFuncionario(String funcionario) {
                this.funcionario = funcionario;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

}
