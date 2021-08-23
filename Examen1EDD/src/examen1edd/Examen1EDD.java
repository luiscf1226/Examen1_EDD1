/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1edd;

/**
 *
 * @author Luis Carlos Flores
 */
import java.util.Scanner;
public class Examen1EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        ListaArray l1=new ListaArray();
        int menu=1;
        int n,pos;
        l1.Insertar(1, 0);
        l1.Insertar(2, 1);
        l1.Insertar(2, 2);
        l1.Insertar(3, 3);
        l1.Insertar(4, 4);
        l1.Insertar(5, 5);
        
        System.out.println("ARREGLO ANTES DE PURGAR");
        l1.Imprimir();
        System.out.println("");
        int c=l1.getNelementos();
        System.out.println("ARREGLO DESPUES");
        l1.Purga();
        l1.Imprimir();
        l1.Insertar(6, 5);
        System.out.println("");
        System.out.println("INSERTAMOS DE NUEVO PARA VERIFICAR");
        System.out.println("");
        l1.Imprimir();
        //l1.Imprimir();
        //System.out.println("elementos: "+c);
        
        /*
        int capacidad=10;
        int[] array=new int[capacidad];
        int[] array2=new int[capacidad];
        int n,pos;
        int cant=0;
        int tip=0;
        while(tip==0){
            
            System.out.println("ingrese numero a insertar: ");
            n=sc.nextInt();
            System.out.println("ingrese pos a insertar: ");
            pos=sc.nextInt();
            if(pos>=0){
                if(cant<capacidad){

                    for (int i = 0; i < capacidad; i++) {
                        if(array[pos]==0){
                            array[pos]=n;
                            cant++;
                            i=capacidad;
                        }else{
                            int num=array[pos];
                            array[pos]=n;
                            array[pos+1]=num;
                            cant++;
                            i=capacidad;
                        }
                        
                    }
                }else{
                    array=new int[capacidad+1];
                }
            }
            System.out.println("escoje 0 para seguir");
            tip=sc.nextInt();
        }
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("numero: "+array[i] );
        }
        while(menu==1){
            System.out.println("Ingrese Numero a Insertar: ");
            n=sc.nextInt();
            System.out.println("Ingrese Posicion a Insertar: ");
            pos=sc.nextInt();
            System.out.println("Ingrese 1. Insertar Mas , 2. Salir y Purgar");
            menu=sc.nextInt();
            l1.Insertar(pos, n);
            
        }
        */
    
    }
    
}
