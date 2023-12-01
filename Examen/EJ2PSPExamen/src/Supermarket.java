
import java.util.ArrayList;


public class Supermarket {
    int numCajas=0;
    int precioCajaTotal=0;
    boolean CajasUsadasTotal=false;
    boolean CajaUsada[];
    ArrayList<ThreadAlglo> listaClientes = new ArrayList();

    public Supermarket(int numCajas) {
        this.numCajas=numCajas;
        this.CajaUsada=new boolean[numCajas];
        for(int i =0;i<this.CajaUsada.length;i++){
            this.CajaUsada[i]=false;
        }
    }
    
    public synchronized void Dinero(int numCaja, int dineroIngresado) throws InterruptedException{
        while(CajasUsadasTotal){
            wait();
        }
        CajasUsadasTotal=true;
        System.out.println("La persona de "+numCaja+" caja ha ingrasado "+dineroIngresado);
        Thread.sleep(1000l);
        precioCajaTotal += dineroIngresado;
        System.out.println("La persona de "+numCaja+" caja ha ingrasado "+precioCajaTotal+" (es el total)");
        CajaUsada[numCaja]=false;
        CajasUsadasTotal=false;
        notifyAll();
    }
    
    public synchronized void UsandoCaja(String nombre, int caus, int pago) throws InterruptedException{
        while(CajaUsada[caus]){
            wait();
        }
        System.out.println(nombre+" ha ido a la caja "+caus+" ya ha pagado "+pago+" €");
        Thread.sleep(1000l);
        notifyAll();
        Dinero(caus,pago);
    }
}
