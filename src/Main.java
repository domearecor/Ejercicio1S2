public class Main {
    public static void main(String[] args) {

        // 1. Crear campaña de Instagram
        Campania campania1 = new Campania();
        campania1.nombre = "Lanzamiento Colección Verano";
        campania1.presupuesto = 450.0;
        campania1.plataforma = "Instagram";
        campania1.activa = false;

        // 2. Crear campaña de TikTok
        Campania campania2 = new Campania();
        campania2.nombre = "Reto Viral Trends";
        campania2.presupuesto = 600.0;
        campania2.plataforma = "TikTok";
        campania2.activa = false;

        // 3. Crear campaña de Facebook
        Campania campania3 = new Campania();
        campania3.nombre = "Remarketing Clientes Web";
        campania3.presupuesto = 300.0;
        campania3.plataforma = "Facebook";
        campania3.activa = false;

        // Cambiar el estado de solamente una campaña
        campania2.activar(); // Activamos únicamente la de TikTok

        // Mostrar la información de cada una
        campania1.mostrarInformacion();
        campania2.mostrarInformacion();
        campania3.mostrarInformacion();
    }
}
