public class Main {
    public static void main(String[] args) {
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("GestorInventario", "2.1");
        Aplicacion app3 = new Aplicacion("PortalRRHH", "1.5");

        app1.mostrarInformacion();
        app2.mostrarInformacion();
        app3.mostrarInformacion();

        app1.iniciar();
        app1.mostrarInformacion();

        System.out.println("Total de aplicaciones instanciadas: " + Aplicacion.getTotalAplicaciones());
    }
}