import java.util.Date;

class regata
{
    String posizione;
    float lunghezza;
    Date data;
    void Inizia(){}
    void IniziaGara(){}
    void FinisciGara(){}
    void Finisci(){}
}

class barca
{
    String nome;
    String nazionalita;
    String modello;
    float lunghezza;
    float altezza;
    boolean velaEstesa;
    void remare(){}
    void navigare(){}
    void estendereVela(){}
    void retrarreVela(){}
}

class sponsor
{
    String nome;
    String codiceFiscale;
    String indirizzo;
    float capitale;
    void dareSoldi(){}
}

class equipaggio
{
    String nome;
    int posizioneSullaClassifica;
    Persona skipper;
    Persona timoniere;
    Persona navigator;
    Persona prodiere;
    Persona drizzista;
}

class Persona
{
    String nome;
    int eta;
    float altezza;
    float energia;
}
