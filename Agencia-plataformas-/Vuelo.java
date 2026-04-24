
public class Vuelo {

    public String nombre;
    public int telefono;
    public int hora;
    public String codigoVuelo;
    public String ubicacion;
    public String aerolinea;
    public String origen;
    public String destino;
    public double precio;

    
    public Vuelo(String nombre, String codigoVuelo, String aerolinea, int telefono, int hora, String origen, String destino, String ubicacion, double precio) {
        this.nombre = nombre;
        this.codigoVuelo = codigoVuelo;
        this.aerolinea = aerolinea;
        this.telefono = telefono;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getHora() {
        return hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void mostrarInfo() {
        System.out.println("Vuelo: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Hora: " + hora);
        System.out.println("Ubicación: " + ubicacion);
    }

    public void mostrarInfo(boolean detallado) {
        if (detallado) {
            System.out.println("--- DETALLE COMPLETO DEL VUELO ---");
            System.out.println("Pasajero: " + nombre);
            System.out.println("Código de Vuelo: " + codigoVuelo);
            System.out.println("Aerolínea: " + aerolinea);
            System.out.println("Origen: " + origen);
            System.out.println("Destino: " + destino);
            System.out.println("Ubicación/Puerta: " + ubicacion);
            System.out.println("Hora: " + hora);
            System.out.println("Teléfono Contacto: " + telefono);
            System.out.println("Precio: $" + precio);
        } else {
            mostrarInfo();
        }
    }

    public void mostrarInfo(String mensaje) {
        System.out.println(mensaje + " " + nombre  + " para el vuelo " + codigoVuelo);
    }
}
    
