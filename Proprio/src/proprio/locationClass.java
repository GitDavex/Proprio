package proprio;

public class locationClass {
    private String dateDebut;
    private String dateFin;
    private String proprietaire;
    private String logement;
    private Integer idLocation;
    private Integer idLogement;

    public locationClass(String dateDebut, String dateFin, String proprietaire, String logement, Integer idLocation,  Integer idLogement){
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.proprietaire = proprietaire;
        this.logement = logement;
        this.idLocation = idLocation;
        this.idLogement = idLogement;
    }

    public String getDateDebut(){
        return this.dateDebut;
    }

    public String getDateFin(){
        return this.dateFin;
    }

    public String getProprietaire(){
        return this.proprietaire;
    }

    public String getLogement(){
        return this.logement;
    }

    public Integer getIdLocation(){
        return this.idLocation;
    }

    public Integer getIdLogement(){
        return this.idLogement;
    }
}
