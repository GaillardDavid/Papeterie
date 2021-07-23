package fr.eni.papeterie.bo;

public class Stylo extends Article {
    private String couleur;

    public Stylo() {
    }
    	// SUPER rappelle les this. de la classe Article
    public Stylo(Integer idArticle, String marque, String reference, String designation, float prixUnitaire, int qteStock, String couleur) {
        super(idArticle, marque, reference, designation, prixUnitaire, qteStock);
        this.couleur = couleur;
    }
    	// SUPER rappelle les this. de la classe Article 
    public Stylo(String marque, String reference, String designation, float prixUnitaire, int qteStock, String couleur) {
        super(marque, reference, designation, prixUnitaire, qteStock);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "couleur='" + couleur + '\'' +
                '}';
    }
}
