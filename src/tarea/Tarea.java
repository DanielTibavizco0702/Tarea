/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import java.util.Scanner;


public class Tarea {
    public static void main(String[] args) 
    {   
     Scanner listado=new Scanner (System.in);  
        System.out.println("Bienvenido para iniciar a crear la lista digite el numero inicial");
      int a=listado.nextInt(); 
      if (0<a){
      System.out.println("Digite el segundo numero de la lista");
      
      int b=listado.nextInt(); 
      if (0<b){
      System.out.println("Digite el tercer numero de la lista");
      
      int c=listado.nextInt(); 
      if (0<c){
      System.out.println("Digite el cuarto numero de la lista");
      
      int d=listado.nextInt(); 
      if (0<d){
      System.out.println("Digite el ultimo numero de la lista");
      
      int e=listado.nextInt(); 
      if (0<e){
      
      int[]lista;
      lista=new int[5];
      lista[0]=a;
      lista[1]=b;
      lista[2]=c;
      lista[3]=d;
      lista[4]=e;
       System.out.println("La lista final es");
       
      for (int i=0;i<lista.length;i++){
       System.out.println("El numero " +i+ " es "+lista[i]);   
     
      }
      }
      }
      }
      }
      }
    }
}
    
 
    
