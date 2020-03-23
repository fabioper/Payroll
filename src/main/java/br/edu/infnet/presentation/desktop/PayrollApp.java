package br.edu.infnet.presentation.desktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class PayrollApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var root = getViewResource("main");
        var scene = new Scene(root, 350, 450);

        primaryStage.setTitle("Folha de Pagamento");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Parent getViewResource(String viewName) throws java.io.IOException {
        URL viewResource = getClass().getResource("/views/" + viewName + ".fxml");
        return FXMLLoader.load(viewResource);
    }
}
