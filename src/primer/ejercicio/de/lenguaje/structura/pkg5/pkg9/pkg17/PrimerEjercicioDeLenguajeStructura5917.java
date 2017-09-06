/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.ejercicio.de.lenguaje.structura.pkg5.pkg9.pkg17;

import java.util.Scanner;

/**
 *
 * @author ruihu
 */
public class PrimerEjercicioDeLenguajeStructura5917 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);
   opc ent = new opc ();
   /* La primer pregunta
  ent.dados(); 
  La segunda pregunta 
  ent.sumaacu();
   El tercero pregunta 
   ent.mulpliccionale();
   El piramide 
   ent.pira();*/
   System.out.println("Ingresa el opcion para realizar estos 4 procesos ;");  
   System.out.println("1. Dados."+"\n2. Suma acumulada"+"\n3. Multiplicacion"+"\n4. Piramide");  
    int opc=0;
            opc = leer.nextInt();
      switch(opc){
          case 1:{
                  ent.dados(); 
                  break;
          } 
          case 2:{
                  ent.sumaacu(); 
                  break;
          } 
          case 3:{
                  ent.mulpliccionale();
                  break;
          } 
          case 4:{
                  ent.pira(); 
                  break;   
          }
        // TODO code application logic here
    }
  }
}
