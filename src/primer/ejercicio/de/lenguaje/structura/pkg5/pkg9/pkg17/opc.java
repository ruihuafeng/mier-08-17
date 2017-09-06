/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.ejercicio.de.lenguaje.structura.pkg5.pkg9.pkg17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ruihu
 */
public class opc {
    
 // primer pregunta
public void dados(){
//define los valores de los dados
Random ent = new Random ();
//crear 3 dados
int dado1; 
int dado2;
int dado3; 
//define los valores de los dados
dado1= ent.nextInt(6)+1;
dado2 = ent.nextInt(6)+1;
dado3 = ent.nextInt(6)+1;
//Imprimir los 3 dados
System.out.println("El primer dado es: "+dado1);
System.out.println("El segundo dado es: "+dado2);
System.out.println("El tercero dado es: "+dado3);
//condiciones
if(dado1==6&&dado2==6&&dado3==6)
{
System.out.println("El seis en los 3 dados es : Excelente");
}
else if (
  dado1==6&&dado2==6||dado3==6&&dado3==6||dado2==6&&dado1==6||dado2==6&&dado3==6){
System.out.println("El seis en los 3 dados es :Muy Bien");
}else if (
  dado1==6||dado2==6||dado3==6){
System.out.println("El seis en los 3 dados es :Reguar");
}else {
System.out.println("El resultado de dado es Pesimo");   
}
 }
//  segunda preguta    
public void sumaacu ()
{
//leer numeros mayors que 20,mostrar la suma acumulada de ellos. el proceso termina cuando se leean 5 numero pares 
Scanner leer = new Scanner (System.in); 
int num=0,i=0,suma=0,total=0;
System.out.println("****Leer numeros mayors que 20, mostrar la suma acumulada de ellos solo en pares****");
while(i<=4){   
 System.out.println("Ingresa numeros como tu quieras : ");
 num=leer.nextInt();   
 if(num>20){
   if (num%2==0){
   suma=suma+num;
   i++;
    }
    }
}
total=suma;
System.out.println("EL suma Acumulada Total es :"+total);
}
 public void mulpliccionale ()
 {
 Scanner leer = new Scanner (System.in);
 /*int numero=0,multi=1,i=0,total=0;
 while(i<=4)
 {
 System.out.println("Ingresa numeros para el multiplicacion  : ");
 numero=leer.nextInt();
 //if(numero!=0){
 multi = multi*numero;
 i++;
 //}    
 }
total= multi;
System.out.println("El resultado de la multiplicacion sera:"+total);
 } */
Random ent = new Random(); 
int contador=0,maxinten=5,m1,m2,mayor=0;
m1 = ent.nextInt(5)+1;
m2 = ent.nextInt(5)+1;
int res;
res= m1*m2;
System.out.println("Tienes 5 Veces de  intentos Para este multiplicacion");
System.out.println(+m1+"*"+m2+"=");
do{ 
int resultado2 = leer.nextInt();
if(resultado2 == res){
System.out.println("Tu respuesta es correcta");
mayor=0;
}else{
mayor++;
System.out.println("Tu respuesta es incorrecta tienes " +mayor+ "/5 Intentos");
}
}while(mayor<maxinten);        
System.out.println("Ya terminaste los 5 Veces de intentos tienes que inicial de nuevo ");
}
 
 public void pira (){
  int num1=5;
  for (int i=1;i<=num1;i++){
  for(int j=1;j<=i;j++){
  System.out.print("*");
  }
  System.out.println();
  }
  int num=5;
  for (int i=num;i>=1;i--){
  for(int j=1;j<=i;j++){
  System.out.print("*");
  }
  System.out.println();
 
 }
 
 }
  public void ju(){
Scanner leer = new Scanner (System.in);
Random ent = new Random ();
 int num;
 int adv=0;
 num = ent.nextInt(100)+1; 
 System.out.println("Ingresa el 1er  numero para empesar el juego ");
 adv=leer.nextInt();
 while (num != adv){

 if (adv<num)
 {  
 System.out.println("Ingresa un mumero mayor ");
 }else {
 System.out.println("Ingresa un mumero menor ");
 }
adv= leer.nextInt(); 
 }
 System.out.println("Advinaste ");
 }
}
