package model;

public class Cuenta {
    // identificador, un balance y un Cliente que es el dueño de la cuenta.
    //La Cuenta debe exponer los métodos depositar y extraer que modifican el balance de la misma.
    // Algo a tener en cuenta es que el método extraer no puede extraer dinero si el balance total no lo permite,
    // si esto sucede se debe imprimir un mensaje por pantalla que indique que la cuenta no posee saldo suficiente.

    private int id;
    private int balance;
    private Cliente cliente;

    public Cuenta(int id,  int balance, Cliente cliente)
    {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
}
