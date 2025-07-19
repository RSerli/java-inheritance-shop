package Prodotti;

import ProdottoGenerale.ProdottoGenerale;

public class Cuffie extends ProdottoGenerale{
    /*
     * ATTRIBUTI
     */
    private String Colore;

    private String TipoConnessione;

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

    
}
