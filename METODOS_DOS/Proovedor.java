//metodo de los proooovedores
import java.util.Scanner;

public class Proovedor{
    String cliente;
    int i, j, k;
    int[] costo = new int[10];
    int[] producto_existente = new int[10];
    String[] producto = new String[10];
    float suma_costo, cmaximo, cminimo, cpromedio;


    Scanner entrada=new Scanner(System.in);

    public void Cadena(){
        System.out.println("Ingrese el nombre de su cliente:");
        cliente=entrada.nextLine();

        System.out.println("Digite el costo y el nombre de sus productos uno a uno.");
        for(i = 0; i < producto.length; i++){
            System.out.print("producto: ");
            producto [i] = entrada.nextLine();
            System.out.print("costo ");
            costo[i] = entrada.nextInt();
            suma_costo += costo[i];
            
             
        }
        

        cminimo = cmaximo = costo[0];
        for (i = 0; i < costo.length; i++){
            
            if(costo[i] > cmaximo){
                cmaximo = costo[i];
            }
            else if(costo [i] < cminimo){
                cminimo = costo[i];
            }
        }

        System.out.println("Teclee las existencias de su producto"); 
        for(j = 0; j < producto_existente.length; j++){
            producto_existente[j] = entrada.nextInt();
        }
        CadenaResultante();
    }

    public void CadenaResultante(){
        System.out.println("El total de costos es de: " + suma_costo + " $.");
        System.out.println("Costo mayor: " + cmaximo + " $.");
        System.out.println("Costo menor: " + cminimo + " $.");

        cpromedio = suma_costo/costo.length;

        System.out.println("El promedio de los costos es de: " + cpromedio + " $ .");
        
        System.out.println("Su cliente es: " + cliente + ".");
        System.out.println("(" + producto_existente[0] + ") " + producto[0] + " cuesta " + (costo[0] * producto_existente[0]) + " $.");
        System.out.println("(" + producto_existente[1] + ") " + producto[1] + " cuesta " + (costo[1] * producto_existente[1]) + " $.");
        System.out.println("(" + producto_existente[2] + ") " + producto[2] + " cuesta " + (costo[2] * producto_existente[2]) + " $.");
        System.out.println("(" + producto_existente[3] + ") " + producto[3] + " cuesta " + (costo[3] * producto_existente[3]) + " $.");
        System.out.println("(" + producto_existente[4] + ") " + producto[4] + " cuesta " + (costo[4] * producto_existente[4]) + " $.");
        System.out.println("(" + producto_existente[5] + ") " + producto[5] + " cuesta " + (costo[5] * producto_existente[5]) + " $.");
        System.out.println("(" + producto_existente[6] + ") " + producto[6] + " cuesta " + (costo[6] * producto_existente[6]) + " $.");
        System.out.println("(" + producto_existente[7] + ") " + producto[7] + " cuesta " + (costo[7] * producto_existente[7]) + " $.");
        System.out.println("(" + producto_existente[8] + ") " + producto[8] + " cuesta " + (costo[8] * producto_existente[8]) + " $.");
        System.out.println("(" + producto_existente[9] + ") " + producto[9] + " cuesta " + (costo[9] * producto_existente[9]) + " $.");
    }
}