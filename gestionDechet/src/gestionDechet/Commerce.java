package gestionDechet;


import java.util.*;
/**
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Commerce {
    private String nom;
    private String adresse;
    private String type;
    private List<CategorieProduit> categories;
    private Contrat contrat;

    public Commerce(String nom, String adresse, String type) {
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
        this.categories = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public List<CategorieProduit> getCategories() {
        return categories;
    }
    
    public void ajouterCategorie(CategorieProduit categorie) {
        categories.add(categorie);
    }
    
    public void supprimerCategorie(CategorieProduit categorie) {
        categories.remove(categorie);
    }
    
    public Contrat getContrat() {
        return contrat;
    }
    
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }


    public boolean contratActif() {
        return contrat != null && contrat.estActif();
    }

    
    @Override
    public String toString() {
        return "Commerce{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", type='" + type + '\'' +
                ", categories=" + categories +
                ", contrat=" + (contrat != null ? contrat.toString() : "Aucun") +
                '}';
    }
}
