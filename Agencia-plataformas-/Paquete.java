public class Paquete {
    private int idPaquete;
    private String nombrePromocion;
    private Vuelo vueloAsignado;
    private Hotel hotelAsignado;
    private String temporada;
    private double descuento;
    private int diasDuracion;
    private boolean incluyeSeguroMedico;

    public Paquete(int id, String nombre, Vuelo vuelo, Hotel hotel, String temporada, int dias, double descuento, boolean seguro) {
        this.idPaquete = id;
        this.nombrePromocion = nombre;
        this.vueloAsignado = vuelo;
        this.hotelAsignado = hotel;
        this.temporada = temporada;
        this.diasDuracion = dias;
        this.descuento = descuento;
        this.incluyeSeguroMedico = seguro;
    }

    public double calcularPrecioFinal() {
        double precioBaseHotel = hotelAsignado.getEstrellas() * 50.0;
        double subtotal = vueloAsignado.precio + (precioBaseHotel * diasDuracion);
        
        if (incluyeSeguroMedico) {
            subtotal += 30.0;
        }

        return subtotal - (subtotal * (descuento / 100));
    }

    public void mostrarDetallePaquete() {
        System.out.println(" COMBO VACACIONAL: " + nombrePromocion + ": ");
        System.out.println("Hotel: " + hotelAsignado.getNombreHotel());
    
        System.out.println("Vuelo: " + vueloAsignado.codigoVuelo);
        System.out.println("Precio Final: $" + calcularPrecioFinal());
    }
}