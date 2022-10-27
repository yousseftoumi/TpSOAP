package metier;

import java.util.Date;


public class Compte {

    public Long code;
    public Double solde;
    public Date dateDeCreation;

    public Compte(Long code, Double solde, Date dateDeCreation) {
        this.code = code;
        this.solde = solde;
        this.dateDeCreation = dateDeCreation;
    }

//    public Compte() {
//    }
//
//    public Long getCode() {
//        return code;
//    }
//
//    public void setCode(Long code) {
//        this.code = code;
//    }
//
//    public Double getSolde() {
//        return solde;
//    }
//
//    public void setSolde(Double solde) {
//        this.solde = solde;
//    }
//
//    public Date getDateDeCreation() {
//        return dateDeCreation;
//    }
//
//    public void setDateDeCreation(Date dateDeCreation) {
//        this.dateDeCreation = dateDeCreation;
//    }
}