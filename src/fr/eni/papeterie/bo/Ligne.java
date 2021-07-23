package fr.eni.papeterie.bo;

public class Ligne {
    protected int qte;
    private Article article;

    public Ligne(int qte, Article article) {
        this.qte = qte;
        this.article = article;
    }
    		// Retourne le prix de l'article
    public float getPrix() {
        return this.article.getPrixUnitaire();
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "qte=" + qte +
                ", article=" + article +
                '}';
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Article getArticle() {
        return article;
    }

    private void setArticle(Article article) {
        this.article = article;
    }
}

