package Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BanqueService {
    private double tauxDeChange = 0.84;

    public double conversion(double montant) {
        double montantConverti = montant * tauxDeChange;
        return montantConverti;
    }
    public void setTauxDeChange(double nouveauTaux) {
        this.tauxDeChange = nouveauTaux;
    }

    public double getTauxDeChange() {
        return tauxDeChange;
    }
    
    public Compte getCompte(String code) {
    	
        return new Compte(code, 0, new Date());
    }

    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        Compte compte = new Compte("123456", 1000.0, new Date());
        Compte compte1 = new Compte("123457", 1000.0, new Date());
        Compte compte2 = new Compte("123458", 1000.0, new Date());
        comptes.add(compte) ;
        comptes.add(compte1) ;
        comptes.add(compte2) ;
        return comptes;
    }
   
    
}