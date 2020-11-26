//variables que pueden usar los 3 libros 
public class Libreria{
    private String TITULO, AUTOR;
    private int EJEMPLARES, EJEMPLARES_PRESTADOS;

    public Libreria(){
    }

    public Libreria(String TITULO, String AUTOR, int EJEMPLARES, int EJEMPLARES_PRESTADOS){
           this.TITULO = TITULO;
           this.AUTOR = AUTOR;
           this.EJEMPLARES = EJEMPLARES;
           this.EJEMPLARES_PRESTADOS = EJEMPLARES_PRESTADOS;
    }

    public String getTITULO(){
        return TITULO;
    }

    public void setTITULO(String TITULO){
        this.TITULO = TITULO;
    }

    public String getAUTOR(){
        return AUTOR;
    }

    public void setAUTOR(String AUTOR){
        this.AUTOR = AUTOR;
    }

    public int getEJEMPLARES(){
        return EJEMPLARES;
    }

    public void setEJEMPLARES(int EJEMPLARES){
        this.EJEMPLARES = EJEMPLARES;
    }

    public int getEJEMPLARES_PRESTADOS(){
        return EJEMPLARES_PRESTADOS;
    }

    public void setEJEMPLARES_PRESTADOS(int EJEMPLARES_PRESTADOS){
        this.EJEMPLARES_PRESTADOS = EJEMPLARES_PRESTADOS;
    }
}