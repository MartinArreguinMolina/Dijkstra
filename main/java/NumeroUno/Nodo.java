
package NumeroUno;
import java.util.*;

public class Nodo {
    String ciudad;
    ArrayList<Arista> aristas = new ArrayList<>();
    
    public Nodo(String ciudad){
        this.ciudad = ciudad;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public ArrayList getAristas(){
        return aristas;
    }
    
    public void setAristas(ArrayList<Arista> aristas){
        this.aristas = aristas;
    }
    
    public void AddAristas(Arista aristas){
        this.aristas.add(aristas);
    }
    
    public String toString(){
        return "\nCiudad : " + ciudad + "\n" + aristas;
    }
    
}
