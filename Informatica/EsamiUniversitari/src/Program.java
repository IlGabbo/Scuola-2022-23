import java.util.ArrayList;
import java.util.List;

class Studenti {
    String nome;
    String cognome;
    int numeroMatricola;
    int eta;
    corsoLaurea corsoLaureaIscritto;
    corsoLaurea prenota(String email){return new corsoLaurea();}
    List<esame> esamiSostenuti = new ArrayList<>();
}
class corsoLaurea {
    String codice;
    String nome;
    String indirizzoSede;
    esame sosteniEsame(){return new esame();}
}
class esame {
    String nome;
    String docenteTitolare;
    String disciplina;
    void passaEsame(){Scuola.studentiPassati++;}
}

static class Scuola
{
    static int studentiPassati;
}