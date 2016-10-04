/*
    Algoritmos y Estructura de Datos
    Hoja de Trabajo 8

    Integrantes:
    Alejandro Chaclan
    Jose Antonio Ramirez
 */

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class main {
    public static void main (String[] args) {
        Vector<Paciente> vector = new Vector<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\pacientes.txt")); // Direccion donde se encuentra el archivo

            String bfRead;

            //Realiza el ciclo, mientras bfRead tiene datos
            while ((bfRead = bf.readLine()) != null) {
                //Se separan los datos del paciente
                String[] array = bfRead.split(",");
                String nombre = array[0];
                String enfermedad = array[1].substring(1);
                Character c = array[2].charAt(1);

                //Se crea un objeto de Paciente y se agrega al vector
                Paciente temp = new Paciente(nombre, enfermedad, c);
                vector.add(temp);
            }

        //En caso de no poder abrir el archivo, imprime "ERROR"
        } catch (Exception e) {
            System.err.println("ERROR: No se encontro archivo");
        }

        //Se crea el vector de Heap con los datos de los pacientes
        VectorHeap<Paciente> vectorHeap = new VectorHeap<>(vector);

        int cont = vectorHeap.size();
        //Se muestra en pantalla el orden de los pacientes segun su prioridad
        for (int i = 0; i < cont; i++) {
            Paciente temp = vectorHeap.remove();
            System.out.println(temp.toString());
        }
    }
}
