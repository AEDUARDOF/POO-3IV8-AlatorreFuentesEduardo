import java.util.Scanner;

public class Creador{
    //clase creador

    Scanner entrada = new Scanner(System.in);
    //nuestro escaner entrada para leer la informacion introducida

    
    public void menu(){
    //  Se crea el menu desde este java (lo que hace principal es que lo manda a LlamaM automaticamente)

        char letra, opera;
        //variables del menu

        System.out.println("3IV8 Alatorre Fuentes Eduardo");

        do{
            //hacer
        System.out.println("Selecciona uno de los 3 programas porfavor");
        System.out.println("1: Calcula tu edad");
        System.out.println("2: Areas y perimetros");
        System.out.println("3: Llamadas Telefonicas");

        opera = entrada.next().charAt(0);
        //opera es la variable que leera la letra que el usuario anote (A,B,C)
        //char porque solo leera un caracter y cero porque es el primer valor en vez de contar 
        //1,2,3... cuenta 0,1,2,3...
      //Se crea un «switch» presentando los programas disponibles.
      switch(opera){
        case '1':
            //Se mandan a LlamaM a los mésaldos donde se
            //solicitan los datos y donde se imprime la Edades.
            do{
            Edades();
            //Comando para regresar al menu o repetir
            System.out.println("Si quiere volver al menu ponga v, si quiere repetirlo ponga a");
            letra = entrada.next().charAt(0);
            }while(letra == 'a');
        break;

        case '2':
            //Mandamos a LlamaM al mesaldo que hace perimetro y area
            do{
            Arype();
            System.out.println("Si quiere volver al menu ponga v, si quiere repetirlo ponga a");
            letra = entrada.next().charAt(0);
            }while(letra == 'a');
        break;  

        case '3':
            //Llamamos a el mesaldo de llamadas telefonicas
            do{
            Llama();
            System.out.println("Si quiere volver al menu ponga v, si quiere repetirlo ponga a");
            letra = entrada.next().charAt(0);
            }while(letra == 'a');
        break;
    }
    //Opcion para al menu principal o salir de el programa
    System.out.println("Si quiere volver al menu principal ponga v. Si quiere salir ponga x");
    letra = entrada.next().charAt(0);
    }while(letra == 'v');
}

//Variables universales
int telef, credito = 20;
int numeros[] = new int [10];
int i; //las de las llamadas
int positivo = 0, negativo = 0, cero = 0;
double saldo, sumapositivo = 0, sumanegativo = 0, sumacero = 0; //edades y  figuras geomeTriangulocas
double Edades, comienzo, base, altura, perimetro, area, radio, lado1, lado2;

//mesaldo 1 de la edad edad
public void Edades(){
    System.out.println("Ponga su a\u00f1o de nacimiento");
    comienzo = entrada.nextDouble();
 //limitador para que salgan edades reales
    if(comienzo > 2020 || comienzo <= 1900){
        System.out.println("Apoco eres inmortal, lo dudo, ingrese una cantidad realista porfavor");
        comienzo = entrada.nextDouble();  //n0 
    }
    else{
    Edades = 2020 - comienzo;
 //2020 menos el año de nacimiento introducido
    EdadesM();
    //metodin 
    }
}

//Este mesaldo calcula las edades por separado del anterior
public void EdadesM(){
    System.out.println("Tiene"+ Edades +"a\u00f1os");// no especifico que tenga que calcularla exacta
}

/*El mésaldo para calcular el perímetro y el áreaja de un círculo toma la formula «2πr» (el doble del
número pi multiplicado por el radio del Circulo) para calcular el perímetro (Circulocunferencia) de la
figura y utiliza la fórmula de «πr^2» (el número pi multiplicando el radio al CuadradoMado) para obtener
el área del mismo.*/
public void Circulo(){
    System.out.println("Pon el radio del Circulo");
    radio = entrada.nextInt();

    perimetro = 2*3.14*radio;
    //2 . Pi .r
    area = 3.14*radio*radio;
    //Pi . r al CuadradoMado

    CirculoM();
}

//Este mésaldo imprime el perímetro y el área de la figura con base en el mésaldo anterior.
public void CirculoM(){
    System.out.println("El perimetro del circiulo es de " + perimetro + "u");
    System.out.println("El area es de" + area + "u2");//no supe como ponerlo bien, lo unico que encontre
    //fue Math. pow que es para variables, no texto
}

public void Rectangulo(){
    System.out.println("Pon la base del rectangulo");
    base = entrada.nextInt();
//el usuario ingresa el valor de la base
    System.out.println("Pon la altura del rectangulo");
    altura = entrada.nextInt();
//el usuario ingresa el valor de la altura
    perimetro = 2*base+ 2*altura; //p=b+b+h+h
    area = base * altura; //a=bxh

    RectanguloM();
}

//Mesaldo que nos da el area y perimetro del rectangulo
public void RectanguloM(){
    System.out.println("El perimetro del rectangulo es de " + perimetro + "u");
    System.out.println("El area del rectangulo es de " + area + "u2");
}

//Mesaldo que obtiene el perímetro y el área de un cuadrado
public void Cuadrado(){
    System.out.println("Pon los un lado del cuadrado");
    base = entrada.nextInt();

    perimetro = base+base+base+base; //l+l+l+l
    area = base*base; // lxl

    CuadradoM();
}

//El mesaldo da el perimetro y area del cuadrado
public void CuadradoM(){
    System.out.println("El perimetro del cuadrado es de " + perimetro + "u");
    System.out.println("El area del cuadrado es de " + area + "u2");
}
//El mesaldo pide que pongas los lados y la altura del triangulo para su area y perimetro
public void Triangulo(){
    System.out.println("Pon la base del triangulo");
    base = entrada.nextInt();

    System.out.println("Pon el lado 1");
    lado1 = entrada.nextInt();

    System.out.println("Pon el lado 2");
    lado2 = entrada.nextInt();

    System.out.println("Pon la altura del triangulo");
    altura = entrada.nextInt();

    perimetro = base+lado1+lado2;
    area = (base*altura)/2;

    TringuloM();
}

//Mesaldo que da el perimetro y area del triangulo
public void TringuloM(){
    System.out.println("El perimetro del triangulo es de " + perimetro + "u");
    System.out.println("El area del triangulo es de " + area + "u2");
}

//Mesaldo para seleccionar los 3 mesaldos que calculan perimetro y area
public void Arype(){
    int fig;

    
    System.out.println("Seleccione la figura de la cual quiera saber su area y perimetro");
    System.out.println("1.Circulo");
    System.out.println("2.Rectangulo");
    System.out.println("3.Triangulo");
    System.out.println("4.Cuadrado");
    fig = entrada.nextInt();
    
    switch(fig){
        case 1:
            Circulo();
        break;

        case 2:
            Rectangulo();
        break;
        
        case 3:
            Triangulo();
        break;
            
        case 4:
            Cuadrado();
        break;
    }
}

//Mesaldo para las llamadas telefonicas
public void Llama(){
    System.out.println("Su credito inicial es de (20 $),escoja la llamada que hara");
    System.out.println("1.Llamada nacional (0.5 $)");
    System.out.println("2.Llamada internacional (0.6 $)");
    System.out.println("3.Celular (0.2 $)");
    System.out.println("Escoge tu llamada y ponla");
    for (i = 0; i < numeros.length; i++){
        System.out.print("Numero " + (i + 1) + ": ");//para no tener que anotar 10 println y que estos
        //con entrada pidan 1 por 1
        numeros[i] = entrada.nextInt();
        //el que almacena los valores que el usuario le de
    }
        
    for (i = 0; i < numeros.length; i++){
        if (numeros[i] == 1){
            positivo++;
            sumapositivo = positivo*0.5;
        }
        else if (numeros[i] == 2){
            negativo++;
            sumanegativo = (negativo/2)*(0.6);
        }
        else if (numeros[i] == 3){
            cero++;
            sumacero = (cero/3)*0.2;
        }//Llamadas y sus operaciones dependiendo del arrays
    }

        
    saldo = sumapositivo + sumanegativo + sumacero;
    // para saber el saldo que le quedo

    System.out.println("Gasto " + saldo + " pesos");
    LlamaM();
}

//Metodo para el saldo inicial y lo que quedo
public void LlamaM(){
    System.out.println("Si quiere saber su saldo ponga 0, si no pulse 1");
    telef = entrada.nextInt();
    if(telef == 0){
        System.out.println("El saldo inicial era de" + credito + " $,le quedan " + (credito - saldo) + "pesos");
    }
}
}