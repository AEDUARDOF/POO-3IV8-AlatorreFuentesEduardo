//Datos de los 3 libros
public class Principal{
            
    public void Libreria(){
                Diario diary = new Diario("Diario de Greg", "Juan", 1, 1, "Literatura infantil");
                Quien dog = new Quien("Quien se comio mi queso?", "Pepe", 1, 1, "Lectura rapida");
                Pana cat = new Pana("Meme muerto", "Miguel", 1, 0, "Imaginacion.");
                Existencias meexistencias = new Existencias();
            
            
            diary.mostrarDiario();
            dog.mostrarQuien();
            cat.mostrarPana();
            meExistencias.Prestamo(); 
            }
        }
       
        
        
