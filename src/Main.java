// Main.java
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Carlos", 37, "0812-1987-00021", "Ortopedia");
        Deportista deportista = new Deportista("Ana", 30, "0801-2000.00028", "Futbol");

        System.out.println(doctor.mostrarInformacion());
        System.out.println(deportista.mostrarInformacion());
    }
}
