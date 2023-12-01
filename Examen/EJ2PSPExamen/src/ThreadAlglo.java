
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadAlglo extends Thread{
    String name;
    int pagar;
    Supermarket g;
    int CajaUsada;

    public ThreadAlglo(int name, Supermarket g) {
        this.name = "C."+name;
        this.g = g;
    }
    
    public void run(){
        try {
            System.out.println(name+" entro");
            Thread.sleep((long)(Math.random()*10000));
            CajaUsada = (int)(Math.random()*(g.numCajas));
            pagar = (int) (Math.random()*(100));
            g.UsandoCaja( name,CajaUsada, pagar);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadAlglo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
