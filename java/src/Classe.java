import java.util.Vector;

public class Classe {
    
    String name;

    boolean hasCantrips;
    boolean hasSpells;

    int dado_vita;
    int punti_ferita;

    Vector<String> save_throws = new Vector<>();
    Vector<Stats> stats = new Vector<>();

    Vector<Competence> competenze = new Vector<>();
    Vector<Privilege> privilegi = new Vector<>();
    Vector<String> languages = new Vector<>();
    Vector<Cantrip> cantrips = new Vector<>();
    Vector<Spell> spells = new Vector<>();
    Vector<Skills> abilita = new Vector<>();

    public Classe(String name) {
        selectClass(name);
    }

    public void selectClass(String name) {
        this.name = name;

        switch (name) {
            case "Barbaro": {
                this.hasCantrips = false;
                this.hasSpells = false;

                //stats
                this.stats.add(new Stats("Forza", 15));
                this.stats.add(new Stats("Destrezza", 11));
                this.stats.add(new Stats("Costituzione", 15));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 10));
                this.stats.add(new Stats("Carisma", 10));

                //pv
                this.dado_vita = 12;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armatura", "Armature Leggere"));
                this.competenze.add(new Competence("Armatura", "Armature Medie"));
                this.competenze.add(new Competence("Armatura", "Scudi"));

                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Armi da Guerra"));

                //tiri salvezza
                this.save_throws.add("Forza");
                this.save_throws.add("Costituzione");

                //privilegi
                this.privilegi.add(new Privilege("Ira"));
                this.privilegi.add(new Privilege("Difesa senza armatura"));

                //abilita
                this.abilita.add(new Skills("Atletica", true));
                this.abilita.add(new Skills("Intimidire", true));

                break;
            }

