public class Reserva {

    int id;
    String usuario;
    String vuelo;
    String hotel;
    String fechaReserva;
    double precioTotal;
    boolean esPagada;
    String estado; 

     public void crear(int id, String usuario, String vuelo, String hotel, String fecha, double precio, boolean pagada, String estado) {
        this.id = id;
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.fechaReserva = fecha;
        this.precioTotal = precio;
        this.esPagada = pagada;
        this.estado = estado;
    }

    public void mostrarReserva() {
        System.out.println("ID Reserva: " + id);
        System.out.println("Cliente: " + usuario);
        System.out.println("Vuelo Asignado: " + vuelo);
        System.out.println("Hotel Reservado: " + hotel);
        System.out.println("Fecha: " + fechaReserva);
        System.out.println("Estado actual: " + estado);
    }

    public void imprimirResumen() {
        System.out.println("\n==================================");
        System.out.println("        DETALLE DE RESERVA        ");
        System.out.println("==================================");
        System.out.println("Reserva No: " + id);
        System.out.println("Usuario: " + usuario);
        System.out.println("Total a pagar: $" + precioTotal);
        System.out.println("¿Pago realizado?: " + (esPagada ? "Sí" : "Pendiente"));
        System.out.println("----------------------------------");
    }
}