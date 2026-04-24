public class Hotel {

    protected String nombre_hotel;
    protected String direccion_hotel;
    protected String telefono_hotel;
    protected String correo_hotel;
    protected String sitio_web;
    protected int estrellas;
    protected int capacidad_total;
    protected boolean esta_abierto;
    String numero_habitaciones;

    public Hotel(String hotelNombre, String hotelDireccion, String hotelTelefono, String hotelCorreo, String habitacionesnum, String sitioWeb, int estrellas, int capacidad, boolean abierto) {
        this.nombre_hotel = hotelNombre;
        this.direccion_hotel = hotelDireccion;
        this.telefono_hotel = hotelTelefono;
        this.correo_hotel = hotelCorreo;
        this.numero_habitaciones = habitacionesnum;
        this.sitio_web = sitioWeb;
        this.estrellas = estrellas;
        this.capacidad_total = capacidad;
        this.esta_abierto = abierto;
    }

    public String getNombreHotel() { return nombre_hotel; }
    public String getDireccionHotel() { return direccion_hotel; }
    public String getTelefonoHotel() { return telefono_hotel; }
    public String getCorreoHotel() { return correo_hotel; }
    public String getNumeroHabitaciones() { return numero_habitaciones; }
    public String getSitioWeb() { return sitio_web; }
    public int getEstrellas() { return estrellas; }
    public int getCapacidadTotal() { return capacidad_total; }
    public boolean isEstaAbierto() { return esta_abierto; }

    public String getNombreCompleto() {
        return nombre_hotel;
    }

    public String getInfo() {
        return direccion_hotel + " | Tel: " + telefono_hotel + " | Email: " + correo_hotel + 
               " | Habitaciones: " + numero_habitaciones + " | Estrellas: " + estrellas + 
               " | Web: " + sitio_web + " | Abierto: " + (esta_abierto ? "Sí" : "No");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Informacion hotel: " + getInfo());
    }
}