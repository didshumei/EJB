package metier;

/**
 * Représente les différentes catégories auxquelles peuvent appartenir les articles
 * @author gruselle
 */
public class Categorie {
     private int idCategorie;
    private String referenceCategorie;
    private String descriptionCategorie;

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getReferenceCategorie() {
        return referenceCategorie;
    }

    public void setReferenceCategorie(String referenceCategorie) {
        this.referenceCategorie = referenceCategorie;
    }

    public String getDescriptionCategorie() {
        return descriptionCategorie;
    }

    public void setDescriptionCategorie(String descriptionCategorie) {
        this.descriptionCategorie = descriptionCategorie;
    }
        
}
