//aqui es de donde se manda a llamar cada problema
import java.util.Scanner;


//Clase donde se mandan a llamar los metodos
public class Menu{
    //Metodo menu
    public static void main(String[] args){
        int caracter;

        Scanner entrada=new Scanner(System.in);

        Sueldos meSueldos = new Sueldos();
        Proovedor meProovedor = new Proovedor();
        Principal mePrincipal = new Principal();

        do{  
        System.out.println("Alatorre Fuentes Eduardo 3IV8");
        System.out.println("Seleccione el programa que desea ejecutar: ");
        System.out.println("Sueldo (1),provedores (2),libreria (3), salir (4)");

        caracter = entrada.nextInt();

        //Switch
        switch(caracter){
            case 1:
                
                //metodo 1
                do{
                meSueldos.Empleados();
                //Reinicio o salida del metodo
                System.out.println("Para volver al menu pulse v, para repetir z");
                caracter = entrada.next().charAt(0);
                }while(caracter == 'z');
            break;
                //metodo 2
            case 2:
                do{
                meProovedor.Cadena();
                System.out.println("Para volver al menu pulse v, para repetir z");
                caracter = entrada.next().charAt(0);
                }while(caracter == 'z');
            break;
                //metodo 3
            case 3:
                do{
                mePrincipal.Libreria();
                System.out.println("Para volver al menu pulse v, para repetir z");
                caracter = entrada.next().charAt(0);
                }while(caracter == 'z');
            break;
            }
        
           
            System.out.println("Para volver al menu pulse v, pulse x si quiere salir");
            caracter = entrada.next().charAt(0);
            }while(caracter == 'v');

        }
    }