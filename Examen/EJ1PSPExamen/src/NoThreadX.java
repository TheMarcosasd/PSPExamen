
public class NoThreadX extends Thread{
    int primerN;
    int ultimoN;
    String segmento;
    Tread tr;

    public NoThreadX(int primerN, int ultimoN, String segmento,Tread tr) {
        this.primerN = primerN;
        this.ultimoN = ultimoN;
        this.segmento = segmento;
        this.tr=tr;
    }
    
    public void run(){
        try{
            
        }catch (InterruptedException ex){
            
        }
    }
}
