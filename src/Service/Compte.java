package Service;

import java.util.Date;


class Compte {
    private String code;
    private double solde;
    private Date dateCreation;

    public Compte(String code, double solde,Date dateCreation ) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public String getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}