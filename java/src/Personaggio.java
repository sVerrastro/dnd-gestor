import java.util.Vector;

public class Personaggio {
    
    String nome;
    int livello = 1;
    int bonus_competenza = 2;

    Razza razza;
    Classe classe;

    static Vector<Stats> statistiche = new Vector<>();

    Vector<Competence> comp_list = new Vector<>();
    Vector<Skills> abilita = new Vector<>();
    Vector<Privilege> privilegi = new Vector<>();

    public void setRace(Razza razza) {
        this.razza = razza;
    }

    public void setClass(Classe classe) {
        this.classe = classe;
    }

    public void addCompetence(Competence competence) {
        comp_list.add(competence);
    }

}
