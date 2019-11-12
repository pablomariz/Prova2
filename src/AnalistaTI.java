public class AnalistaTI extends Analista {
    
    private String codigoAutorizacao;
    
    public AnalistaTI(String n, Servidor c, String ca){
        super(n, c);
        this.setCodigoAutorizacao(ca);
    }
    
    public String getCodigoAutorizacao(){
        return this.codigoAutorizacao;
    }
    public void setCodigoAutorizacao(String ca){
        this.codigoAutorizacao = ca;
    }
    
}