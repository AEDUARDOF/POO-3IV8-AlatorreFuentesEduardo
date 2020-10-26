import java.util.Scanner;
import java.util.*;
import java.io.*;

class EjerciciosSesion4{

    public static void main(String[] args) throws IOException{

        Scanner entrada = new Scanner(System.in);

        int opcion, edad, termo, numero, base, altura, ladoa, ladob, radio, chicle, chocolate, awa, boing;
        char letra, temperatura, convertidor;
        double area, perimetro, volumen, resultado, primero, segundo, cantidad, uno, dos, tres, cuatro ; 

    do{
        System.out.println("3IV8_ALATORRE_FUENTES_EDUARDO");
        System.out.println(" ");
        System.out.println("Lista de ejercicios, seleccione el n\u00FAmero correspondiente");
        System.out.println("1.- Aplicar descuento segun la edad y sus padres");
        System.out.println("2.- Conversi\u00f3n de decimales a binarios");
        System.out.println("3.- Conversi\u00f3n de temperaturas");
        System.out.println("4.- Identificador de n\u00FAmeros positivos y negativos");
        System.out.println("5.- Precio.");
        System.out.println("6.- Sacar \u00c1rea, per\u00edmetro o volumen de figuras geometricas");
        System.out.println("7.- Tabla de valores sacada de internet porque no le entendi");
        System.out.println("8.- Calcular factorial de un n\u00FAmero");
        System.out.println("9.- Calculadora de operaciones basicas");
        System.out.println("10.- Adios");

        opcion = entrada.nextInt();

        switch(opcion) {
            case 1: 
                do{
                    System.out.println("Digite su edad.");
                
                    edad = entrada.nextInt();
                    //el valor de la edad se almacena en el scanner de datos, dando asi una variable que puede cambiar
                    //se dependiendo de el numero que ponga el usuario se hara uno de los 3 if que arrojara el texto
                    if(edad < 21){
                        System.out.println("Tus padres son socios de este establecimiento? Escriba s para si o n para no.");
                            letra = entrada.next().charAt(0);
                            if(letra == 's'){
                                System.out.println("Su descuento es de 45 % Vuelva pronto");
                            }
                            else if(letra == 'n'){
                                System.out.println("Su descuento es de 25 % Vuelva pronto");
                            }
                    }
                    if(edad > 65){
                        System.out.println("Su descuento es de 40 % Vuelva pronto");
                }
                if(edad >= 21 & edad <= 65){
                    System.out.println("Vuelva pronto");//por favor no vuelva, capaz encuentra un error en el codigo o lo rompe
                }

                System.out.println(" ");
                System.out.println("Presione v y de enter si quiere ver las demas posibilidades de descuento.");
                System.out.println("Si quiere volver al men\u00fa inicial, presione j de enter");
                letra = entrada.next().charAt(0);
                }while(letra ==  'v');

                    break;

            case 2:
                do{ 
                System.out.println("Ingrese un n\u00famero entero positivo para covertirlo a binario.");
                numero = entrada.nextInt ();
                String binario = "";
                if (numero > 0){

                while (numero > 0){
                    if (numero % 2 == 0){
                        binario = "0" + binario;
                    }
                    else{
                        binario = "1" + binario;
                    }

                    numero = (int) numero/2;
                }
                }
                else if(numero == 0){
                    binario = "0";
                }
                else{
                    binario = "Por favor, ingrese solo n\u00fameros positivos con valor no imaginario";
                }

                System.out.println("Salio: " + binario + ".");

                System.out.println(" ");
                System.out.println("Escriba v y de enter si desea saber el binario de otro n\u00FAmero positivo.");
                System.out.println("Si desea volver al men\u00fa, presione j y de enter.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'v');

                break;

            case 3:
                do{

                termo = 0;

                System.out.println("Teclea tu temperatura a convertir");
                termo = entrada.nextInt();

                System.out.println(" ");
                System.out.println("C = Celsius. F = Farenheit. K = Kelvin. R = Rankine.");
                System.out.println("Visto lo anterior, presione la tecla que represente su unidad inicial de temperatura y de enter:");
                temperatura = entrada.next().charAt(0);

                System.out.println("Presione la letra que represente la unidad en que se convertidor\u00e1:");
                convertidor = entrada.next().charAt(0);

                if(temperatura == 'C' & convertidor == 'C')
                    {
                        System.out.println("El valor es el mismo.Escriba una conversi\u00f3n v\u00e1lida.");
                    }
                    else if(temperatura == 'C' & convertidor == 'F')
                    {
                        resultado = termo*33.8;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertidor == 'K')
                    {
                        resultado = termo*274.15;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertidor == 'R')
                    {
                        resultado = termo*493.47;
                        System.out.println("La temperatura es: " + resultado);
                    }

                    if(temperatura == 'F' & convertidor == 'F')
                    {
                        System.out.println("El valor es el mismo.Escriba una conversi\u00f3n v\u00e1lida.");
                    }
                    else if(temperatura == 'F' & convertidor == 'C')
                    {
                        resultado = termo*-17.22;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertidor == 'K')
                    {
                        resultado = termo*255.92;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertidor == 'R')
                    {
                        resultado = termo*460.67;
                        System.out.println("La temperatura es: " + resultado);
                    }

                    if(temperatura == 'K' & convertidor == 'K')
                    {
                        System.out.println("El valor es el mismo.Escriba una conversi\u00f3n v\u00e1lida.");
                    }
                    else if(temperatura == 'K' & convertidor == 'F')
                    {
                        resultado = termo*-457.87;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertidor == 'C')
                    {
                        resultado = termo*-272.15;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertidor == 'R')
                    {
                        resultado = termo*1.8;
                        System.out.println("La temperatura es: " + resultado);
                    }

                    if(temperatura == 'R' & convertidor == 'R')
                    {
                        System.out.println("El valor es el mismo.Escriba una conversi\u00f3n v\u00e1lida");
                    }
                    else if(temperatura == 'R' & convertidor == 'F')
                    {
                        resultado = termo*-458.67;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertidor == 'K')
                    {
                        resultado = termo*0.55;
                        System.out.println("La temperatura es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertidor == 'C')
                    {
                        resultado = termo*-272.594;
                        System.out.println("La temperatura es: " + resultado);
                    }

                    System.out.println(" ");
                    System.out.println("Ponga v si desea repetir la conversion");
                    System.out.println("Si desea volver al men\u00fa, ponga j y de enter");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'v');

                break;

            case 4:
                do{
                System.out.println("Teclea 4  n\u00fameros por sepatado y se te dira cu\u00e1ntos son positivos o negativos.");
                uno = entrada.nextDouble();
                dos = entrada.nextDouble();
                tres = entrada.nextDouble();
                cuatro = entrada.nextDouble();

                if(uno == 0){
                    System.out.println("El primer n\u00famero es neutro.");
                }
                    else if(uno < 0){
                        System.out.println("El primer n\u00famero es negativo.");
                    }
                    else{
                        System.out.println("El primer n\u00famero es positivo.");
                    }

                if(dos == 0){
                    System.out.println("El primer n\u00famero es neutro.");
                }
                    else if(dos < 0){
                        System.out.println("El primer n\u00famero es negativo.");
                    }                
                    else{
                        System.out.println("El primer n\u00famero es positivo.");
                    }

                if(tres == 0){
                    System.out.println("El tercer n\u00famero es neutro.");
                }
                    else if(tres < 0){
                        System.out.println("El tercer n\u00famero es negativo.");
                    }
                    else{
                    System.out.println("El tercer n\u00famero es positivo.");
                    }

                    if(cuatro == 0){
                        System.out.println("El cuarto n\u00famero es neutro.");
                    }
                        else if(cuatro < 0){
                            System.out.println("El cuarto n\u00famero es negativo.");
                        }
                        else{
                        System.out.println("El cuarto n\u00famero es positivo.");
                        }

                    System.out.println(" ");
                    System.out.println("Ponga v y de enter si desea poner otros valores");
                    System.out.println("Si desea volver al men\u00fa, pulse j y de enter");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'v');

                break;

            case 5:
                do{
                System.out.println("Lista de productos:");
                System.out.println("Chicle - 1 $. chocolate - 5 $. Agua - 8 $. boing - 10 $.");
                System.out.println(" ");

                chicle = 1;
                chocolate = 5;
                awa = 8;
                boing = 10;
                cantidad = 0;

                do{System.out.println("Teclee cu\u00e1ntos chicles quiere comprar.");
                chicle = entrada.nextInt();
                }while(chicle < 0);

                do{System.out.println("Teclee cu\u00e1ntos chocolates quiere comprar");
                chocolate = entrada.nextInt();
                }while(chocolate < 0);

                do{System.out.println("Teclee cu\u00e1ntas botellas de agua ha adquirido.");
                awa = entrada.nextInt();
                }while(awa < 0);

                do{System.out.println("Teclee cu\u00e1ntas botellas de boing ha adquirido.");
                boing = entrada.nextInt();
                }while(boing < 0);

                cantidad = (chicle + chocolate + awa + boing);

                System.out.println("El costo total es de" + cantidad + "pesos. Hasta luego");

                System.out.println(" ");
                System.out.println("Ponga v si desea comprar m\u00E1s");
                System.out.println("Si quierevolver al men\u00fa, presione j y de enter");
                letra = entrada.next().charAt(0);
                }while(letra ==  'v');

                break;
            case 6:
 
                do{System.out.println("Seleccione una funci\u00f3n.");
                System.out.println("1, \u00e1rea y per\u00edmetro de un rect\u00e1ngulo; 2, per\u00edmetro de un tri\u00e1ngulo; 3, volumen de una esfera; 4, volumen de un cilindro.");

                opcion = entrada.nextInt();

                if(opcion == 1){
                    System.out.println("Introduzca la base del rect\u00e1ngulo");
                    base = entrada.nextInt();

                    System.out.println("Introduzca la altura del rect\u00e1ngulo");
                    altura = entrada.nextInt();

                    perimetro = base*altura;
                    area = 2*(base+altura);

                    System.out.println("El per\u00edmetro es de " + perimetro );
                    System.out.print("cm");
                    System.out.println("El \u00e1rea es de" + area);
                    System.out.print("cm cuadrados");
                }

                if(opcion == 2){
                    System.out.println("Introduzca la base del tri\u00e1ngulo.");
                    base = entrada.nextInt();

                    System.out.println("Introduzca por separado los dos lados restantes del tri\u00e1ngulo.");
                    ladoa = entrada.nextInt();
                    ladob = entrada.nextInt();

                    System.out.println("Introduzca la altura del tri\u00e1ngulo");
                    altura = entrada.nextInt();

                    area = altura*(base/2);
                    perimetro = base+ladoa+ladob;

                    System.out.println("El per\u00edmetro es de " + perimetro );
                    System.out.print("cm");
                    System.out.println("El \u00e1rea es de" + area );
                    System.out.print("cm cuadrados");
                }

                if(opcion == 3){
                    System.out.println("Introduzca el radio de la esfera");
                    radio = entrada.nextInt();

                    System.out.println("Introduzca la altura de la esfera");
                    altura = entrada.nextInt();

                    volumen = 4*3.14*((radio*radio*radio)/3);

                    System.out.println("El volumen es de " + volumen );
                    System.out.print("cm cubicos");
                }

                if(opcion == 4){
                    System.out.println("Introduzca la altura del cilindro");
                    altura = entrada.nextInt();
                    
                    System.out.println("Introduzca el radio del cilindro");
                    radio = entrada.nextInt();

                    volumen = 3.14*(radio*radio)*altura;

                    System.out.println("El volumen es de " + volumen );
                    System.out.print("cm cubicos");
                }

                System.out.println(" ");
                System.out.println("Ponga v si desea sacar el valor de alguna propiedad de otra figura");
                System.out.println("Si desea volver al men\u00fa presione j y de enter");
                letra = entrada.next().charAt(0);
                }while(letra ==  'v');

                break;

            case 7:
                do{
                System.out.println("Tabla de numeros que aumentan un cero de digito");

                System.out.println("\tN\t\t\t");
                System.out.println("\t1\t10\t100\t1000");
                System.out.println("\t2\t20\t200\t2000");
                System.out.println("\t3\t30\t300\t3000");
                System.out.println("\t4\t40\t400\t4000");
                System.out.println("\t5\t50\t500\t5000");
                System.out.println("\t6\t60\t600\t6000");
                System.out.println("\t7\t70\t700\t7000");
                System.out.println("\t8\t80\t800\t8000");
                System.out.println("\t9\t90\t900\t9000");
                System.out.println("\t10\t100\t1000\t1000");

                System.out.println(" ");
                System.out.println("Ponga v si quiere volver a ver la tabla.");
                System.out.println("Si requiere volver al men\u00fa presione j y de enter");
                letra = entrada.next().charAt(0);
                }while(letra ==  'v');

                break;

            case 8:
            do{
                System.out.println("Pon el n\u00FAmero de cual deceas saber su factorial:");

                int calculo = 0;

                while(calculo < 1) {
                    try {
                        calculo = entrada.nextInt();
                        if(calculo < 1)
                            System.out.println("Pon un valor mayor y diferente a 0.");
                    }catch(InputMismatchException e) {
                        System.out.println("Pon un n\u00FAmero.");
                        entrada.nextLine();
                    }
                }

                long factorial = 1L;

                for(int i = calculo; i > 0; i--) {
                    factorial=factorial*i;
                }

                System.out.println("El factorial de " + calculo + " es " + factorial + "");

                System.out.println(" OWO ");
                System.out.println("Ponga v si quiere saber el valor de otro factorial");
                System.out.println("Si quiere ir al men\u00fa presione j y de enter");
                letra = entrada.next().charAt(0);
                }while(letra ==  'v');

                break;

            
            case 9:
                do{

                System.out.println("Calculadora basica");
                System.out.println(" ");
                System.out.println("Por favor introduce el primer n\u00famero.");
                primero = entrada.nextDouble();

                System.out.println(" ");
                System.out.println("Ahora el segundo n\u00famero.");
                segundo = entrada.nextDouble();

                System.out.println(" ");
                System.out.println("Escribe la letra que represente la operaci\u00f3n a realizar con el siguiente renglon");
                System.out.println(" ");
                System.out.println("s = suma. r = resta. m = multiplicaci\u00f3n. d = divisi\u00f3n. e = residuo.");
                letra = entrada.next().charAt(0);
                System.out.println(" ");

                if(letra == 's')
                {
                    resultado = primero+segundo;
                    System.out.println("El resultado es: " + resultado);
                }

                if(letra == 'r')
                {
                    resultado = primero-segundo;
                    System.out.println("El resultado es: " + resultado);
                }

                if(letra == 'm')
                {
                    resultado = primero*segundo;
                    System.out.println("El resultado es: " + resultado);
                }

                if(letra == 'd')
                {
                    resultado = primero/segundo;
                    System.out.println("El resultado es: " + resultado);
                }

                if(letra == 'h')
                {
                    resultado = primero%segundo;
                    System.out.println("El residuo es: " + resultado);
                }

                    System.out.println(" ");
                    System.out.println("Ponga v si requiere calcular otra operaci\u00F3n");
                    System.out.println("Si quiere regresar al men\u00fa presione j y de enter");
                    letra = entrada.next().charAt(0);
                }while(letra ==  'v');

                break;

            default:
                System.out.println("No hay nada m\u00E1s");   
        }
        System.out.println(" ");
        System.out.println("Vuelva a tecleear v para volver al men\u00fa");
        System.out.println("Ponga x para terminar la sesion");
        System.out.println(" ");
        letra = entrada.next().charAt(0);

    }while(letra == 'j');       
    }
}