import java.io.*;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args){

        int caracter;

        Scanner entrada=new Scanner(System.in);

        Computadora meComputadora = new Computadora();
        Minino meMinino = new Minino();
        Principal mePrincipal = new Principal();
        
        
        do{
        System.out.println("Juego de Gato");
        System.out.println("Alatorre Fuentes Eduardo 3IV8");
        System.out.println("Juego de Gato ");
        System.out.println("Elige lo que quiere hacer porfavor ");
        System.out.println("1. Coordenadas exactas ");
        System.out.println("2. Computadora ");
        System.out.println("3. Dos jugadores");
        //lee el numero escrito
         caracter = entrada.nextInt();
         //la carpeta contiene 8 clases para cada problema del gato

        switch(caracter){
            case 1:           
            do{
                try{
                    mePrincipal.Coordenadas();
                    //manda a llamar el encapsulamineto
                }catch(Exception e){
                    System.out.println("No se que excepcion podria ocurrir");
        
                    System.out.println("Error " + e.getMessage());
                }
            System.out.println("Para salir pulse x, para repetir el juego pulse z");
            caracter = entrada.next().charAt(0);
            }while(caracter == 'z');
        break;

         case 2:
            do{
            try{
                 //manda a llamar el encapsulamiento
                 meComputadora.vscomputadora();
             }catch(Exception e){
                    System.out.println("Inserta solo valores enteros del 0 al 2");
                    //excepcion
            
                    System.out.println("Error " + e.getMessage());
                    }
                System.out.println("Para repetir el juego pulse z, para salir pulse x");
                caracter = entrada.next().charAt(0);
                }while(caracter == 'z');
            break;
                

        case 3:
            do{
            try{
                //manda a llamra el encapsulamiento
                meMinino.vsjugador();
             }catch(Exception e){
                System.out.println("Inserta solo valores enteros del 0 al 2");
        
                System.out.println("Error " + e.getMessage());
             }//excepciones
                System.out.println("Para repetir el juego pulse z, para salir pulse x");
                caracter = entrada.next().charAt(0);
                }while(caracter == 'z');
            break;

            
        }
            
             System.out.println("Goodbye");
        }while(caracter == 'v');
    }
}