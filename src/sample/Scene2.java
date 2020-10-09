package sample;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Scene2 extends Group {

    boolean inscriptionValide = false;

    public void creerLabels() {

        Label prenomLabel = new Label("Prénom");
        prenomLabel.setTranslateX(225);
        prenomLabel.setTranslateY(40);

        Label nomFamilleLabel = new Label("Nom de famille");
        nomFamilleLabel.setTranslateX(225);
        nomFamilleLabel.setTranslateY(100);

        Label nomUtilisateurLabel = new Label("Nom d'utilisateur");
        nomUtilisateurLabel.setTranslateX(225);
        nomUtilisateurLabel.setTranslateY(160);

        Label motPasseLabel = new Label("Mot de passe");
        motPasseLabel.setTranslateX(225);
        motPasseLabel.setTranslateY(220);

        Label motPasseConfirmeLabel = new Label("Confirmer le mot de passe");
        motPasseConfirmeLabel.setTranslateX(225);
        motPasseConfirmeLabel.setTranslateY(280);

        Label boutonLabel = new Label("Genre");
        boutonLabel.setTranslateX(225);
        boutonLabel.setTranslateY(340);

        Label ageLabel = new Label("Âge");
        ageLabel.setTranslateX(225);
        ageLabel.setTranslateY(400);

        Group labels2 = new Group(prenomLabel, nomFamilleLabel, nomUtilisateurLabel, motPasseLabel,
                motPasseConfirmeLabel, boutonLabel, ageLabel);

        getChildren().add(labels2);

    }

}