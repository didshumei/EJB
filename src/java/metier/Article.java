/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author gruselle
 */
public class Article 
{
    public enum etatArticle{Disponible, A_Reapprovisionner, En_Cours_De_Reapprovisionnement, Sorti_Du_Catalogue};
    
    private int idArticle;
    private Genre genreArticle;
    private float prixArticle;
    private String titreArticle;
    private String auteurArticle;
    private String editeurArticle;
    private String descriptionArticle;
    private int idGenre;
    private Categorie categorie;
    private String lienPhoto;
    private int seuilStockMin;
    private etatArticle etat;

    public int getIdArticle() 
    {
        return idArticle;
    }

    public void setIdArticle(int idArticle) 
    {
        this.idArticle = idArticle;
    }

    public Genre getGenreArticle() 
    {
        return genreArticle;
    }

    public void setGenreArticle(Genre genreArticle) 
    {
        this.genreArticle = genreArticle;
    }

    public float getPrixArticle() 
    {
        return prixArticle;
    }

    public void setPrixArticle(float prixArticle) 
    {
        this.prixArticle = prixArticle;
    }

    public String getTitreArticle() 
    {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) 
    {
        this.titreArticle = titreArticle;
    }

    public String getAuteurArticle() 
    {
        return auteurArticle;
    }

    public void setAuteurArticle(String auteurArticle) 
    {
        this.auteurArticle = auteurArticle;
    }

    public String getEditeurArticle() 
    {
        return editeurArticle;
    }

    public void setEditeurArticle(String editeurArticle) 
    {
        this.editeurArticle = editeurArticle;
    }

    public String getDescriptionArticle() 
    {
        return descriptionArticle;
    }

    public void setDescriptionArticle(String descriptionArticle) 
    {
        this.descriptionArticle = descriptionArticle;
    }

    public int getIdGenre() 
    {
        return idGenre;
    }

    public void setIdGenre(int idGenre) 
    {
        this.idGenre = idGenre;
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
    
    public etatArticle getEtatArticle()
    {
        return etatArticle.Disponible;
    }
    
    public void setEtatArticle(etatArticle etat)
    {
        if(etat.equals(etatArticle.Disponible))
        {
            
        }
        else
        {
            if(etat.equals(etatArticle.A_Reapprovisionner))
            {
                
            }
            else
            {
                if(etat.equals(etatArticle.En_Cours_De_Reapprovisionnement))
                {
                    
                }
                else
                {
                    if(etat.equals(etatArticle.Sorti_Du_Catalogue))
                    {
                        
                    }
                }
            }
        }
    }
}
