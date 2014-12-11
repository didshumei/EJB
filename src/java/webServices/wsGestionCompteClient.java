/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import Ejb.EJBCompteClient;
import interfaces.EJBCompteClientLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import metier.CompteClient;
import metier.Retour;

/**
 *
 * @author krieger
 */
@WebService(serviceName = "wsCreerCompteClient")
@Stateless()
public class wsGestionCompteClient
{
    private @EJB EJBCompteClientLocal EJBCptClient;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Helloooo " + txt + " !";
    }
    
    @WebMethod(operationName = "creerCompteClient")
    public Retour<CompteClient> creerCompteClient(String nom, String prenom, String telephone, String email, String motDePasse, String numeroRue, String nomRue, String codePostal, String ville)
    {
        return EJBCptClient.creerCompteClient(nom, prenom, telephone, email, motDePasse, numeroRue, nomRue, codePostal, ville);
    }
}
