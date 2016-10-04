/*
    Algoritmos y Estructura de Datos
    Hoja de Trabajo 8

    Integrantes:
    Alejandro Chaclan
    Jose Antonio Ramirez
 */

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String enfermedad;
    private Character prioridad;

    public Paciente(String nombre, String enfermedad, Character prioridad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public Character getPrioridad() {
        return prioridad;
    }

    public String toString () {
        return nombre + ", " + enfermedad + ", " + prioridad;
    }

    public int compareTo(Paciente other) {
        return this.prioridad.compareTo(other.getPrioridad());
    }
}
