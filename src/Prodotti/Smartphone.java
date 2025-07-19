package Prodotti;

import ProdottoGenerale.ProdottoGenerale;

public class Smartphone extends ProdottoGenerale{
    /*
     * ATTRIBUTI
     */

    private String CodiceIMEI;

    private int DimensioneMemoria;

    /*
     * COSTRUTTORE
     */

    public Smartphone(String nome, String marca, Float prezzo, int iva, String codiceIMEI, int dimensioneMemoria) {
        super(nome, marca, prezzo, iva);
        this.CodiceIMEI = codiceIMEI;
        this.DimensioneMemoria = dimensioneMemoria;
    }

    /*
     * MODULI
     */

}
