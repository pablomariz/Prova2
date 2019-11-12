public class Analista extends Servidor {
    
    private Servidor chefe;
    
    public Analista(String n, Servidor c){
        super(n);
        this.setChefe(c);
    }
    
    public Servidor getChefe(){
        return this.chefe;
    }
    public void setChefe(Servidor c){
        this.chefe = c;
    }
    
}