
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        int caja=5;
        int cliente=5;
        Supermarket g = new Supermarket(caja);
        for (int i = 0; i < cliente; i++) {
            new ThreadAlglo((i+1), g).start();
        }
    }
    
}
