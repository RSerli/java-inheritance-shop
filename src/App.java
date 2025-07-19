
import Prodotti.Cuffie;
import Prodotti.Smartphone;
import Prodotti.Televisori;

public class App {
    public static void main(String[] args) throws Exception {
        Smartphone SmPhone1 = new Smartphone("Oppo A17", "OPPO", 315.21f , 20, "1254789348966", 16);
        Televisori Tv1 = new Televisori("OLED S95F 4K Vision AI Smart TV", "SAMSUNG", 2299.00f, 20, 55, true);
        Cuffie c1 = new Cuffie("Sony WH-1000MXM4", "SONY", 249.00f, 20, "nero", "Wireless");

    }
}
