public class TestaTribunal {
    
    public static void main(String[] args){
        Servidor boss = new Servidor("Pablo");
        
        AssistenteAdm a1 = new AssistenteAdm("João", "Compras");
        
        AnalistaTI t1 = new AnalistaTI("Luciano", boss, "tecnico t.i");
        
        AnalistaJuridico j1 = new AnalistaJuridico("Beatriz", boss, "criminal");
        
        AnalistaAdHoc h1 = new AnalistaAdHoc("Marcos", boss, 100);
        
    }
    
}