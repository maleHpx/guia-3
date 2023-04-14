package model;

public class Autor {
    //y Autor, este último posee las características de nombre, apellido, email y genero ( ‘M’ o ‘F’ ).
    private String nombre;
    private String apellido;
    private String email;
    private char genero;
    public Autor(String nombre, String apellido, String email, char genero){
        this.nombre= nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGenero() {
        return this.genero;
    }
    @Override
    public String toString(){
        return "Autor= \n" + "nombre: " + nombre + "\napellido: " + apellido + "\nemail: " + email + "\ngenero: " + genero;
    }
}
