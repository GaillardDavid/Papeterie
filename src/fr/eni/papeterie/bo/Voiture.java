package fr.eni.papeterie.bo;

import lombok.Getter;
import lombok.Setter;

public class Voiture {
	@Getter @Setter @Data
	private int nbPortes;
	private String proprietaire;

}
