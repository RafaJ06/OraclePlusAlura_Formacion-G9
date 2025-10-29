import DetallesPelicula.*;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Peliculas {

    @SerializedName("title")
    String title;
    String director;
   // @SerializedName("release_date")
    int releaseDate;
    String producer;
    List<String> planets = new ArrayList<>();
    List<String> vehicles;
    List<String> starShips;
    List<String> characters;
   List< String> species;


@Override
    public String toString(){

        return """
                Title: %s
                Director: %s
                Release Date: %d
                Producer: %s
                """.formatted(title, director, releaseDate, producer);
    }
}
