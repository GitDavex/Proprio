package proprio;

public class personClass {
    private String personNumPiece;
    private String personNom;
    private String personPrenom;
    private String personTelephone;

    public personClass(String personNumPiece, String personNom, String personPrenom, String personTelephone) {
        this.personNumPiece = personNumPiece;
        this.personNom = personNom;
        this.personPrenom = personPrenom;
        this.personTelephone = personTelephone;
    }

    public String getNum_piece() {
        return personNumPiece;
    }

    public String getNom() {
        return personNom;
    }

    public String getPrenom() {
        return personPrenom;
    }

    public String getTelephone() {
        return personTelephone;
    }

    public void setPersonNumPiece(String personNumPiece) {
        this.personNumPiece = personNumPiece;
    }

    public void setPersonNom(String personNom) {
        this.personNom = personNom;
    }

    public void setPersonPrenom(String personPrenom) {
        this.personPrenom = personPrenom;
    }

    public void setPersonTelephone(String personTelephone) {
        this.personTelephone = personTelephone;
    }
    
}
