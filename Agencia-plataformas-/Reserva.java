public class Reserva {

    private int id;
    private String usuario;
    private String vuelo;
    private String hotel;
    private String fechaReserva;
    private double precioTotal;
    private boolean esPagada;
    private String estado;

    // Constructor vacío
    public Reserva() {}

    // Constructor con parámetros
    public Reserva(int id, String usuario, String vuelo, String hotel, String fechaReserva, double precioTotal) {
        this.id = id;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.fechaReserva = fechaReserva;
        this.precioTotal = precioTotal;
        this.esPagada = false;
        this.estado = "Pendiente";
    }

    // Métodos de lógica
    public void confirmarPago() {
        this.esPagada = true;
        this.estado = "Confirmada";
    }

    public void cancelarReserva() {
        this.estado = "Cancelada";
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getVuelo() { return vuelo; }
    public void setVuelo(String vuelo) { this.vuelo = vuelo; }

    public String getHotel() { return hotel; }
    public void setHotel(String hotel) { this.hotel = hotel; }

    public String getFechaReserva() { return fechaReserva; }
    public void setFechaReserva(String fechaReserva) { this.fechaReserva = fechaReserva; }

    public double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(double precioTotal) { this.precioTotal = precioTotal; }

    public boolean isEsPagada() { return esPagada; }
    public void setEsPagada(boolean esPagada) { this.esPagada = esPagada; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    // Impresión de datos
    public void mostrarReserva() {
        System.out.println("ID Reserva: " + this.id);
        System.out.println("Cliente: " + this.usuario);
        System.out.println("Vuelo Asignado: " + this.vuelo);
        System.out.println("Hotel Reservado: " + this.hotel);
        System.out.println("Fecha: " + this.fechaReserva);
        System.out.println("Estado actual: " + this.estado);
    }

    public void imprimirResumen() {
        System.out.println("\n==================================");
        System.out.println("        DETALLE DE RESERVA        ");
        System.out.println("==================================");
        System.out.println("Reserva No: " + this.id);
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Total a pagar: $" + this.precioTotal);
        System.out.println("¿Pago realizado?: " + (this.esPagada ? "Sí" : "Pendiente"));
        System.out.println("Estado: " + this.estado);
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
        Reserva miReserva = new Reserva(101, "Juan", "AV123", "Hilton", "2026-05-15", 450.0);
        miReserva.imprimirResumen();
        
        miReserva.confirmarPago();
        miReserva.imprimirResumen();
    }
}