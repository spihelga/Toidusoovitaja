import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox vbox = new VBox();
		Scene tegevus = new Scene(vbox, 400, 300);

		primaryStage.setScene(tegevus);
		primaryStage.show();

		Label pealkiri = new Label("Kas soovid kokteile segada?");
		Button jah = new Button("Jah");
		Button ei = new Button("ei");

		vbox.getChildren().addAll(pealkiri, jah, ei);

		VBox alustame = new VBox();
		Scene algusstseen = new Scene(alustame, 500, 1000);

		jah.setOnAction(event -> {
			String vastusjah = "Pidu!";
			System.out.println(vastusjah);
			primaryStage.setScene(algusstseen);
		});

		ei.setOnAction(event -> {
			String vastusei = "Siis ei ole pidu vist";
			System.out.println(vastusei);
		});

	}
}