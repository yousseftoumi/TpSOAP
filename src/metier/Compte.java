package metier;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Compte {

    public Long code;
    public Double solde;
    public Date dateDeCreation;

    public Compte(Long code, Double solde, Date dateDeCreation) {
        this.code = code;
        this.solde = solde;
        this.dateDeCreation = dateDeCreation;
    }
    public Compte(){}
}