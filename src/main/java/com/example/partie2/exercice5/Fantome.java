package com.example.partie2.exercice5;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Fantome extends Personnage {

    private Rectangle basCorps;


    private Circle oeilGauche;
    private Circle retineGauche;

    private Circle oeilDroit;
    private Circle retineDroite;


    public Fantome() {
        super("droite", Color.BLUE, Color.BLUE);
        basCorps = new Rectangle(0, 10, 20, 10);
        basCorps.setFill(Color.BLUE);

        oeilGauche = new Circle(6, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineGauche = new Circle(oeilGauche.getCenterX() + 1, 6, 1, Color.BLACK);

        oeilDroit = new Circle(14, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineDroite = new Circle(oeilDroit.getCenterX() + 1, 6, 1, Color.BLACK);


        super.getChildren().add(basCorps);
        super.getChildren().add(oeilGauche);
        super.getChildren().add(retineGauche);
        super.getChildren().add(oeilDroit);
        super.getChildren().add(retineDroite);
    }

    @Override
    public void deplacerAGauche() {
        super.deplacerAGauche();
        //sens de tout
        basCorps.setX(basCorps.getX() - LARGEUR_MOITIE_PERSONNAGE + 10);
        basCorps.setY(basCorps.getY());
        oeilDroit.setCenterX(oeilDroit.getCenterX() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilDroit.setRadius(oeilDroit.getRadius());
        oeilGauche.setCenterX(oeilGauche.getCenterX() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilGauche.setRadius(oeilGauche.getRadius());


    }

    @Override
    public void deplacerADroite(double largeurJeu) {
        super.deplacerADroite(largeurJeu);
        //sens de la bouche
        basCorps.setX(basCorps.getX() + LARGEUR_MOITIE_PERSONNAGE - 10);
        basCorps.setY(basCorps.getY());
        oeilDroit.setCenterX(oeilDroit.getCenterX() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilDroit.setRadius(oeilDroit.getRadius());
        oeilGauche.setCenterX(oeilGauche.getCenterX() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilGauche.setRadius(oeilGauche.getRadius());
    }

    @Override
    public void deplacerEnBas(double hauteurJeu) {
        super.deplacerEnBas(hauteurJeu);
        //sens de la bouche
        basCorps.setY(basCorps.getY() + LARGEUR_MOITIE_PERSONNAGE - 10);
        basCorps.setX(basCorps.getX());
        oeilDroit.setCenterY(oeilDroit.getCenterY() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilDroit.setRadius(oeilDroit.getRadius());
        oeilGauche.setCenterY(oeilGauche.getCenterY() + LARGEUR_MOITIE_PERSONNAGE - 10);
        oeilGauche.setRadius(oeilGauche.getRadius());


    }

    @Override
    public void deplacerEnHaut() {
        super.deplacerEnHaut();
        //sens de la bouche
        basCorps.setY(basCorps.getY() - LARGEUR_MOITIE_PERSONNAGE + 10);
        basCorps.setX(basCorps.getX());
        oeilDroit.setCenterY(oeilDroit.getCenterY() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilDroit.setRadius(oeilDroit.getRadius());
        oeilGauche.setCenterY(oeilGauche.getCenterY() - LARGEUR_MOITIE_PERSONNAGE + 10);
        oeilGauche.setRadius(oeilGauche.getRadius());


    }


}