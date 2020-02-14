/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Scanner;
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1 2 3 4 5 6 7 8 9 10
        //0 1 2 3 4 5 6 7 8 9 
        
        Scanner sc= new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL ARREGLO");
        int tan = sc.nextInt();
        
        //declaracion del arreglo.
        int [] arreglo= new int[tan];
        
        //insertar elementos a arreglo.
        for(int i=0; i<arreglo.length; i++){
             System.out.println("ingrese un numero la posicion "+i+" del arreglo: ");
             arreglo[i]= sc.nextInt();
        }
        //mostrar arreglo.
        System.out.println("contenido del arreglo");
        for(int y=0; y<arreglo.length; y++ ){
            System.out.println("arreglor ["+y+"] = "+arreglo[y]);
        }
       
        int num_buscado = 20;
        int inferior = 0;
        int centro;
        int superior = tan -1;
        
        while(inferior <= superior){
            centro =(superior + inferior)/2;
            
            if(arreglo[centro]==num_buscado){
                System.out.println("el numero buscado esta en la pocision "+centro);
                break;
                
            }else if(num_buscado <arreglo[centro]){
                superior=centro -1;
            }else{
                inferior=centro +1;
                
            }
        }
    }
    
}

