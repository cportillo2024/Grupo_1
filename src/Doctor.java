// Doctor.java
public class Doctor extends Persona {
    private String especialidad;
    private int aniosDeExperiencia;
    private String hospital;

    public Doctor(String nombre, int edad, String dni, String especialidad, int aniosDeExperiencia, String hospital) {
        super(nombre, edad, dni);
        this.especialidad = especialidad;
        this.aniosDeExperiencia = aniosDeExperiencia;
        this.hospital = hospital;
    }

    @Override
    public String mostrarInformacion() {
        return "Doctor: " + getNombre() + ", Edad: " + getEdad() + ", DNI: " + getDni() + 
               ", Especialidad: " + especialidad + ", Anos de Experiencia: " + aniosDeExperiencia + 
               ", Hospital: " + hospital;
    }

    public String mostrarExperiencia() {
        return "El Dr. " + getNombre() + " tiene " + aniosDeExperiencia + " anos de experiencia en " + especialidad + ".";
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    public void setAniosDeExperiencia(int aniosDeExperiencia) {
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}

