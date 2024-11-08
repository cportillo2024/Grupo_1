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
    
    public String entrenamientoDiario() {
        return "La deportista " + getNombre() + " entrena 2 horas diarias de " + deporte + ".";
    }

    public String mostrarEstadisticas() {
        return "Estadisticas de " + getNombre() + ": Ha entrenado " + (int)(Math.random() * 100) + " horas en total este mes.";
    }

    public String mensajeMotivacional() {
        String[] mensajes = {
            "¡Sigue trabajando duro! El esfuerzo siempre da frutos.",
            "Cada dia es una oportunidad para mejorar.",
            "El exito está en tus manos. ¡A entrenar!",
            "No te detengas. Cada gota de sudor cuenta."
        };
        return mensajes[(int)(Math.random() * mensajes.length)];
    }

    public String simularEntrenamiento() {
        String[] actividades = {"correr", "nadar", "hacer pesas", "andar en bicicleta"};
        String actividad = actividades[(int)(Math.random() * actividades.length)];
        return "Hoy " + getNombre() + " ha entrenado " + actividad + " durante 1 hora.";
    }

    public String retoDeportivo() {
        return getNombre() + " tiene el reto de entrenar 5 dias esta semana para mejorar en " + deporte + ".";
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
