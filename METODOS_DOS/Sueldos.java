//metodo para los sueldos
import java.util.Scanner;

public class Sueldos{
    //variables
    
    
   
    String nombre;
    int id, puesto, extradia, extranoche; 
    double perdida, total, SueldoEmpleado = 5000, SueldoSupervisor = 8000;
    double ISR = 16, infonavit = 8, gmedicos = 12.8;
    
    Scanner entrada=new Scanner(System.in);

public void Empleados(){

System.out.println("Digite su ID"); 
id=entrada.nextInt(); 

System.out.println("Escriba su nombre");
nombre=entrada.nextLine();

System.out.println("Teclee 1 si es empleado, 2 si es supervisor ");
puesto=entrada.nextInt();

if(puesto == 1){
    SueldoEmpleado();
}
if(puesto == 2){
    SueldoSupervisor();
}
else if{
    System.out.println("Ponga 1 o 2 porfavor"); 
}
}

public void SueldoEmpleado(){
    System.out.println("Ingrese las horas nocturas que ha trabajadado:");
    extranoche=entrada.nextInt(); 

    System.out.println("Ingrese las horas diurnas que ha trabajado:");
    extradia=entrada.nextInt(); 

    total = SueldoEmpleado + extradia + extranoche;

    SueldoFinal();
}

public void SueldoSupervisor(){
    perdida = ISR + infonavit + gmedicos;
    total = SueldoSupervisor - perdida;

    SueldoFinal();
}

public void SueldoFinal(){
    System.out.println("Su sueldo, (" +  id + ") " + nombre + ", es un total de: " + total + " $ ");
}
}