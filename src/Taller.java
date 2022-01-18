public class Taller {
    public static void main(String args[]){
        Client unClient = new Client("10123456", "Pere", "Valls i Sobirats", "Gran Via 273, 3er 1a");
        Client altreClient = new Client("12000456", "Julia", "Gutiérrez i Amòs", "Gran Via 273, 3er 2a");
        
        unClient.setNom("Pepito");
        System.out.println("Un client:");
        System.out.println("\t" + unClient.getNom() + " " + unClient.getCognoms());
        
        System.out.println("Altre client:");
        System.out.println("\t" + altreClient.getNom() + " " + altreClient.getCognoms());
    }
}
