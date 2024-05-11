import java.util.Vector;

public class Personaggio {
    
    Razza razza;
    Classe classe;

    static Vector<Competence> comp_list = new Vector<>();

    //int
    int livello;
    
    //statistiche
    Stats strength;
    Stats dexterity;
    Stats constitution;
    Stats intelligence;
    Stats wisdom;
    Stats charisma;

    public Personaggio() {

    }

    public static void addCompetence(Competence competence) {
        comp_list.add(competence);
    }

}
