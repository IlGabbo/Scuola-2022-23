import java.util.Date;

class Persona
{
    String nome;
    String cognome;
    Date dataDiNascita;
    String indirizzo;
    String citta;
    String codiceFiscale;
    Tessera registraTessera(){return new Tessera();}
    void annullaTessera(){}
}

class Tessera extends Persona {
    String codice;
    Date dataDiIscrizione;
    float sommaDisponibile;
    void RicaricaCarta(float num){sommaDisponibile += num;}
    void Prenota(String codice, Date dataDiIscrizione, String luogoDiPartenza,
                 Date dataDiInizio, Date dataDiFine, float costoDelViaggio){}
    void Parti(){}
    void Annulla(){}
}