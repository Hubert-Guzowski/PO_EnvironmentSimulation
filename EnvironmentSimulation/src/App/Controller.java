package App;

import EnvironmentData.Environment;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javafx.event.ActionEvent;

public class Controller {
    public TextArea speciesBox;
    public Button listingButton;

    public void pressListingButton(ActionEvent listingButtonPressed){
        speciesBox.setText("");
        speciesBox.appendText(SpeciesWriter.writeSpecies(Environment.allOfTheSpecies));
    }
}
