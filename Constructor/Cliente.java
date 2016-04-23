public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String telefono;
    private float saldo;

    public Cliente(int idCliente, String nombre, String telefono, float saldo) {
        this.idCliente  = idCliente;
        this.nombre     = nombre;
        this.telefono   = telefono;
        this.saldo      = saldo;
    }

    // Método que modifica al campo saldo
    public void acumularSaldo(float excedente) {
        saldo += excedente;
    }
}