/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosumafin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioSumaFin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Haz un programa que pida al usuario valores numéricos hasta que el usuario escriba FIN.
        //El programa irá sumando esos valores y cuando termine, mostrará la suma total. 
     
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fin;
         String respuesta = "fin";
         int suma = 0;
        int numero = 0;
         do {
          System.out.println("Escribe un numero");
         numero = Integer.parseInt(br.readLine()); 
            
           suma = suma + numero;
          
        } while (true);
        
        
           
          
           
         
           
          
           
           
         
           
              
               
              
          }
        
      
           
           
           
       
       
       
     
   
        
     }       
       
  
       
     
   
