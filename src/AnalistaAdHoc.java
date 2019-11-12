public class AnalistaAdHoc extends Analista {
    
    private int horasTrabalhadas;
    
    public AnalistaAdHoc(String n, Servidor c, int h){
        super(n, c);
        this.setHorasTrabalhadas(h);
    }
    
    public int getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int h){
        this.horasTrabalhadas = h;
    }
    
}