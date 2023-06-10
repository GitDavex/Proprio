package proprio;

public class homeClass {
    String Loyer;
    String Superficie;
    String Pieces;
    String Designation;
    String Etat;
    String Administrateur;
    String Description;
    String Adresse;
    String Quartier;
    String Commune;
    Integer idLogement;
    Integer idBien;
    Integer idType;
    Integer idAdresse;

    public homeClass(String Loyer, String Superficie, String Pieces, String Designation, 
    String Etat, String Administrateur, String Description, String Adressse, String Quartier,
    String Commune, Integer idLogement, Integer idBien, Integer idType, Integer idAdresse){
        this.Loyer = Loyer;
        this.Superficie = Superficie;
        this.Pieces = Pieces;
        this.Designation = Designation;
        this.Etat = Etat;
        this.Administrateur = Administrateur;
        this.Description = Description;
        this.Adresse = Adressse;
        this.Quartier = Quartier;
        this.Commune = Commune;
        this.idLogement = idLogement;
        this.idBien = idBien;
        this.idType = idType;
        this.idAdresse = idAdresse;
    }

    public String getLoyer(){
        return this.Loyer;
    }

    public String getSuperficie(){
        return this.Superficie;
    }

    public String getPieces(){
        return this.Pieces;
    }

    public String getDesignation() {
        return this.Designation;
    }

    public String getEtat() {
        return this.Etat;
    }

    public String getAdministrateur() {
        return this.Administrateur;
    }

    public String getDescription() {
        return this.Description;
    }

    public String getAdresse() {
        return this.Adresse;
    }

    public String getQuartier(){
        return this.Quartier;
    }

    public String getCommune(){
        return this.Commune;
    }

    public Integer getIdLogement(){
        return this.idLogement;
    }

    public Integer getIdBien(){
        return this.idBien;
    }

    public Integer getIdType(){
        return this.idType;
    }

    public Integer getIdAdresse(){
        return this.idAdresse;
    }
    
}
