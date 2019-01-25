package App;

import EnvironmentData.Environment;
import EnvironmentData.Species;

import java.util.List;

public class SpeciesWriter {

    public static String writeSpecies(List<Species> allOfTheSpecies){
        StringBuilder text = new StringBuilder("");
        text.append("Lista gatunków wraz z informacjami:\n");
            for (Species species : allOfTheSpecies) {
                text.append(("Gatunek "));
                text.append((species.speciesID));
                text.append((" ma aktualnie "));
                text.append((String.valueOf(species.numberOfAnimals)));
                text.append((" żyjących przedstawicieli."));
                if(species.tickOfExtinction != 0){
                    text.append((" Wymarł "));
                    text.append((String.valueOf(species.tickOfExtinction/4)));
                    text.append((" lat temu. :(\n"));
                }else{
                    text.append(("\n"));
                }
            }
            return text.toString();
    }
}
