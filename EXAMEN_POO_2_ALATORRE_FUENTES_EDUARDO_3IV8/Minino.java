import java.io.*;
//import java.util.Scanner;

public class Minino{
    //encapsulamiento
    public void vsjugador()throws IOException{
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        String tablero[][];
        tablero = new String[3][3];
        int g = 0;
        int fila;
        int columna;
        for (int c = 0; c <= 2; c = c + 1){
            for (int f = 0; f <= 2; f = f + 1){
                tablero[c][f] = "0W0";
                int filao;
                int colo;
                int filax;
                int colx;
            }
        }

        try{
            System.out.println("  ____________________");
            System.out.println(" | " + tablero[0][0] + " |" + tablero[0][1] + " | " + tablero[0][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" |  " + tablero[1][0] + "| " + tablero[1][1] + " | " + tablero[1][2] + "| ");
            System.out.println("  ____________________");
            System.out.println(" | " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " | ");
            System.out.println("  ____________________");
            //tablero predeterminado

        while (g < 10){
            System.out.println("Turno jugador O");
            System.out.println("Numero de fila de su casilla");
            int filao= Integer.parseInt(entrada.readLine());
            System.out.println("Numero de columna de la casilla");
            int colo = Integer.parseInt(entrada.readLine());
            
            while (tablero[filao][colo]== "O" || tablero[filao][colo]== "X" ){
                System.out.println("Ingrese otras columnas y filas");
                System.out.println("Numero de fila de su casilla");
                filao= Integer.parseInt(entrada.readLine());
                System.out.println("Numero de columna de la columna");
                colo = Integer.parseInt(entrada.readLine());
                //leer y asignar columnas y filas del jugar 0
            }

            tablero[filao][colo] = "O";
            
            System.out.println("  ____________________");
            System.out.println(" | " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" |  " + tablero[1][0] + "| " + tablero[1][1] + "| " + tablero[1][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" | " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " | ");
            System.out.println("  ____________________");
            //tablero que se encarga de almacenar O y nos dice que casillas ya estan ocupadas

            g = g + 1;
            //valor almacenado + 1 para que se cumpla la condicion gato
        
            if (tablero[1][0]== "O" && tablero[1][1]== "O" && tablero [1][2]== "O"){
                System.out.println("Jugador O gana");
            break;
            }
            if (tablero[0][0]== "O" && tablero[0][1]== "O" && tablero [0][2]== "O"){
                System.out.println("Jugador O gana");
            break;
            }
            if (tablero[2][0]== "O" && tablero[2][1]== "O" && tablero [2][2]== "O"){
                System.out.println("Jugador O gana");
            break;
            }
            if (tablero[0][2]== "O" && tablero[1][1]== "O" && tablero [2][0]== "O"){
                System.out.println("Jugador O gana");
            break;
            }
            if (tablero[0][0]== "O" && tablero[1][0]== "O" && tablero [2][0]== "O"){
                System.out.println("Jugador O gana");
            break;
            }
            if (tablero[0][2]== "O" && tablero[1][2]== "O" && tablero [2][2]== "O"){
                System.out.println("Jugador O gana");
            break;
            }
            if (tablero[0][0]== "O" && tablero[1][1]== "O" && tablero [2][2]== "O"){
                System.out.println("Jugador O gana");
            break;
            }
            if (tablero[0][1]== "O" && tablero[1][1]== "O" && tablero [2][1]== "O"){
                System.out.println("Jugador O gana");
            break;
            //condiciones para que gane el jugador O (diagonal, fila completa o columna completa)
            }
            if (g == 9){
                System.out.println("Gato"); 
                //gato
            break;
            }

       
            System.out.println("Turno jugador X");
            System.out.println("Numero de fila de su casilla");
            int filax = Integer.parseInt(entrada.readLine());
            System.out.println("Numero de columna de su casilla");
            int colx = Integer.parseInt(entrada.readLine());
        
            while (tablero[filax][colx]== "O" || tablero[filax][colx]== "X" ){
                System.out.println("Lugar ocupado escoja otro");
                System.out.println("Numero de fila de su casilla");
                filax = Integer.parseInt(entrada.readLine());
                System.out.println("Numero de columna de la casilla");
                colx = Integer.parseInt(entrada.readLine());
            }
            //leer los vaolres de la columna y fila y asignarlos 
            tablero[filax][colx] = "X";

            System.out.println("  ____________________");
            System.out.println(" | " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" |  " + tablero[1][0] + "| " + tablero[1][1] + " | " + tablero[1][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" | " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " | ");
            System.out.println("  ___________________");
            //impresion tablero X

            g = g + 1;
            //valor almacenado + 1 para que se cumpla la condicion gato
            if (tablero[0][0]== "X" && tablero[0][1]== "X" && tablero [0][2]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            if (tablero[0][2]== "X" && tablero[1][1]== "X" && tablero [2][0]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            if (tablero[0][0]== "X" && tablero[1][1]== "X" && tablero [2][2]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            if (tablero[2][0]== "X" && tablero[2][1]== "X" && tablero [2][2]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            if (tablero[0][2]== "X" && tablero[1][2]== "X" && tablero [2][2]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            if (tablero[0][0]== "X" && tablero[1][0]== "X" && tablero [2][0]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            if (tablero[1][0]== "X" && tablero[1][1]== "X" && tablero [1][2]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            if (tablero[0][1]== "X" && tablero[1][1]== "X" && tablero [2][1]== "X"){
                System.out.println("Jugador X gana");
            break;
            }
            //condiciones para que el jugador x gane,(diagonal,fila completa o coumna completa)
             if (g == 9) {
                System.out.println("Gato"); 
            break;
            //gato
            }
        }
        }catch(IOException e){
            System.out.println("Error" + e.getMessage() + "sigue las instrucciones porfavor");
            //por si ocurre un error 
        }
    }
}