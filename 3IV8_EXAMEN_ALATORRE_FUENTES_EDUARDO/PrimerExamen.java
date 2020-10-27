import java.util.Scanner;
import java.util.*;
import java.io.*;

class Pokedex{

    public static void main(String[] args) throws IOException{

        Scanner entrada = new Scanner(System.in);

        int opcion, edad, termo, numero, base, altura, ladoa, ladob, radio, chicle, chocolate, awa, boing;
        char letra, temperatura, convertidor;
        double area, perimetro, volumen, resultado, primero, segundo, cantidad, uno, dos, tres, cuatro ; 

    do{
        System.out.println("3IV8_ALATORRE_FUENTES_EDUARDO");
        System.out.println(" ");
        System.out.println("Lista de ejercicios, seleccione el n\u00FAmero correspondiente");
        System.out.println("1.- Datos Charmander");
        System.out.println("2.- Datos Bulbasaur");
        System.out.println("3.- Datos Squirtle");
        System.out.println("4.- Lucha");
        System.out.println("5.- Adios");

        opcion = entrada.nextInt();

        switch(opcion) {
            case 1: 
                do{
                    System.out.println("iD 01");
                    System.out.println("Charmander");
                    System.out.println("Fuerza:4500");
                    System.out.println("Defensa:3000");
                    System.out.println("Vida:40000");
                    System.out.println("Ataque principal:Flamas");
                    System.out.println("Secundario:Cabezaso");
                }

                System.out.println(" ");
                System.out.println("Presione p ");
                System.out.println("Si quiere volver al men\u00fa inicial, presione c de enter");y de enter si quiere ver las demas posibilidades de descuento.
                letra = entrada.next().charAt(0);
                }while(letra ==  'p');

                    break;

            case 2:
                do{
                    System.out.println("iD 02");
                    System.out.println("Bulbasaur");
                    System.out.println("Fuerza:5000");
                    System.out.println("Defensa:2200");
                    System.out.println("Vida:37000");
                    System.out.println("Ataque principal:Chorreo");
                    System.out.println("Secundario:Salpicon"); 
                
                System.out.println(" ");
                System.out.println("Escriba p y de enter si desea recargar");
                System.out.println("Si desea volver al men\u00fa, presione c y de enter.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'p');

                break;

            case 3:
                do{

                    System.out.println("iD 03");
                    System.out.println("Squirtle");
                    System.out.println("Fuerza:3500");
                    System.out.println("Defensa:3800");
                    System.out.println("Vida:44000");
                    System.out.println("Ataque principal:Hierra");
                    System.out.println("Secundario:Tropezon"); 

                    System.out.println(" ");
                    System.out.println("Ponga p si desea recargar");
                    System.out.println("Si desea volver al men\u00fa, ponga c y de enter");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'p');

                break;

            case 4:
                do{
                    termo = 0;

                System.out.println("Teclea tu pokemon");
                termo = entrada.nextInt();

                System.out.println(" ");
                System.out.println("C = Charmander F = Bulbasaur K = Squirtle ");
                System.out.println("Visto lo anterior, presione la tecla que represente su unidad inicial de temperatura y de enter:");
                Charmander = entrada.next().charAt(0);
                Bulbasaur = entrada.next().charAt(0);
                Squirtle = entrada.next().charAt(0);

                

                    ifSystem.out.println("Pon 3 numeros");
                    uno = entrada.nextDouble();
                    dos = entrada.nextDouble();
                    tres = entrada.nextDouble();
                    
    
                    if(uno ==){
                        System.out.println("Charmander ha muerto");
                    }
                        else if(uno < 0){
                            System.out.println("Charmander gano");
                        }
                        else{
                            System.out.println("Charmander perdio pero sigue vivo");
                        }
    
                    if(dos == 0){
                        System.out.println("Bulbasaur gano");
                    }
                        else if(dos < 0){
                            System.out.println("Bulbasaur perdio pero sigue vivo");
                        }                
                        else{
                            System.out.println("Bulbasaur murio");
                        }
    
                    if(tres == 0){
                        System.out.println("Squirtle murio");
                    }
                        else if(tres < 0){
                            System.out.println("Squirtle perdio pero sigue vivo");
                        }
                        else{
                        System.out.println("Squirtle gano");
                        }
    
                        
    
                        System.out.println(" ");
                        System.out.println("Ponga p e inicie otra pelea");
                        System.out.println("Si desea volver al men\u00fa, pulse c y de enter");
                        letra = entrada.next().charAt(0);
                        }while(letra ==  'p');
                    }
                    System.out.println(" ");
                    System.out.println("Ponga v y de enter si desea poner otros valores");
                    System.out.println("Si desea volver al men\u00fa, pulse j y de enter");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'v');

                break;

            
            case 5:
                do{

                System.out.println("POKEDEX DE 3 POKEMON")

            default:
                System.out.println("No hay nada m\u00E1s");   
        }
        System.out.println(" ");
        System.out.println("Vuelva a tecleear v para volver al men\u00fa");
        System.out.println("Ponga x para terminar la sesion");
        System.out.println(" ");
        letra = entrada.next().charAt(0);

    }while(letra == 'c');       
    }
}