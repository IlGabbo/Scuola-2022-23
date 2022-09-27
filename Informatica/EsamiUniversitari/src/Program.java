import java.util.ArrayList;
import java.util.List;

class Studenti extends corsoLaurea {
    String nome;
    String cognome;
    int numeroMatricola;
    int eta;
    corsoLaurea corsoLaureaIscritto;
    List<esame> esamiSostenuti = new ArrayList<>();
    esame sostieniEsame(String email){return new esame();}
}
class corsoLaurea {
    String codice;
    String nome;
    String indirizzoSede;
}
class esame {
    String nome;
    String docenteTitolare;
    String disciplina;
    corsoLaurea corsoLaureaAppartenente;
    void passaEsame(){Scuola.studentiPassati++;}
}

static class Scuola extends esame {
    static int studentiPassati;
}