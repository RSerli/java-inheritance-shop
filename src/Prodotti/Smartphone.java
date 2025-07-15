package Prodotti;

import ProdottoGenerale.ProdottoGenerale;

public class Smartphone extends ProdottoGenerale{
    /*
     * ATTRIBUTI
     */

    protected String CodiceIMEI;

    protected int DimensioneMemoria;

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

    public void showProdotto(){
        System.out.println("Info Prodotto");
        System.out.println("Nome: " + this.Nome);
        System.out.println("Marca: " + this.Marca);
        System.out.println("Prezzo: " + this.Prezzo);
        System.out.println("CodiceIMEI: " + this.CodiceIMEI);
        System.out.println("Memoria: " + this.DimensioneMemoria);
    }

}
