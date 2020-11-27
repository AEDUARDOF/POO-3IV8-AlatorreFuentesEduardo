public class Gato extends Eres{
    //herencia

    private String num_vidas;
    //variable privada

    public Gato(){

    }

    public Gato(String nombre, String raza, String num_vidas){
        super(nombre, raza);
        this.num_vidas = num_vidas;
    }

    //recibe obtiene
    public String getNumvidas(){
        return num_vidas;
    }
    //envia u establecer
    public void setNumvidas(String num_vidas){
        this.num_vidas = num_vidas;
    }

    public void mostrarGato(){
        System.out.println(" Coordenada 4 " + getNombre()
                            + " Coordenada 5 " + getRaza()
                            + " Coordenada 6 " + getNumvidas());
    }
}
    