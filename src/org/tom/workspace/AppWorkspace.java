package org.tom.workspace;

import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;
import org.tom.App;
import org.tom.data.Index;

import java.io.File;
import java.util.List;

public class AppWorkspace {
    private Toolbar toolbar;
    private VBox root;
    private GridPane actionButtonPane;
    private App app;
    private Label currentFileLabel;

    public AppWorkspace(@NotNull App app) {
        this.app = app;
        this.toolbar = new Toolbar(app.getPrimaryStage());
        this.root = new VBox();
        this.actionButtonPane = new GridPane();

        currentFileLabel = new Label("");
        TableView<Index> contentsTable = new TableView<>();
    }
}
