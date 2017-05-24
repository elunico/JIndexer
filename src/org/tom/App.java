package org.tom;

import javafx.application.Application;
import javafx.stage.Stage;
import org.tom.files.FileController;
import org.tom.workspace.AppController;
import org.tom.workspace.AppWorkspace;

/**
 * @author Thomas Povinelli
 *         Created 5/23/17
 *         In Indexer
 */
public class App extends Application {

    private Stage primaryStage;
    private AppWorkspace workspace;
    private FileController fileController;


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        workspace = new AppWorkspace(this);
        fileController = new FileController(this);
        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
