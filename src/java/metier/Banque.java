package metier;

/**
 * Représente les différentes banques utilisées par les clients
 * @author gruselle
 */
public class Banque 
{
    private int idBanque;
    private Adresse adresseBanque;

    public int getIdBanque() 
    {
        return idBanque;
    }

    public void setIdBanque(int idBanque) 
    {
        this.idBanque = idBanque;
    }

    public Adresse getAdresseBanque() 
    {
        return adresseBanque;
    }

    public void setAdresseBanque(Adresse adresseBanque) 
    {
        this.adresseBanque = adresseBanque;
    }
    
    
}
