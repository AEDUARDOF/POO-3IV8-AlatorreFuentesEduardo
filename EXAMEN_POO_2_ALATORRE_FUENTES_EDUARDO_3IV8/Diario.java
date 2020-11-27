//en donde voy a poner los datos del diario de greg con get and set
public class Diario extends Eres{
    //herencia


    private String Tipo;
    //variable privada

    public Diario(){
        //constructor
    }

    //metodo para acceder a la clase principal y al Tipo
    public Diario(String nombre, String raza, String Tipo){
        super(nombre, raza);
        this.Tipo = Tipo;
    }


    public String getTipo(){
        return Tipo;
    }
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public void mostrarDiario(){
        System.out.println(" Coordenada 7 " + getNombre()
                            + " Coordenada 8 " + getRaza()
                            + " Coordenada 9 " + getTipo());
    }
}
