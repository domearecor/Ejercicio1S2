public class Campania {

    // Atributos públicos
    public String nombre;
    public double presupuesto;

    // Atributos con acceso por defecto (sin modificador)
    String plataforma;
    boolean activa;

    // Métodos públicos
    public void mostrarInformacion() {
        System.out.println("Campaña: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Presupuesto: $" + presupuesto);
        System.out.println("Estado: " + (activa ? "Activa" : "Inactiva"));
        System.out.println("------------------------------------");
    }

    public void activar() {
        activa = true;
    }

    // Métodos con acceso por defecto
    void desactivar() {
        activa = false;
    }

    void mostrarPresupuesto() {
        System.out.println("Presupuesto de " + nombre + ": $" + presupuesto);
    }
}