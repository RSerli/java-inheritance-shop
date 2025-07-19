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

    public Smartphone(String nome, String marca, Float prezzo, String codiceIMEI, int dimensioneMemoria) {
        super(nome, marca, prezzo);
        this.CodiceIMEI = codiceIMEI;
        this.DimensioneMemoria = dimensioneMemoria;
    }

    /*
     * MODULI
     */
    
    @Override
    public String toString(){
        return ("PREZZO: "+ this.Prezzo + " SMARTPHONE:" + this.Nome + " MARCA: " + this.Marca );
    }
}
