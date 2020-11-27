public class Perro extends Eres{
    //herencia

    private String ladrido;
    //variable privada

    public Perro(){
        //constructor
    }

    //metodo para acceder a la clase principal y al ladrido
    public Perro(String nombre, String raza, String ladrido){
        //tenemos que utilizar la palabra reservada super, para poder acceder a 
        //los atributos de la clase padre
        super(nombre, raza);
        //acceso a la variable propia de la clase
        this.ladrido = ladrido;
    }

    //metodos get y set

    //recibe obtiene
    public String getLadrido(){
        return ladrido;
    }
    //envia u establecer
    public void setLadrido(String ladrido){
        this.ladrido = ladrido;
    }

    //el metodo para poder visualizar los datos

    public void mostrarPerro(){
        System.out.println(" Coordenada 1 " + getNombre()
                             + " Coordenada 2 " + getRaza()
                             + " Coordenada 3 " + getLadrido());
    }
}
