package Prodotti;

import ProdottoGenerale.ProdottoGenerale;

public class Cuffie extends ProdottoGenerale{
    /*
     * ATTRIBUTI
     */
    protected String Colore;

    protected String TipoConnessione;

    /*
     * COSTRUTTORE
     */

    public Cuffie(String nome, String marca, Float prezzo, int iva, String colore, String tipoConnessione) {
        super(nome, marca, prezzo, iva);
        this.Colore = colore;
        this.TipoConnessione = tipoConnessione;
    }

    /*
     * MODULI
     */

    public void showProdotto(){
        System.out.println("Info Prodotto");
        System.out.println("Nome: " + this.Nome);
        System.out.println("Marca: " + this.Marca);
        System.out.println("Prezzo: " + this.Prezzo);
        System.out.println("Colore: " + this.Colore);
        System.out.println("Connessione: " + this.TipoConnessione);
    }

    
}
