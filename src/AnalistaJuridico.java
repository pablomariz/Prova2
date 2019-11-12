public class AnalistaJuridico extends Analista {
    
    private String especialidade;
    
    public AnalistaJuridico(String n, Servidor c, String e){
        super(n, c);
        this.setEspecialidade(e);
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    
}