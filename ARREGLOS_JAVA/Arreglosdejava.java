import java.util.Scanner;

public class Arreglosdejava{
    int numeros[] = new int[10];
    float promedio = 0;

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Arreglosdejava trial = new Arreglosdejava();

        char repetir;
        do{
            
            trial.menu();
            //generar el menu

            System.out.println("Pulse v para repetir, pulse x para salir");
            repetir = input.next().charAt(0);
        }while(repetir=='v');
    }

    //.
    //primer array
    public void promedioenter(){
        Scanner input = new Scanner(System.in);

        float promediopositivos = 0, promedionegativos = 0;
        int positivos = 0, negativos = 0;

        for(int i = 0;i < numeros.length;i++){
            System.out.println("Sigue introduciendo valores hasta llegar a 10");
            numeros[i] = input.nextInt();

            if(numeros[i] < 0){
                promedionegativos += numeros[i];
                negativos++;
            }else{
                promediopositivos += numeros[i];
                positivos++;
            }
        }

        promediopositivos = promediopositivos/positivos;
        promedionegativos = promedionegativos/negativos;

        System.out.println(String.format("Promedio positivo:" + promediopositivos ));
        System.out.println(String.format("Promedio negativo:" + promedionegativos ));
    }
    //segun array
    public void promediopar(){
        Scanner input = new Scanner(System.in);
        //i inicializar
        for(int i = 0;i < numeros.length;i++){
            System.out.println("Introduce tus valores(10)");
            numeros[i] = input.nextInt();
            //toma solo los pares 
            if(i % 2 == 0){
                promedio += numeros[i];
            }
        }
                 //solo 5 cantidades deberian ser pares
        promedio /= 5;

        System.out.println(String.format("El promedio de los valores pares es:" + promedio));

    }
    //tercer array
    public void calificaciones(){
        Scanner input = new Scanner(System.in);

        int aprobados = 0, reprobados = 0, superiores = 0, baja = 10, alta = 0;
        promedio = 0;

        for(int i = 0; i < numeros.length;i++){
            System.out.println("Introduce los valores(10):");
            numeros[i] = input.nextInt();
            promedio += numeros[i];
            
            if(numeros[i] >= 6){ //condicion para aprobar
                aprobados++; //y numero de aprobados
            }
            if(numeros[i] > alta){
                alta = numeros[i];
            }                     //calificacion mas alta y mas baja
            if(numeros[i] < baja){
                baja = numeros[i];
            }
        }
        //numero de reprobados
        reprobados = 10 - aprobados; 
        // calculo de promedio
        promedio /= 10;

        for(int i = 0; i < 10;i++){;   // cuantas calificaciones son superiores al promedio
            if(numeros[i] > promedio){
                superiores++;
            }
        }

        System.out.println(String.format("El promedio del grupo es: " + promedio));
        System.out.println(String.format("La calificacion mas alta es:" + alta));
        System.out.println(String.format("La calificacion mas baja es: " + baja));
        System.out.println(String.format("Las cantidad de calificaciones superiores al promedio es de: " + superiores));
        System.out.println(String.format("Los alumnos aprobados son: " + aprobados));
        System.out.println(String.format("Los alumnos reprobados son: " + reprobados));

    }
    //cuarto array
    public void sumamatriz(){
        Scanner input = new Scanner(System.in);

        int matriz1[][] = new int [3][3];
        int matriz2[][] = new int[3][3];  //se que los nombres deberian estar asociados a matriz 1 y matriz 2
        int suma[][] = new int[3][3]; //9

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){ //valores positivos
                System.out.println("Introduce los valores de la primer matriz(9):");
                matriz1[i][j] = input.nextInt(); //primera matriz
            }
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("Introduce los valores de la segunda matriz:(9)");
                matriz2[i][j] = input.nextInt(); // segunda matriz
            }
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                suma[i][j] = matriz1[i][j] + matriz2[i][j]; // suma
            }
        }
        System.out.println("La suma de matrices es de : ");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(" "+suma[i][j]+" ");
            }            
            System.out.println("");
        }
    }
    public void menu(){
        Scanner input = new Scanner(System.in);

        int opcion;

        System.out.println("Alatorre Fuentes Eduardo 3IV8");
        System.out.println("Escoja el arreglo");
        System.out.println("1.-Promedio de enteros");
        System.out.println("2.-Promedio de numeros pares");
        System.out.println("3.-Calificaciones");
        System.out.println("4.-Suma de matrices");

        opcion = input.nextInt();

        switch(opcion){
            case 1:
                promedioenter();
                break;
            case 2:
                promediopar();
                break;
            case 3:
                calificaciones();
                break;
            case 4:
                sumamatriz();
                break;
            default:
                System.out.println("Ponga un valor que no rompa el codigo porfavor");

        }
    }
}