/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Business;

import java.util.Random;

/**
 *
 * @author red-iso
 */
public class Dados {
int myDado [];
    
    
    public String generarDados(int c) {

       this.myDado=new int [c];

       for(int i=0;i<this.myDado.length;i++){
           this.myDado[i]=this.dropDado();
       }
        return this.arrayDados();
    }
    
    public String generarDados() {

       for(int i=0;i<this.myDado.length;i++){
           this.myDado[i]=this.dropDado();
       }
        return this.arrayDados();
    }
    
    public String arrayDados(){
       String c="";
       for(int i=0;i<this.myDado.length;i++){
           c+=this.myDado[i]+"-";
       }
        return c;
    }
    
    private int dropDado(){
        int c;
        Random r=new Random();
        c=r.nextInt(6)+1;
        return c;
    }
       
}
