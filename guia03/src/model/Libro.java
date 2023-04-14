package model;

public class Libro {
    //titulo, precio, stock
    private String titulo;
    private int precio;
    private int stock;
    private Autor autor;
    public Libro(String titulo, int precio, int stock, Autor autor){
       this.titulo = titulo;
       this.precio = precio;
       this.stock = stock;
       this.autor = autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getStock() {
        return this.stock;
    }
    public Autor getAutor(){
        return this.autor;
    }

    @Override
    public String toString(){
        return "Libro= \n" + "titulo: " + titulo + "\nprecio: " + precio + "\nstock: " + stock +
                "\n" + autor;
    }

    public void mensajePrecioLibro(){
        System.out.println("El libro " + this.titulo + " de " + this.autor.getNombre() + " se vende a " + this.precio + " pesos.");//MODIF
    }
}
