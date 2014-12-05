package metier;

/**
 * @author gruselle
 * Représente tous les attributs d'un article
 */
public class Article 
{
    public enum EtatArticle{Disponible, A_Reapprovisionner, En_Cours_De_Reapprovisionnement, Sorti_Du_Catalogue};
    
    private int idArticle;
    private Genre genreArticle;
    private float prixArticle;
    private String titreArticle;
    private String auteurArticle;
    private String editeurArticle;
    private String descriptionArticle;
    private Categorie categorie;
    private String lienPhoto;
    private int seuilStockMin;
    private EtatArticle etat;

    /**
     * retourne l'identifiant de l'article.
     */
    public int getIdArticle() 
    {
        return idArticle;
    }

    /**
     * Permet d'assigner un identifiant à un article
     * @param idArticle est un entier représentant l'id de l'article
     */
    public void setIdArticle(int idArticle) 
    {
        this.idArticle = idArticle;
    }

    /**
     * Permet d'obtenir le genre d'un article
     */
    public Genre getGenreArticle() 
    {
        return genreArticle;
    }

    /**
     * Permet d'assigner un genre à un article
     * @param genreArticle est un genre
     */
    public void setGenreArticle(Genre genreArticle) 
    {
        this.genreArticle = genreArticle;
    }

    /**
     * Permet d'obtenir le prix d'un article
     */
    public float getPrixArticle() 
    {
        return prixArticle;
    }

    /**
     * Permet d'assigner un prix à un article
     * @param prixArticle est de type float
     */
    public void setPrixArticle(float prixArticle) 
    {
        this.prixArticle = prixArticle;
    }

    /**
     * Permet d'obtenir le titre d'un article
     */
    public String getTitreArticle() 
    {
        return titreArticle;
    }

    /**
     * Permet d'assigner un titre à un article
     * @param titreArticle est un chaine de caractères contenant le titre
     */
    public void setTitreArticle(String titreArticle) 
    {
        this.titreArticle = titreArticle;
    }

    /**
     * Permet d'obtenir l'auteur d'un article. Par auteur, nous entendons auteur, chanteur, réalisateur...
     */
    public String getAuteurArticle() 
    {
        return auteurArticle;
    }

    /**
     * Permet d'assigner un auteur à un article. 
     * @param auteurArticle est une chaine de caractères
     */
    public void setAuteurArticle(String auteurArticle) 
    {
        this.auteurArticle = auteurArticle;
    }

    /**
     * Permet d'obtenir l'éditeur d'un article
     */
    public String getEditeurArticle() 
    {
        return editeurArticle;
    }

    /**
     * Permet d'assigner un éditeur à un article
     * @param editeurArticle  est une chaine de caractères
     */
    public void setEditeurArticle(String editeurArticle) 
    {
        this.editeurArticle = editeurArticle;
    }

    /**
     * Permet d'obtenir la description de l'article
     */
    public String getDescriptionArticle() 
    {
        return descriptionArticle;
    }

    /**
     * Permet d'assigner une description à un article
     * @param descriptionArticle est une chaine de caractères
     */
    public void setDescriptionArticle(String descriptionArticle) 
    {
        this.descriptionArticle = descriptionArticle;
    }

    
    public Categorie getIdCategorie() 
    {
        return categorie;
    }

    public void setIdCategorie(Categorie idCategorie) 
    {
        this.categorie = idCategorie;
    }

    public String getLienPhoto() 
    {
        return lienPhoto;
    }

    public void setLienPhoto(String lienPhoto) 
    {
        this.lienPhoto = lienPhoto;
    }

    public int getSeuilStockMin() 
    {
        return seuilStockMin;
    }

    public void setSeuilStockMin(int seuilStockMin) 
    {
        this.seuilStockMin = seuilStockMin;
    }
    
    public EtatArticle getEtatArticle()
    {
        return EtatArticle.Disponible;
    }
    
    public void setEtatArticle(EtatArticle etat)
    {
        if(etat.equals(EtatArticle.Disponible))
        {
            
        }
        else
        {
            if(etat.equals(EtatArticle.A_Reapprovisionner))
            {
                
            }
            else
            {
                if(etat.equals(EtatArticle.En_Cours_De_Reapprovisionnement))
                {
                    
                }
                else
                {
                    if(etat.equals(EtatArticle.Sorti_Du_Catalogue))
                    {
                        
                    }
                }
            }
        }
    }
}
