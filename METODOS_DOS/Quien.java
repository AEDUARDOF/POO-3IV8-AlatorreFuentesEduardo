//dato extra de el libro quien 
public class Quien extends Libreria{

    private String Corto;

    public Quien(){
        //constructor
    }

    //metodo para acceder a la clase principal y al Corto
    public Quien(String TITULO, String AUTOR, int EJEMPLARES, int EJEMPLARES_PRESTADOS, String Corto){
        //tenemos que utilizar la palabra reservada super, para poder acceder a 
        //los atributos de la clase padre
        super(TITULO, AUTOR, EJEMPLARES, EJEMPLARES_PRESTADOS);
        //acceso a la variable propia de la clase
        this.Corto = Corto;
    }

    //metodos get y set

    //recibe obtiene
    public String getCorto(){
        return Corto;
    }
    //envia u establecer
    public void setCorto(String Corto){
        this.Corto = Corto;
    }

    //el metodo para poder visualizar los datos

    public void mostrarQuien(){ 
    System.out.println("El nombre del libro es: " + getTITULO()
                            + " Su autor es: " + getAUTOR()
                            + " Ejemplares totales: : " + getEJEMPLARES()
                            + " Ejemplares prestados: " + getEJEMPLARES_PRESTADOS()
                            + " No se: " + getCorto());
    }
}

