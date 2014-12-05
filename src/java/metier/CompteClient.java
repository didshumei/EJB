package metier;

/**
 * Représente les différentes informations d'un compte client
 * @author gruselle
 */
public class CompteClient 
{
    private int idCompteClient;
    private String nomCompteClient;
    private String prenomCompteClient;
    private Adresse adresseCompteClient;
    private String emailCompteClient;
    private String mdpCompteClient;
    private String telCompteClient;

    public CompteClient() 
    {
        
    }
    
    public CompteClient(int idCompteClient, String nomCompteClient, String prenomCompteClient,
                        Adresse adresseCompteClient, String emailCompteClient, 
                        String mdpCompteClient, String telCompteClient) 
    {
        this.idCompteClient = idCompteClient;
        this.nomCompteClient = nomCompteClient;
        this.prenomCompteClient = prenomCompteClient;
        this.adresseCompteClient = adresseCompteClient;
        this.emailCompteClient = emailCompteClient;
        this.mdpCompteClient = mdpCompteClient;
        this.telCompteClient = telCompteClient;
    }

    /**
     * Permet de récupérer l'identifiant du compte client
     */
    public int getIdCompteClient() 
    {
        return idCompteClient;
    }

    /**
     * Permet d'assigner un identifiant à un compte client
     * @param idCompteClient est de type entier
     */
    public void setIdCompteClient(int idCompteClient) 
    {
        this.idCompteClient = idCompteClient;
    }

    /*
     * Permet de récupérer le nom d'un client
     */
    public String getNomCompteClient() 
    {
        return nomCompteClient;
    }

    /**
     * Permet d'assigner un nom à un compte client
     * @param nomCompteClient est une chaine de caractères
     */
    public void setNomCompteClient(String nomCompteClient) 
    {
        this.nomCompteClient = nomCompteClient;
    }

    /*
     * Permet de récupérer le prénom d'un client
     */
    public String getPrenomCompteClient() 
    {
        return prenomCompteClient;
    }

    /**
     * Permet d'assigner un prénom à un compte client
     * @param prenomCompteClient est une chaine de caractères
     */
    public void setPrenomCompteClient(String prenomCompteClient) 
    {
        this.prenomCompteClient = prenomCompteClient;
    }

    /*
     * Permet de récupérer l'adresse d'un compte client
     */
    public Adresse getAdresseCompteClient() 
    {
        return adresseCompteClient;
    }

    /**
     * Permet d'assigner une adresse à un compte client
     * @param adresseCompteClient est de type adresse
     */
    public void setAdresseCompteClient(Adresse adresseCompteClient) 
    {
        this.adresseCompteClient = adresseCompteClient;
    }

    /*
     * Permet de récupérer l'email d'un compte client
     */
    public String getEmailCompteClient() 
    {
        return emailCompteClient;
    }

    /**
     * Permet d'assigner un email à un compte client
     * @param emailCompteClient est une chaine de caractères
     */
    public void setEmailCompteClient(String emailCompteClient) 
    {
        this.emailCompteClient = emailCompteClient;
    }

    /*
     * Permet de récupérer le mot de passe d'un commte client
     */
    public String getMdpCompteClient() 
    {
        return mdpCompteClient;
    }

    /**
     * Permet d'assigner un mot de passe à un compte client
     * @param mdpCompteClient 
     */
    public void setMdpCompteClient(String mdpCompteClient) 
    {
        this.mdpCompteClient = mdpCompteClient;
    }

    public String getTelCompteClient() 
    {
        return telCompteClient;
    }

    public void setTelCompteClient(String telCompteClient) 
    {
        this.telCompteClient = telCompteClient;
    }
    
    
}
