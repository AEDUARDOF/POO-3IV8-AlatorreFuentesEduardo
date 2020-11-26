//en donde voy a poner los datos del diario de greg con get and set
public class Diario extends Libreria{


    private String Tipo;

    public Diario(){
        //constructor
    }

    //metodo para acceder a la clase principal y al Tipo
    public Diario(String TITULO, String AUTOR, int EJEMPLARES, int EJEMPLARES_PRESTADOS, String Tipo){
        //tenemos que utilizar la palabra reservada super, para poder acceder a 
        //los atributos de la clase padre
        super(TITULO, AUTOR, EJEMPLARES, EJEMPLARES_PRESTADOS);
        //acceso a la variable propia de la clase
        this.Tipo = Tipo;
    }

    //metodos get y set

    //recibe obtiene
    public String getTipo(){
        return Tipo;
    }
    //envia u establecer
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    //el metodo para poder visualizar los datos

    public void mostrarDiario(){
        System.out.println("El nombre del libro es: " + getTITULO()
                            + "Su autor es: " + getAUTOR()
                            + "Ejemplares totales: " + getEJEMPLARES()
                            + "Ejemplares prestados: " + getEJEMPLARES_PRESTADOS()
                            + "Tipo de libro: " + getTipo());
    }
}
