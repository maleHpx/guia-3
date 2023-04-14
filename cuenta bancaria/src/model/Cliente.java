package model;

public class Cliente {
    //id, nombre y género (M o F) para el Cliente.
    private int id;
    private String nombre;
    private char genero;

    public Cliente(int id, String nombre, char genero)
    {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }
    public int getId()
    {
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public char getGenero()
    {
        return this.genero;
    }
}
