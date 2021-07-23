package fr.eni.papeterie.dal;

import fr.eni.papeterie.bo.Article;

public class DAOFactory {
	public static ArticleDAO getArticleDAO() {
		ArticleDAO aDAO = new ArticleDAOJdbcImpl();
		return aDAO;
	}
}