// Main.java
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Carlos", 37, "0812-1987-00021", "Ortopedia", 20, "Hospital Central");
        Deportista deportista = new Deportista("Ana", 33, "0801-1990", "Futbol");

        // Mostrar información general
        System.out.println(doctor.mostrarInformacion());
        System.out.println(deportista.mostrarInformacion());

        // Funciones adicionales de Doctor
        System.out.println(doctor.mostrarExperiencia());

        // Funciones adicionales de Deportista
        System.out.println(deportista.entrenamientoDiario());
        System.out.println(deportista.mostrarEstadisticas());
        System.out.println(deportista.mensajeMotivacional());
        System.out.println(deportista.simularEntrenamiento());
        System.out.println(deportista.retoDeportivo());
    }
}