            case "Bardo": {
                this.hasCantrips = true;
                this.hasSpells = true;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 15));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 10));
                this.stats.add(new Stats("Carisma", 15));

                //pv
                this.dado_vita = 8;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armatura", "Armature Leggere"));
                
                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Balestre a Mano"));
                this.competenze.add(new Competence("Arma", "Spade Corte"));
                this.competenze.add(new Competence("Arma", "Spade Lunghe"));
                this.competenze.add(new Competence("Arma", "Stocchi"));

                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Armi da Guerra"));

                this.competenze.add(new Competence("Strumento", "Lira"));
                this.competenze.add(new Competence("Strumento", "Flauto"));
                this.competenze.add(new Competence("Strumento", "Liuto"));

                //tiri salvezza
                this.save_throws.add("Destrezza");
                this.save_throws.add("Carisma");

                //privilegi
                this.privilegi.add(new Privilege("Ispirazione Bardica"));

                //abilita
                this.abilita.add(new Skills("Inganno", true));
                this.abilita.add(new Skills("Intrattenere", true));
                this.abilita.add(new Skills("Persuasione", true));

                //cantrips
                this.cantrips.add(new Cantrip("Prestidigitazione"));
                this.cantrips.add(new Cantrip("Beffa Crudele"));

                //spells
                this.spells.add(new Spell("Charme su Persone"));
                this.spells.add(new Spell("Caduta Morbida"));
                this.spells.add(new Spell("Sonno"));
                this.spells.add(new Spell("Risata Incontenibile"));

                break;
            }

            case "Chierico": {
                this.hasCantrips = true;
                this.hasSpells = true;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 10));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 15));
                this.stats.add(new Stats("Carisma", 15));

                //pv
                this.dado_vita = 8;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                this.competenze.add(new Competence("Armatura", "Armature Leggere"));
                this.competenze.add(new Competence("Armatura", "Armature Medie"));
                this.competenze.add(new Competence("Armatura", "Scudi"));
                
                this.competenze.add(new Competence("Arma", "Armi Semplici"));

                //tiri salvezza
                this.save_throws.add("Saggezza");
                this.save_throws.add("Carisma");

                //privilegi
                this.privilegi.add(new Privilege("Dominio Divino"));

                //abilita
                this.abilita.add(new Skills("Religione", true));
                this.abilita.add(new Skills("Storia", true));

                //cantrips
                this.cantrips.add(new Cantrip("Taumaturgia"));
                this.cantrips.add(new Cantrip("Salvare i Morenti"));
                this.cantrips.add(new Cantrip("Fiamma Sacra"));

                //spells
                this.spells.add(new Spell("Cura Ferite"));
                this.spells.add(new Spell("Parola Guaritrice"));
                this.spells.add(new Spell("Scudo della Fede"));
                this.spells.add(new Spell("Comando"));

                break;
            }

            case "Druido": {
                this.hasCantrips = true;
                this.hasSpells = true;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 10));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 15));
                this.stats.add(new Stats("Saggezza", 15));
                this.stats.add(new Stats("Carisma", 10));
                
                //pv
                this.dado_vita = 8;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armatura", "Armature Leggere"));
                this.competenze.add(new Competence("Armatura", "Armature Medie"));
                this.competenze.add(new Competence("Armatura", "Scudi"));

                this.competenze.add(new Competence("Arma", "Bastoni Ferrati"));
                this.competenze.add(new Competence("Arma", "Dardi"));
                this.competenze.add(new Competence("Arma", "Falcetti"));
                this.competenze.add(new Competence("Arma", "Fionde"));
                this.competenze.add(new Competence("Arma", "Giavellotti"));
                this.competenze.add(new Competence("Arma", "Lance"));
                this.competenze.add(new Competence("Arma", "Mazze"));
                this.competenze.add(new Competence("Arma", "Pugnali"));
                this.competenze.add(new Competence("Arma", "Randelli"));
                this.competenze.add(new Competence("Arma", "Scimitarre"));

                this.competenze.add(new Competence("Strumento", "Borsa da Erborista"));

                //tiri salvezza
                this.save_throws.add("Intelligenza");
                this.save_throws.add("Saggezza");

                //language
                this.languages.add("Druidico");

                //abilita
                this.abilita.add(new Skills("Addestrare Animali", true));
                this.abilita.add(new Skills("Natura", true));

                //cantrips
                this.cantrips.add(new Cantrip("Frusta di Spine"));
                this.cantrips.add(new Cantrip("Produrre Fiamma"));

                //spells
                this.spells.add(new Spell("Parlare con gli Animali"));
                this.spells.add(new Spell("Amicizia con gli Animali"));
                this.spells.add(new Spell("Saltare"));
                this.spells.add(new Spell("Passo Veloce"));

                break;
            }
            case "Guerriero": {
                this.hasCantrips = false;
                this.hasSpells = false;

                //stats
                this.stats.add(new Stats("Forza", 15));
                this.stats.add(new Stats("Destrezza", 11));
                this.stats.add(new Stats("Costituzione", 15));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 10));
                this.stats.add(new Stats("Carisma", 10));

                //pv
                this.dado_vita = 10;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armatura", "Tutte le Armature"));
                this.competenze.add(new Competence("Armatura", "Scudi"));
                
                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Armi da Guerra"));

                //tiri salvezza
                this.save_throws.add("Forza");
                this.save_throws.add("Costituzione");

                //privilegi
                this.privilegi.add(new Privilege("Stile di Combattimento"));
                this.privilegi.add(new Privilege("Recuperare Energie"));

                //abilita
                this.abilita.add(new Skills("Acrobazia", true));
                this.abilita.add(new Skills("Atletica", true));


                break;
            }
            case "Ladro": {
                this.hasCantrips = false;
                this.hasSpells = false;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 15));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 15));
                this.stats.add(new Stats("Saggezza", 10));
                this.stats.add(new Stats("Carisma", 10));

                //pv
                this.dado_vita = 8;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armatura", "Armature Leggere"));
                
                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Balestre a Mano"));
                this.competenze.add(new Competence("Arma", "Spade Corte"));
                this.competenze.add(new Competence("Arma", "Spade Lunghe"));
                this.competenze.add(new Competence("Arma", "Stocchi"));

                this.competenze.add(new Competence("Strumento", "Arnesi da Scasso"));

                //tiri salvezza
                this.save_throws.add("Destrezza");
                this.save_throws.add("Intelligenza");

                //privilegi
                this.privilegi.add(new Privilege("Attacco Furtivo"));

                //lingue
                this.languages.add("Gergo Ladresco");

                //abilita
                this.abilita.add(new Skills("Acrobazia", true));
                this.abilita.add(new Skills("Atletica", true));
                this.abilita.add(new Skills("Furtivita'", true));
                this.abilita.add(new Skills("Rapidita' di Mano", true));

                break;
            }
            case "Mago": {
                this.hasCantrips = true;
                this.hasSpells = true;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 10));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 15));
                this.stats.add(new Stats("Saggezza", 15));
                this.stats.add(new Stats("Carisma", 10));

                //pv
                this.dado_vita = 6;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Arma", "Balestre Leggere"));
                this.competenze.add(new Competence("Arma", "Bastoni Ferrati"));
                this.competenze.add(new Competence("Arma", "Dardi"));
                this.competenze.add(new Competence("Arma", "Fionde"));
                this.competenze.add(new Competence("Arma", "Pugnali"));

                //tiri salvezza
                this.save_throws.add("Intelligenza");
                this.save_throws.add("Saggezza");

                //privilegi
                this.privilegi.add(new Privilege("Libro degli Incantesimi"));
                this.privilegi.add(new Privilege("Recupero Arcano"));

                //abilita
                this.abilita.add(new Skills("Arcano", true));
                this.abilita.add(new Skills("Intuizione", true));

                //cantrips
                this.cantrips.add(new Cantrip("Dardo di Fuoco"));
                this.cantrips.add(new Cantrip("Mano Magica"));
                this.cantrips.add(new Cantrip("Prestidigitazione"));

                //spells
                this.spells.add(new Spell("Dardo Incantato"));
                this.spells.add(new Spell("Identificare"));
                this.spells.add(new Spell("Vita Falsata"));
                this.spells.add(new Spell("Armatura Magica"));
                this.spells.add(new Spell("Globo Cromatico"));
                this.spells.add(new Spell("Comprensione dei Linguaggi"));

                break;
            }
            case "Monaco": {
                this.hasCantrips = false;
                this.hasSpells = false;

                //stats
                this.stats.add(new Stats("Forza", 15));
                this.stats.add(new Stats("Destrezza", 15));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 10));
                this.stats.add(new Stats("Carisma", 10));

                //pv
                this.dado_vita = 8;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Spade Corte"));

                this.competenze.add(new Competence("Strumento", "Scorte da Calligrafo"));

                //tiri salvezza
                this.save_throws.add("Forza");
                this.save_throws.add("Destrezza");

                //privilegi
                this.privilegi.add(new Privilege("Difesa senza armatura"));
                this.privilegi.add(new Privilege("Arti Marziali"));

                //abilita
                this.abilita.add(new Skills("Acrobazia", true));
                this.abilita.add(new Skills("Atletica", true));
                this.abilita.add(new Skills("Intuizione", true));
                this.abilita.add(new Skills("Religione", true));

                break;
            }
            case "Paladino": {
                this.hasCantrips = false;
                this.hasSpells = false;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 10));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 15));
                this.stats.add(new Stats("Carisma", 15));

                //pv
                this.dado_vita = 10;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armature", "Tutte le Armature"));
                this.competenze.add(new Competence("Armature", "Scudi"));

                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Armi da Guerra"));

                //tiri salvezza
                this.save_throws.add("Saggezza");
                this.save_throws.add("Carisma");

                //privilegi
                this.privilegi.add(new Privilege("Percezione del Divino"));
                this.privilegi.add(new Privilege("Imposizione delle Mani"));

                //abilita
                this.abilita.add(new Skills("Intimidire", true));
                this.abilita.add(new Skills("Religione", true));

                break;
            }
            case "Ranger": {
                this.hasCantrips = false;
                this.hasSpells = false;

                //stats
                this.stats.add(new Stats("Forza", 15));
                this.stats.add(new Stats("Destrezza", 15));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 10));
                this.stats.add(new Stats("Carisma", 10));

                //pv
                this.dado_vita = 10;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armature", "Armature Leggere"));
                this.competenze.add(new Competence("Armature", "Armature Medie"));
                this.competenze.add(new Competence("Armature", "Scudi"));

                this.competenze.add(new Competence("Arma", "Armi Semplici"));
                this.competenze.add(new Competence("Arma", "Armi da Guerra"));

                //tiri salvezza
                this.save_throws.add("Forza");
                this.save_throws.add("Destrezza");

                //privilegi
                this.privilegi.add(new Privilege("Nemico Prescelto"));
                this.privilegi.add(new Privilege("Esploratore Nato"));

                //abilita
                this.abilita.add(new Skills("Indagare", true));
                this.abilita.add(new Skills("Natura", true));
                this.abilita.add(new Skills("Percezione", true));

                break;
            }
            case "Stregone": {
                this.hasCantrips = true;
                this.hasSpells = true;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 10));
                this.stats.add(new Stats("Costituzione", 15));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 11));
                this.stats.add(new Stats("Carisma", 15));

                //pv
                this.dado_vita = 6;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Arma", "Balestre Leggere"));
                this.competenze.add(new Competence("Arma", "Bastoni Ferrati"));
                this.competenze.add(new Competence("Arma", "Dardi"));
                this.competenze.add(new Competence("Arma", "Fionde"));
                this.competenze.add(new Competence("Arma", "Pugnali"));

                //tiri salvezza
                this.save_throws.add("Costituzione");
                this.save_throws.add("Carisma");

                //privilegi
                this.privilegi.add(new Privilege("Origine Stregonesca"));

                //abilita
                this.abilita.add(new Skills("Arcano", true));
                this.abilita.add(new Skills("Persuasione", true));

                //cantrips
                this.cantrips.add(new Cantrip("Dardo di Fuoco"));
                this.cantrips.add(new Cantrip("Mano Magica"));
                this.cantrips.add(new Cantrip("Prestidigitazione"));
                this.cantrips.add(new Cantrip("Tocco Gelido"));

                //spells
                this.spells.add(new Spell("Dardo Incantato"));
                this.spells.add(new Spell("Mani Brucianti"));

                break;
            }
            case "Warlock": {
                this.hasCantrips = true;
                this.hasSpells = true;

                //stats
                this.stats.add(new Stats("Forza", 10));
                this.stats.add(new Stats("Destrezza", 10));
                this.stats.add(new Stats("Costituzione", 11));
                this.stats.add(new Stats("Intelligenza", 10));
                this.stats.add(new Stats("Saggezza", 15));
                this.stats.add(new Stats("Carisma", 15));

                //pv
                this.dado_vita = 8;
                this.punti_ferita = dado_vita + this.stats.elementAt(2).modifier;

                //competenze
                this.competenze.add(new Competence("Armature", "Armature Leggere"));

                this.competenze.add(new Competence("Arma", "Armi Semplici"));

                //tiri salvezza
                this.save_throws.add("Saggezza");
                this.save_throws.add("Carisma");

                //privilegi
                this.privilegi.add(new Privilege("Patrono Ultraterreno"));

                //abilita
                this.abilita.add(new Skills("Inganno", true));
                this.abilita.add(new Skills("Intimidire", true));

                //cantrips
                this.cantrips.add(new Cantrip("Deflagrazione Occulta"));
                this.cantrips.add(new Cantrip("Tocco Gelido"));

                //spells
                this.spells.add(new Spell("Braccia di Hadar"));
                this.spells.add(new Spell("Sortilegio"));

                break;
            }
        }
    }
}
