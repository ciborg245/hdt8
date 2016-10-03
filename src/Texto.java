
import java.io.BufferedReader;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Ramirez, Alejandro Chaclan
 */
public class Texto {
    
     //leer archivo .txt
    public String [] leerTxt(){ // direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader("C:\\\\Users\\\\Jose Ramirez\\\\Downloads\\\\texto.txt")); // Direccion donde se encuentra el archivo
            String temp = "";
            String bfRead;
            //Realiza el ciclo, mientras bfRead tiene datos
            while((bfRead = bf.readLine()) != null ){
                temp = temp + bfRead; //Guarda e; txt del Archivo
            }
            // Guarda el texto en la variable "texto"
            texto = temp;    
        
        //En caso de no poder abrir el archivo, imprime "ERROR"
        }catch (Exception e){
            System.err.println("ERROR: No se encontro archivo");
        }
        
        //Realiza las divisiones en el String cada vez que encuentra un espacio 
        String[] array = texto.split(",");
       
        //Imprime y Retorna el array 
        System.out.println(texto);
        return array;   
    }
}
