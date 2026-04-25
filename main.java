public class main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Termales del Ruiz", "Vía al Nevado", "3101234567", "info@termales.com", "20", "www.termales.com", 4, 50, true);

        Vuelo vuelo1 = new Vuelo("Juan Esteban Vera", "AV204", "Avianca", 8840000, 14, "Manizales", "Bogotá", "Puerta 2", 150000.0);

        Paquete planVip = new Paquete(1, "Escapada al Nevado", vuelo1, hotel1, "Alta", 3, 10.0, true);

        planVip.mostrarDetallePaquete();
    }
}