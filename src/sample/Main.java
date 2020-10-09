//le programme n'est pas tant terminé. Il manque la verification pour la connexion et l'inscription.

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;

public class Main extends Application implements Serializable {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(600);
        stage.setHeight(700);
        stage.setTitle("Inscriptions!");
        stage.setResizable(false);


        Scene2 scene2Test = new Scene2();
        scene2Test.creerLabels();

        TextField prenom = new TextField();
        prenom.setPromptText("Prénom");
        prenom.setTranslateX((stage.getWidth() / 8) * 3);
        prenom.setTranslateY(60);

        TextField nomFamile = new TextField();
        nomFamile.setPromptText("Nom de famille");
        nomFamile.setTranslateX((stage.getWidth() / 8) * 3);
        nomFamile.setTranslateY(120);

        TextField nomUtilisateur = new TextField();
        nomUtilisateur.setPromptText("Nom d'utilisateur");
        nomUtilisateur.setTranslateX((stage.getWidth() / 8) * 3);
        nomUtilisateur.setTranslateY(180);

        PasswordField motPasse = new PasswordField();
        motPasse.setPromptText("Mot de passe");
        motPasse.setTranslateX((stage.getWidth() / 8) * 3);
        motPasse.setTranslateY(240);

        PasswordField motPasseConfirme = new PasswordField();
        motPasseConfirme.setPromptText("Mot de passe");
        motPasseConfirme.setTranslateX((stage.getWidth() / 8) * 3);
        motPasseConfirme.setTranslateY(300);

        RadioButton hommeBouton = new RadioButton("Homme");
        RadioButton femmeBouton = new RadioButton("Femme");
        RadioButton autreBouton = new RadioButton("Autre");
        hommeBouton.setTranslateX((stage.getWidth() / 8) * 3);
        hommeBouton.setTranslateY(360);
        femmeBouton.setTranslateX((stage.getWidth() / 8) * 4);
        femmeBouton.setTranslateY(360);
        autreBouton.setTranslateX((stage.getWidth() / 8) * 5);
        autreBouton.setTranslateY(360);

        ToggleGroup toggleGroup = new ToggleGroup();
        hommeBouton.setToggleGroup(toggleGroup);
        femmeBouton.setToggleGroup(toggleGroup);
        autreBouton.setToggleGroup(toggleGroup);

        Spinner spinnerAge = new Spinner(0, 122, 18);
        spinnerAge.setTranslateX((stage.getWidth() / 8) * 3);
        spinnerAge.setTranslateY(420);

        CheckBox conditionsUtili = new CheckBox("J'accepte les conditions d'utilisation");
        conditionsUtili.setTranslateX((stage.getWidth() / 8) * 3);
        conditionsUtili.setTranslateY(460);

        Button inscrisEnfin = new Button();
        inscrisEnfin.setText("S'inscrire");
        inscrisEnfin.setTranslateX((stage.getWidth() / 8) * 3);
        inscrisEnfin.setTranslateY(500);

        //inscrisEnfin.setDisable(true);

        Group textFields1 = new Group(prenom, nomFamile, nomUtilisateur, motPasse, motPasseConfirme);

        //textFields1.accessibleTextProperty().addListener((observable, oldValue, newValue) -> {
        //});

        if (prenom.getText().isEmpty() && nomFamile.getText() == null && nomUtilisateur.getText() != null &&
                motPasse.getText() != null && motPasseConfirme.getText() != null
                && toggleGroup.getSelectedToggle() != null && conditionsUtili.isSelected()) {
            inscrisEnfin.setDisable(false);
        }

        //scene3
        Label textChargement = new Label("Chargement du contenu...");
        textChargement.setTranslateX(225);
        textChargement.setTranslateY(450);

        Button retourAAvant = new Button();
        retourAAvant.setText("Retour à la fenêtre de connexion");
        retourAAvant.setTranslateX(350);
        retourAAvant.setTranslateY(600);


        //scene 1 / connexion
        TextField connexionNom = new TextField();
        connexionNom.setPromptText("Nom d'utilisateur");
        connexionNom.setTranslateX((stage.getWidth() / 8) * 3);
        connexionNom.setTranslateY(100);
        Label connexionNomLabel = new Label("Nom d'utilisateur");
        connexionNomLabel.setTranslateX((stage.getWidth() / 8) * 3);
        connexionNomLabel.setTranslateY(80);

        TextField connexionPasse = new TextField();
        connexionPasse.setPromptText("Mot de passe");
        connexionPasse.setTranslateX((stage.getWidth() / 8) * 3);
        connexionPasse.setTranslateY(160);
        Label connexionPasseLabel = new Label("Mot de passe");
        connexionPasseLabel.setTranslateX((stage.getWidth() / 8) * 3);
        connexionPasseLabel.setTranslateY(140);

        Button connecter = new Button();
        connecter.setText("Se connecter");
        connecter.setTranslateX((stage.getWidth() / 8) * 3);
        connecter.setTranslateY(200);

        Button inscrire = new Button();
        inscrire.setText("S'inscrire");
        inscrire.setTranslateX((stage.getWidth() / 8) * 4.35);
        inscrire.setTranslateY(200);

        //TODO work on input + connection seulement si dans le systeme
        //jai un boolean faux
        //si il devient vrai, je peux me connecter,
        //si il est faux, peux pas
        //pour quil devienne vrai, le nom utilisateur et mot de passe doivent etre dans le dossier

        /*boolean peutConnecter = false;
         *String line, user, pass;
         *
         *FileReader fr = new FileReader("Dossier.txt");
         *BufferedReader br = new BufferedReader(fr);
         *while ((line = br.readLine()) != null) {
         *   user = line.split(" ")[1].toLowerCase();
         *   pass = line.split(" ")[2].toLowerCase();
         *   if (user.equals(connexionNom.getText()) && pass.equals(connexionPasse.getText())){
         *       peutConnecter = true;
         *   }
         *}
         *if (peutConnecter = true){
         *}
         */

        FileOutputStream fileOutputStream = new FileOutputStream("Dossier.txt");
        PrintWriter pw = new PrintWriter(fileOutputStream);

        Group boutons2 = new Group(hommeBouton, femmeBouton, autreBouton, inscrisEnfin);
        Group things = new Group(spinnerAge, conditionsUtili);
        Group root2 = new Group(textFields1, boutons2, things, scene2Test);
        Scene scene2 = new Scene(root2);

        Group textAndLabel1 = new Group(connexionNom, connexionNomLabel, connexionPasse, connexionPasseLabel);
        Group boutons1 = new Group(connecter, inscrire);
        Group root1 = new Group(textAndLabel1, boutons1);
        Scene scene1 = new Scene(root1);
        stage.setScene(scene1);

        Group root3 = new Group(textChargement, retourAAvant);
        Scene scene3 = new Scene(root3);

        inscrire.setOnAction(event -> {
            stage.setScene(scene2);
        });

        //TODO verifier output (RadioButton)
        inscrisEnfin.setOnAction(event -> {
            pw.print(prenom.getText() + ", ");
            pw.print(nomFamile.getText() + ", ");
            pw.print(nomUtilisateur.getText() + ", ");
            pw.print(motPasse.getText() + ", ");
            pw.print(toggleGroup.getSelectedToggle() + ", ");
            pw.print(spinnerAge.getValue());
            pw.close();
            stage.setScene(scene1);
        });

        connecter.setOnAction(event -> {
            stage.setScene(scene3);
        });

        retourAAvant.setOnAction(event -> {
            stage.setScene(scene1);
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}