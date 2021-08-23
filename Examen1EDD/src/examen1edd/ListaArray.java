/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1edd;

import java.util.Arrays;

/**
 *
 * @author Luis Carlos Flores
 */
public class ListaArray extends ListaTDA {
    private int size=100;
    private int Nelementos;
    private int[] array;

    public ListaArray() {
        
        this.array=new int[this.size];
        this.Nelementos=0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNelementos() {
        return Nelementos;
    }

    public void setNelementos(int Nelementos) {
        this.Nelementos = Nelementos;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    //
    public void Imprimir(){
        System.out.println("Arreglo: ");
        
        for (int i = 0; i < this.Nelementos; i++) {
            //if(array[i]!=0)
            System.out.print(" "+array[i]+" ," );
        }
        
        
    }
    public void Insertar(int num,int pos){
        //System.out.println("hola");
        this.Nelementos++;
        int cant=this.Nelementos;
        int capacidad=this.size;
        if(pos>=0){
            if(cant<capacidad){
                //System.out.println("hola");
                for (int i = 0; i < capacidad; i++) {
                        if(this.array[pos]==0){
                            this.array[pos]=num;
                            cant++;
                            i=capacidad;
                        }else{
                            int num2=this.array[pos];
                            this.array[pos]=num;
                            this.array[pos+1]=num2;
                            cant++;
                            i=capacidad;
                        }
                        
                    }
            }else{
                  this.array=new int[capacidad+1];
             }
         }
         
    }
    public void Purga(){
        int [] temp=new int[this.Nelementos];
        int c=0;
        for (int i = 0; i < 10; i++) {
            if(this.array[i]!=this.array[i+1]){
                temp[c++]=this.array[i];
            }
        }
        temp[c++]=this.array[this.Nelementos];
        this.array=temp;
        this.Nelementos-=1;
        
        
    }
}
