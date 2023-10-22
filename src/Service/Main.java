package Service;

public class Main {

	public static void main(String[] args) {
        BanqueService banqueService = new BanqueService();
        double montantEnDollars = 100.0; 
        double montantEnEuros = banqueService.conversion(montantEnDollars);
        System.out.println(montantEnDollars + " dollars équivaut à " + montantEnEuros + " euros.");
        
        
    }
}

