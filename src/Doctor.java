// Doctor.java
public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String dni, String especialidad) {
        super(nombre, edad, dni);
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarInformacion() {
        return "Doctor: " + getNombre() + ", Edad: " + getEdad() + ", DNI: " + getDni() + ", Especialidad: " + especialidad;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
