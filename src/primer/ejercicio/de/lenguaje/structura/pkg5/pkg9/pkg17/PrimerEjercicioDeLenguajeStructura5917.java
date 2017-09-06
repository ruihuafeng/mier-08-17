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
   System.out.println("1. Dados."+"\n2. Suma acumulada"+"\n3. Multiplicacion"+"\n4. Piramide"+"\n5. Juego de adivinar"+"\n6. Deuda ");  
    int opc=0;
            opc = leer.nextInt();
      switch(opc){
          case 1:{
              /*Evaluar el resultado del lanzamiento de 3 dados, dadas las siguientes características:
Seis en los tres dados, Excelente
Seis en dos datos, Muy Bien
Seis en un dado, Regular
Ningún seis, Pésimo*/
                  ent.dados(); 
                  break;
          } 
          case 2:{/*Leer números mayores que 20, mostrar la suma acumulada de ellos.
                    El proceso termina cuando se lean 5 números pares.*/
                  ent.sumaacu(); 
                  break;
          } 
          case 3:{/*Permitir al usuario que intente hasta 5 veces el teclear el resultado de una multiplicación aleatoria, 
                   si el usuario no teclea el resultado en 5 intentos, indicar la respuesta correcta.*/
                  ent.mulpliccionale();
                  break;
          } 
          case 4:{/*Dibujar para un numero entero N las siguientes series: (Ejemplo N=5)
              * *****
              ** ****
              *** ***
              **** **
              ***** *             */
                  ent.pira(); 
                  break;   
          }
          case 5:{/*Juego de la adivinanza, se pedirá un numero entero N, el usuario debe ingresar un número y
              el programa debe decirle si el número que se debe adivinar es MAYOR o MENOR, 
              para que intente de nuevo, se termina cuando el usuario adivine el número.*/
                  ent.ju();
                  break;   
          }
         case 6:{/*Si se deja de pagar una tarjeta de crédito con una deuda de 6,000 y mes con mes el interés aumenta en un 15%,
                  decir a los cuantos meses la deuda será mayor de 55,000*/
                  ent.deuda();
                  break;   
          }
        // TODO code application logic here
    }
  }
}
