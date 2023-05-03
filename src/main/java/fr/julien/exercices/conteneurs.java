package fr.julien.exercices;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class conteneurs extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        // gauche
        HBox topControls = new HBox();
        topControls.setAlignment( Pos.BASELINE_LEFT );
        Button btnRefresh = new Button("Refresh");

        HBox topRightControls = new HBox();
        HBox.setHgrow(topRightControls, Priority.ALWAYS );
        topRightControls.setAlignment( Pos.BASELINE_LEFT );
        Hyperlink signOutLink = new Hyperlink("Sign Out");
        topRightControls.getChildren().add( signOutLink );

        topControls.getChildren().addAll( btnRefresh, topRightControls );

        Separator sep = new Separator(Orientation.VERTICAL);

        // Création du bandeau en bas de la fenêtre
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_CENTER );
        Label welcomeText = new Label("Ceci est un label de bas de page");
        bottomControls.getChildren().add( welcomeText);

        Menu menu1 = new Menu("File");
        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Close");

        SeparatorMenuItem separator = new SeparatorMenuItem();
        menu1.getItems().addAll(item1, item2, item3, item4);
        Menu menu2 = new Menu("Edit");
        MenuItem item5 = new MenuItem("Cut");
        MenuItem item6 = new MenuItem("Copy");
        MenuItem item7 = new MenuItem("Paste");
        menu2.getItems().addAll(item5, item6, item7);

        Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        BorderPane root = new BorderPane();


        Button btn1 = new Button("Btn 1");
        Button btn2 = new Button("Btn 2");
        Button btn3 = new Button("Btn 3");
        Button btn4 = new Button("Btn 4");



        //btnLeft.setPadding(new Insets(5, 5, 5, 5));
        // Set margin for left area.
        //BorderPane.setMargin(btnLeft, new Insets(10, 10, 10, 10));

        VBox buttons = new VBox();
        buttons.getChildren().addAll(btn1,btn2, btn3, btn4 );

        root.setTop(menuBar);
        root.setLeft(root.setCenter(buttons));
        root.setBottom(bottomControls);



        // Ajout du conteneur à la scene
        Scene scene = new Scene(root );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
