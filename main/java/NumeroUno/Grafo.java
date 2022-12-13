package NumeroUno;

import java.util.*;

public class Grafo {

    ArrayList<Nodo> grafo = new ArrayList<>();
    
    public void addNodos(Nodo nodo){
        grafo.add(nodo);
    }
    
    public String toString(){
        return "Nodos : -> " + grafo + " ";
    }
}
