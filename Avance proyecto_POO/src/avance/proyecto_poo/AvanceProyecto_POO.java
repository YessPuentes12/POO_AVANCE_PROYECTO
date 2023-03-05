/*
22550338
 */
package avance.proyecto_poo;

import java.util.Scanner;


public class AvanceProyecto_POO {

 
    public static void main(String[] args) {
    System.out.println("Energia de átomos de hidrógeno.");
    energia();
    }
 
   public static void energia(){
   Scanner leer = new Scanner(System.in);
 
    double RH =2.18*Math.pow(10,-18);
    double nI,nF;
   
    System.out.println("Nivel inicial:");
    nI = leer.nextInt();
    System.out.println("Nivel final:");
     nF = leer.nextInt();
    double  E1 = (1/(nI*nI))-(1/(nF*nF));
    double E2 = RH*E1;
    System.out.println("La energia es de: " +E2+ " Joules");
    
     if (nI<nF){
         System.out.println("Absorbe energía.");       
     } else if (nI>nF){
         System.out.println("Libera energía.");     
     }
   
 } 
    

   
    
    
   } 

