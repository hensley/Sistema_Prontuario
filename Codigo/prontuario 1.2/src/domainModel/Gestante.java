/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domainModel;
import javax.persistence.*;

@Entity
@Table(name="gestante")

/**
 *
 * @author JORDANA
 */
public class Gestante {
        @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idgestante")
	private String idgestante;
    
        @Column(name="idPaciente")
	private String idPaciente;
        
        @Column(name="recen")
	private String recen;
        
        @Column(name="aborto")
	private String aborto;
        
        @Column(name="estadocivil")
	private String estadocivil;
        
        @Column(name="gestacaoant")
	private String gestacaoant;
        
        @Column(name="dum")
	private String dum;
        
        @Column(name="dpp")
	private String dpp;

        
        public String getidgestante() {
		return idgestante;
	}

	public void setidgestante (String idgestante) {
		this.idgestante = idgestante;
        }
        
        public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
        }
        public String getrecen() {
		return recen;
	}

	public void setrecen(String recen) {
		this.recen = recen;
        }
         public String getaborto() {
		return recen;
	}

	public void setaborto(String aborto) {
		this.recen = aborto;
        }
        
         public String getestadocivil() {
		return estadocivil;
	}

	public void setestadocivil (String estadocivil) {
		this.estadocivil
                        = estadocivil;
        }
        
        
         public String gegestacaoant() {
		return gestacaoant;
	}

	public void setgestacaoant (String gestacaoant) {
		this.gestacaoant = gestacaoant;
        } 
        
         public String getdum() {
		return dum;
	}

	public void setdum(String dum) {
		this.dum = dum;
        }
        
        public String getdpp() {
		return dpp;
	}

	public void setdpp(String dpp) {
		this.dpp = dpp;
        }
        
        
    
}
