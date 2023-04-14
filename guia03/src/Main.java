import model.Autor;
import model.Libro;

public class Main {
    public static void main(String[] args) {
        //1
        Autor autor = new Autor("Joshua", "Bloch", "joshua@gmail.com", 'M');
        //System.out.println(autor.toString());

        Libro effectiveJava = new Libro("Effective Java", 450, 150, autor);
        //System.out.println(effectiveJava.toString());

        effectiveJava.setPrecio(500);
        effectiveJava.setStock(effectiveJava.getStock()+50);
        System.out.println(effectiveJava.toString());

        //System.out.println(effectiveJava.getAutor());
        effectiveJava.mensajePrecioLibro();


    }
}