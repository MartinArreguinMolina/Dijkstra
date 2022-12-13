
package NumeroUno;

public class Arista {
    private Nodo origen;
    private Nodo destino;
    private double peso;
    
    public Arista(Nodo origen , Nodo destino , double peso){
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }
    
    public Nodo getOrigen(){
        return origen;
    }
    
    public void setOrigen(Nodo origen){
        this.origen = origen;
    }
    
    public Nodo getDestino(){
        return destino;
    }
    
    public void setNodo(Nodo destino){
        this.destino = destino;
    }
    
   public double getPeso(){
       return peso;
   }
   
   public void setPeso(double peso){
       this.peso = peso;
   }
   
   public String toString(){
       return "Origen : " + getOrigen().getCiudad() + " " + ", Destino : " + " " + this.getDestino().getCiudad() + " " + ", Peso : " + " " + getPeso();
   }
    
}
