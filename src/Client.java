public class Client{
    private String dni;
    private String nom;
    private String cognoms;
    private String adreca;

    public String getDni(){
        return this.dni;
    }
    public String getNom(){
        return this.nom;
    }

    public String getCognoms(){
        return this.cognoms;
    }

    public String getAdreca(){
        return this.adreca;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public void setCognoms(String cognoms){
        this.cognoms = cognoms;
    }

    public void setAdreca(String adreca){
        this.adreca = adreca;
    }

    public Client(String dni, String nom, String cognoms, String adreca){
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.adreca = adreca;
    }
}