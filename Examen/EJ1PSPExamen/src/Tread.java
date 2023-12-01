
import java.util.logging.Level;
import java.util.logging.Logger;

//Examen


public class Tread {
    int n[] = new int[100];
    int nummax[] = new int[10];
    int contador=0;
    public void matriz(){
        for (int i=0;i<100;i++){
            n[i]=(int)(Math.random()*(100-1)+1);
        }
    }
    
    public synchronized void Maximo(int primerN, int ultimoN,String seg) throws InterruptedException{
        matriz();
        int a =0;
        for(int i=0;i<100;i++){
            contador++;
            Thread.sleep(500l);
            System.out.println(n[i]);
            if(nummax[a]<n[i]){
                nummax[a]=n[i];
            }
            if(contador==10){;
                a++;
                Thread.sleep(1000l);
                System.out.println("\n El numero mayor del "+a+" segmento es "+nummax[a-1]+"\n");
                contador=0;
            }
        }
        comparar();
    }
    
    public void comparar() throws InterruptedException{
        int prueba=0;
        for(int x=0;x<10;x++){
            if(prueba<nummax[x]){
                prueba=nummax[x];
            }
        }
        Thread.sleep(1000l);
        System.out.println("El numero mas grande es:"+prueba);
    }
    
}
