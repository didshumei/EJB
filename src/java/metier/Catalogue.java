/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;

/**
 *
 * @author sylvainbron
 */
public class Catalogue {
    
    private ArrayList<Article> articles;
    private ArrayList<Categorie> categories;
    private ArrayList<Genre> genres;
    
    public Catalogue() {
        articles = new ArrayList<Article>();
        categories = new ArrayList<Categorie>();
        genres = new ArrayList<Genre>();
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public ArrayList<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Categorie> categories) {
        this.categories = categories;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }
    
    
    
}
