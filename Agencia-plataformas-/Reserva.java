public class Reserva {

    int id;
    String usuario;
    String vuelo;
    String hotel;
    String fechaReserva;
    double precioTotal;
    boolean esPagada;
    String estado; 

    public void crear(int id, String usuario, String vuelo, String hotel, String fechaReserva, double precioTotal, boolean esPagada, String estado) {
        this.id = id;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.fechaReserva = fechaReserva;
        this.precioTotal = precioTotal;
        this.esPagada = esPagada;
        this.estado = estado;
    }

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
        System.out.println("----------------------------------");
    }
}