package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static java.io.File.separator;

public class Exercice1 extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        // Création du conteneur principal

        BorderPane Box = new BorderPane();


        // Création du conteneur correspondant au menu

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        MenuItem menu11 = new MenuItem("New");
        MenuItem menu12 = new MenuItem("Open");
        MenuItem menu13 = new MenuItem("Save");
        MenuItem menu14 = new MenuItem("Close");

        MenuItem menu21 = new MenuItem("Cut");
        MenuItem menu22 = new MenuItem("Copy");
        MenuItem menu23 = new MenuItem("Paste");

        SeparatorMenuItem separator = new SeparatorMenuItem();
        SeparatorMenuItem separator2 = new SeparatorMenuItem();
        SeparatorMenuItem separator3 = new SeparatorMenuItem();
        SeparatorMenuItem separator4 = new SeparatorMenuItem();
        SeparatorMenuItem separator5 = new SeparatorMenuItem();

        menu1.getItems().addAll(menu11,separator,menu12,separator2,menu13,separator3,menu14);
        menu2.getItems().addAll(menu21,separator4,menu22,separator5,menu23);

        Box.setTop(menuBar);


        // Création de la Gauche

        VBox Boutons = new VBox();

        Text Texte = new Text();
        Texte.setText("Boutons : ");

        Button Bouton1 = new Button("Bouton 1");
        Button Bouton2 = new Button("Bouton 2");
        Button Bouton3 = new Button("Bouton 3");

        Boutons.setSpacing(10);
        Boutons.getChildren().addAll(Texte,Bouton1,Bouton2,Bouton3);
        Box.setLeft(Boutons);
        BorderPane.setMargin(Boutons, new Insets(120, 10, 10, 70));
        BorderPane.setAlignment(Boutons, Pos.CENTER);


        // Création du Centre

        Separator sep1 = new Separator(Orientation.VERTICAL);
        Box.setCenter(sep1);
        
        // Création de la Droite

        GridPane gridpane = new GridPane();
        gridpane.getColumnConstraints().add(new ColumnConstraints(100));
        gridpane.getColumnConstraints().add(new ColumnConstraints(200));

        TextField ZoneTexte1 = new TextField();
        GridPane.setRowIndex(ZoneTexte1, 0);
        GridPane.setColumnIndex(ZoneTexte1, 1);

        TextField ZoneTexte2 = new TextField();
        GridPane.setRowIndex(ZoneTexte2, 1);
        GridPane.setColumnIndex(ZoneTexte2, 1);

        TextField ZoneTexte3 = new TextField();
        GridPane.setRowIndex(ZoneTexte3, 2);
        GridPane.setColumnIndex(ZoneTexte3, 1);

        Text TexteZoneTexte1 = new Text();
        GridPane.setRowIndex(TexteZoneTexte1, 0);
        GridPane.setColumnIndex(TexteZoneTexte1, 0);
        TexteZoneTexte1.setText("Name:");

        Text TexteZoneTexte2 = new Text();
        GridPane.setRowIndex(TexteZoneTexte2, 1);
        GridPane.setColumnIndex(TexteZoneTexte2, 0);
        TexteZoneTexte2.setText("Email:");

        Text TexteZoneTexte3 = new Text();
        GridPane.setRowIndex(TexteZoneTexte3, 2);
        GridPane.setColumnIndex(TexteZoneTexte3, 0);
        TexteZoneTexte3.setText("Password:");

        Button Submit = new Button("Submit");
        Button Refresh = new Button("Refresh");


        gridpane.setVgap(10);
        gridpane.getChildren().addAll(ZoneTexte1,ZoneTexte2,ZoneTexte3,TexteZoneTexte1,TexteZoneTexte2,TexteZoneTexte3);
        Box.setRight(gridpane);
        BorderPane.setMargin(gridpane, new Insets(100, 100, 10, 150));
        BorderPane.setAlignment(gridpane, Pos.CENTER);

        // Création du bandeau en bas de la fenêtre

        VBox Bottom = new VBox();

        Separator sep2 = new Separator(Orientation.HORIZONTAL);

        Text Texte2 = new Text();
        Texte2.setText("Ceci est un label de bas de page");

        Bottom.getChildren().addAll(sep2,Texte2);
        Bottom.setAlignment(Pos.BOTTOM_CENTER );
        Bottom.setSpacing(7);
        Box.setBottom(Bottom);


        // Ajout des contrôleurs au conteneur principal

        Box.getChildren().addAll();


        // Ajout du conteneur à la scene

        Scene scene = new Scene( Box );


        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)

        stage.setScene( scene );
        stage.setWidth( 800 );
        stage.setHeight( 600 );
        stage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
