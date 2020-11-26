//aqui se mantiene el control de las existencia asignados a libreria  y el poder llevasrse 1
import java.util.Scanner;

public class Existencias{
    public void Prestamo(){
        Principal mePrincipal = new Principal();
        Menu memenu = new Menu();
        int tecleo;

        Scanner entrada=new Scanner(System.in);

        tecleo = entrada.nextInt(); 

        System.out.println("Para llevarse un libro tecle el numero de este");
        System.out.println("Diario de Greg (1), Quien se comio mi queso? (2), Pana (3) ");

            
        if(tecleo == 3){ 

        System.out.println("Libro  adquirido");
        System.out.println("Desea devolver el libro o extraer otro? Digite 1 para devolver o 2 para extraer otro.");
        }
        if(tecleo == 1){
            System.out.println("Gracias por devolver el libro");
            mePrincipal.Libreria();
        }
        else if(tecleo == 2){
            System.out.println("Sin existencias ,devuelva o regale un libro con el que cuenta actualmente digitando 0 porfavor");
                if(tecleo == 0){
                    mePrincipal.Libreria();
                }
        
                else if (tecleo < 0 & tecleo > 0){
                System.out.println("A bueno");
                }
        }
        do{
            System.out.println("Seleccione uno de los libros existentes");
        }while(tecleo < 3 & tecleo < 1);
    }           
}