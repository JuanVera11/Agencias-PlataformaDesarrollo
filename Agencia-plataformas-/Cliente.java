public class Cliente {
    
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String cedula;
    protected String correo;

    public Cliente(String nombre, String apellido, String telefono, String cedula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }
    public String getCedula() { return cedula; }
    public String getCorreo() { return correo; }
     
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Telefono: " + telefono);
    }

    public void registraCliente() {
        System.out.println("El cliente ha sido registrado exitosamente");    
    }

    public void mostrarInformacion() {
        System.out.println("Informacion del cliente:");
        System.out.println(nombre + " " + apellido + " " + correo);
    }
}