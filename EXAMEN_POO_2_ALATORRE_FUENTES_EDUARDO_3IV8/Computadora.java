
import java.io.*;

//encapsulamiento
public class Computadora{
    public void vscomputadora()throws IOException{


/*
BufferedReader es una clase de Java para leer el texto de una secuencia de entrada 
(como un archivo) almacenando en el búfer caracteres que leen 
a la perfección caracteres, matrices o líneas.
*/
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        String estetica[][];
        estetica = new String[3][3];
        int g = 0;
        int fila;
        int columna;
        for (int q = 0; q <= 2; q = q + 1){
            for (int w = 0; w <= 2; w = w + 1){
                estetica[q][w] = "WOW";
                int dato;
                int C0l;
                int colcompu;
                int filacompu;
            }
        }

     try{
            System.out.println("  ____________________");
            System.out.println(" | " + estetica[0][0] + " | " + estetica[0][1] + " | " + estetica[0][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" |  " + estetica[1][0] + "| " + estetica[1][1] + " | " + estetica[1][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" | " + estetica[2][0] + " | " + estetica[2][1] + " | " + estetica[2][2] + " | ");
            System.out.println("  ____________________");
        //tabla predeterminada para cuando comienza el juego
        while (g < 10){
            //menor a 10 porque si le pongo 9 se amontona con el gato 
            System.out.println("Turno del jugador");
            System.out.println("Numero de fila de su casilla");
            int dato = Integer.parseInt(entrada.readLine());
            System.out.println("Numero de columna de su casilla");
            int C0l = Integer.parseInt(entrada.readLine());
            //leer las columnas y filas 
            

            while (estetica[dato][C0l]== "O" || estetica[dato][C0l]== "X" ){
                System.out.println("Casilla ocupada");
                System.out.println("Numero de fila de su casilla");
                dato = Integer.parseInt(entrada.readLine());
                System.out.println("Numero de fila de su casilla");
                C0l = Integer.parseInt(entrada.readLine());
            }
            //condicion para no rellenar un espacio dos veces
            estetica[dato][C0l] = "O";

            System.out.println("  ____________________");
            System.out.println(" | " + estetica[0][0] + " | " + estetica[0][1] + " | " + estetica[0][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" |  " + estetica[1][0] + "| " + estetica[1][1] + " | " + estetica[1][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" | " + estetica[2][0] + " | " + estetica[2][1] + " | " + estetica[2][2] + " | ");
            System.out.println("  ____________________");
            //tabla con datos de O
            //variable que permite saber si ocurrio un gato 
            g = g + 1;
            
            if (estetica[2][0]== "O" && estetica[2][1]== "O" && estetica [2][2]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            if (estetica[0][0]== "O" && estetica[0][1]== "O" && estetica [0][2]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            if (estetica[0][0]== "O" && estetica[1][0]== "O" && estetica [2][0]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            if (estetica[0][0]== "O" && estetica[1][1]== "O" && estetica [2][2]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            if (estetica[0][2]== "O" && estetica[1][1]== "O" && estetica [2][0]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            if (estetica[0][1]== "O" && estetica[1][1]== "O" && estetica [2][1]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            if (estetica[1][0]== "O" && estetica[1][1]== "O" && estetica [1][2]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            if (estetica[0][2]== "O" && estetica[1][2]== "O" && estetica [2][2]== "O"){
                System.out.println("Le ganaste a la maquina");
            break;
            }
            //los 8 casos posibles para ganarle a la computadora

            if (g == 9){
                System.out.println("Gato"); 
                //gato
            break;
            }

            System.out.println("Turno de la Computadora");
            int colcompu;
            colcompu = (int)(Math.random()*2)+0;
            int filacompu;
            filacompu = (int)(Math.random()*2)+0;
            System.out.println("La columna es: " + colcompu + ". La fila es: " + filacompu);
            //se multiplica por 2 para que de valores de 0 a 2
        
            
            while (estetica[colcompu][filacompu]== "O" || estetica[colcompu][filacompu]== "X" ){
            colcompu = (int)(Math.random()*2)+0;
            filacompu = (int)(Math.random()*2)+0;
            System.out.println("La columna es: " + colcompu + ". La fila es: " + filacompu);
            }

            estetica[colcompu][filacompu] = "X";

            System.out.println("  ____________________");
            System.out.println(" | " + estetica[0][0] + " | "+ estetica[0][1] + " | " + estetica[0][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" | " + estetica[1][0] + "| " + estetica[1][1] + " | "  + estetica[1][2] + " | ");
            System.out.println("  ____________________");
            System.out.println(" | " + estetica[2][0] + " | " + estetica[2][1] + " | " + estetica[2][2] + " | ");
            System.out.println("  ____________________");
        //tabla con datos de la computadora
        g = g + 1;    
        //lo mismo sumarle 1 para que se cumpla la condicion
            if (estetica[1][0]== "X" && estetica[1][1]== "X" && estetica [1][2]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (estetica[0][0]== "X" && estetica[0][1]== "X" && estetica [0][2]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (estetica[0][1]== "X" && estetica[1][1]== "X" && estetica [2][1]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (estetica[0][0]== "X" && estetica[1][0]== "X" && estetica [2][0]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (estetica[0][2]== "X" && estetica[1][1]== "X" && estetica [2][0]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (estetica[0][2]== "X" && estetica[1][2]== "X" && estetica [2][2]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (estetica[2][0]== "X" && estetica[2][1]== "X" && estetica [2][2]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (estetica[0][0]== "X" && estetica[1][1]== "X" && estetica [2][2]== "X"){
                System.out.println("Gana la Computadora");
            break;
            }
            if (g == 9){
                System.out.println("Gato"); 
            break;
            }
            //todos los casos posibles para que gane la computadora
        }
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
            System.out.println("Sigue las instrucciones porfa");
            //por si ocurre una excepcion en io
        }
    }
}
