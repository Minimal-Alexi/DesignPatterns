import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HistoryWindow {
    private Controller controller;

    public HistoryWindow(Controller controller) {
        this.controller = controller;
    }

    public void show() {
        Stage stage = new Stage();
        ListView<String> listView = new ListView<>();

        // Display index or summary for each memento
        int index = 0;
        for (IMemento m : controller.getHistory()) {
            listView.getItems().add("State " + (index++) + ": " + m.getTimestamp());
        }

        Button restoreButton = new Button("Restore Selected");
        restoreButton.setOnAction(e -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                IMemento selected = controller.getHistory().get(selectedIndex);
                controller.restoreState(selected);
                stage.close();
            }
        });

        VBox root = new VBox(listView, restoreButton);
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.setTitle("State History");
        stage.show();
    }
}
