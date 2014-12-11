/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */
public class    Verification
{
    static public boolean   estNomPropre(String s)
    {
        return (s != null && s.matches("^[a-ZA-Zéêè -]+$"));
    }
    
    static public boolean   estPrenom(String s)
    {
        return (s != null && s.matches("^[a-ZA-Zéêè ]+-?[a-ZA-Zéêè ]*$"));
    }
    
    static public boolean   estTelephone(String s)
    {
        return (s != null && s.matches("^[0-9.]+$"));
    }
    
    static public boolean   estCodePostal(String s)
    {
        return (s != null && s.length() == 5 && s.matches("^[0-9]+$"));
    }
    
    static public boolean   estEmail(String s)
    {
        return (s != null && s.matches("^[a-ZA-Z.]+@[a-ZA-Z]+.[a-ZA-Z]+$"));
    }
    static public boolean   estDescription(String s)
    {
        return (s != null && s.matches("^[a-ZA-Zéêè0-9,?.;:!%\'\"() -]+$"));
    }
    
}
