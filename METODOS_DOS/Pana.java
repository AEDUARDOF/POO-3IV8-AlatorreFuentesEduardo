//datos de Pana en este caso wiiiiiiiiii
public class Pana extends Libreria{
    private String wii;
    
    public Pana(){
    }

    
    //metodo para acceder a la clase principal y al wii
    public Pana(String TITULO, String AUTOR, int EJEMPLARES, int EJEMPLARES_PRESTADOS, String wii){
        //tenemos que utilizar la palabra reservada super, para poder acceder a 
        //los atributos de la clase padre
        super(TITULO, AUTOR, EJEMPLARES, EJEMPLARES_PRESTADOS);
        //acceso a la variable propia de la clase
        this.wii = wii;
    }

    //metodos get y set

    //recibe obtiene
    public String getwii(){
        return wii;
    }
    //envia u establecer
    public void setwii(String wii){
        this.wii = wii;
    }

    //el metodo para poder visualizar los datos

    public void mostrarPana(){
        System.out.println("El nombre del libro es: " + getTITULO()
                            + " Su autor es: " + getAUTOR()
                            + " Ejemplares totales: : " + getEJEMPLARES()
                            + " Ejemplares prestados: " + getEJEMPLARES_PRESTADOS()
                            + " No se: " + getwii());
    }
}