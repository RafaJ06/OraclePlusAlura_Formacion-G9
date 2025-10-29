package DetallesPelicula;


import java.util.Scanner;

public class Principal {
    String mainMessage = """
           Welcome to my App! Which movie are you looking for?
           """;
    Scanner userMessage = new Scanner(System.in);


     public static void main(String[] args){

    ConexionPelicula newConnection = new ConexionPelicula();
    newConnection.searchMovie("return of the Jedi");

    }
}
