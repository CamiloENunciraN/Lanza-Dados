/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Business;

import java.util.Random;

/**
 *
 * @author CamiloN
 */
public class Dados {
int myDado [];
    
    //crea un arreglo de enteros(int) del tamano al valor indicado (c)
    public String generarDados(int c) {

       this.myDado=new int [c];

       for(int i=0;i<this.myDado.length;i++){
           this.myDado[i]=this.dropDado();
       }
        return this.arrayDados();
    }
    //modifica el arreglo de dados (myDado) con valores nuevos
    public String generarDados() {

       for(int i=0;i<this.myDado.length;i++){
           this.myDado[i]=this.dropDado();
       }
        return this.arrayDados();
    }
    //crea una lista de los dados actuales
    public String arrayDados(){
       String c="";
       for(int i=0;i<this.myDado.length;i++){
           c+=this.myDado[i]+"-";
       }
        return c;
    }
    //genera un numero entre 1 y 6
    private int dropDado(){
        int c;
        Random r=new Random();
        c=r.nextInt(6)+1;
        return c;
    }
       
}
