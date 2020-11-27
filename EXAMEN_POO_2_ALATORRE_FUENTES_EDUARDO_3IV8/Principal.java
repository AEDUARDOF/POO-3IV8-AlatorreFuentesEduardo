public class Principal{
//clase madre
    //al metodo principal de todo el programa
    public void Coordenadas(){
        //y ahora no ponemos anda y utilizare git como se debe 

        //ahora vamos a realizar los objetos de las clases y sus invocaciones

        Perro dog = new Perro("0,0", "0,1", "0,2");
        Gato cat = new Gato("1,0","1,1","1,2");
        Diario diary = new Diario("2,0", "2,1", "2,2");
        /*
        Perro dog = new Perro();
        String nom, raza, tipal, ladr;
        int edad, numvida;
        System(ingresa el nombre)
        nom = entrada.nextLine()
        quiero dominar el mundo *w*
        
        
        */
        //dog.setNombre(nom);
        //cat.setNombre(nom);

        //los metodos
        dog.mostrarPerro();
        cat.mostrarGato();
        diary.mostrarDiario();
        
    }
}
