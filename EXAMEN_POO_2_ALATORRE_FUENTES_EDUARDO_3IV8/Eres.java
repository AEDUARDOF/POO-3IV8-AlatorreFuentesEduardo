public class Eres{

    //vamos a utilizar el principio de encapsulamiento
    //para poder proteger el acceso a las variables de la clase
    private String nombre, raza;
    

    //ahora vamos crear el constructor
    public Eres(){
        /*
        Y los constructores se crean automaticamente en java, si es que no son
        invocados, y sirven para la inicializacion de variables y poder crear objetos
        de la clase
        
        */
    }
    //acceder a los datos     estos son parametros
    public Eres(String nombre, String raza){
        //pq si :3
        /*
        para poder acceder a las variables porque son privadas es necesario
        utilizar la palabra reservada this
        */ 

        this.nombre = nombre;
        this.raza = raza;
    }

    //para poder enviar y obtener las variables necesitamos los metodos get y set
    
    //recibe obtiene
    public String getNombre(){
        return nombre;
    }
    //envia u establecer
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //recibe obtiene
    public String getRaza(){
        return raza;
    }
    //envia u establecer
    public void setRaza(String raza){
        this.raza = raza;
    }

}