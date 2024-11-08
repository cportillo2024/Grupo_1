// Deportista.java
public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String dni, String deporte) {
        super(nombre, edad, dni);
        this.deporte = deporte;
    }

    @Override
    public String mostrarInformacion() {
        return "Deportista: " + getNombre() + ", Edad: " + getEdad() + ", DNI: " + getDni() + ", Deporte: " + deporte;
    }

    // Getters y Setters
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
