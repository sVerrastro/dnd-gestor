import java.util.Vector;

public class Razza {
    

    String name;

    boolean hasSubRace;
    boolean hasCantrips;
    boolean hasSpells;

    String subrace;
    
    Vector<String> sottorazze = new Vector<>();
    Vector<Privilege> privilegi = new Vector<>();
    Vector<String> languages = new Vector<>();
    Vector<Competence> competences = new Vector<>();
    Vector<Bonus> bonuses = new Vector<>();
    Vector<Cantrip> cantrips = new Vector<>();

    public Razza (String razza) {
        selectRace(razza);
    }

    private void selectRace(String razza) {
        this.name = razza;

        switch (razza) {
            case "Elfo": {
                this.hasSubRace = true;

                //sottorazze
                this.sottorazze.add("Elfo Alto");
                this.sottorazze.add("Elfo dei Boschi");
                this.sottorazze.add("Elfo Oscuro");

                break;
            }
            case "Halfling": {
                this.hasSubRace = true;

                //sottorazze
                this.sottorazze.add("Halfling Piedelesto");
                this.sottorazze.add("Halfling Tozzo");

                break;
            }
            case "Nano": {
                this.hasSubRace = true;

                //sottorazze
                this.sottorazze.add("Nano delle Colline");
                this.sottorazze.add("Nano delle Montagne");

                break;
            }
            case "Dragonide": {
                this.hasSubRace = true;

                //sottorazze
                this.sottorazze.add("Argento");
                this.sottorazze.add("Bianco");
                this.sottorazze.add("Blu");
                this.sottorazze.add("Bronzo");
                this.sottorazze.add("Rosso");
                this.sottorazze.add("Oro");
                this.sottorazze.add("Ottone");
                this.sottorazze.add("Nero");
                this.sottorazze.add("Rame");
                this.sottorazze.add("Verde");

                break;
            }
            case "Gnomo": {
                this.hasSubRace = true;

                //sottorazze
                this.sottorazze.add("Gnomo delle Foreste");
                this.sottorazze.add("Gnomo delle Rocce");

                break;
            }
            case "Tiefling": {
                this.hasSubRace = false;

                break;
            }
            default: 
                break;
        }
    }

    public void addTraits(String subrace) {
        switch (name) {
            case "Elfo": {

                //bonus
                this.bonuses.add(new Bonus("Destrezza", 2));

                //privilegi
                this.privilegi.add(new Privilege("Scurovisione"));
                this.privilegi.add(new Privilege("Sensi Acuti"));
                this.privilegi.add(new Privilege("Retaggio Fatato"));
                this.privilegi.add(new Privilege("Trance"));

                //lingue
                this.languages.add("Comune");
                this.languages.add("Elfico");
                
                switch (subrace) {
                    case "Elfo alto": { //!fixa il bonus
                        hasCantrips = true;

                        //bonus
                        this.bonuses.add(new Bonus("Intelligenza", 2));

                        //competenze
                        this.competences.add(new Competence("Arma", "Spade Corte"));
                        this.competences.add(new Competence("Arma", "Spade Lunghe"));
                        this.competences.add(new Competence("Arma", "Archi Corti"));
                        this.competences.add(new Competence("Arma", "Archi Lunghi"));

                        //todo 1 cantrip a scelta, 1 lingua a scelta
                        
                        break;
                    }
                    case "Elfo dei Boschi": {

                        //bonus
                        this.bonuses.add(new Bonus("Saggezza", 1));

                        //competenze
                        this.competences.add(new Competence("Arma", "Spade Corte"));
                        this.competences.add(new Competence("Arma", "Spade Lunghe"));
                        this.competences.add(new Competence("Arma", "Archi Corti"));
                        this.competences.add(new Competence("Arma", "Archi Lunghi"));

                        //privilegi
                        this.privilegi.add(new Privilege("Piede Lesto")); //speed -> 10.5m
                        this.privilegi.add(new Privilege("Maschera della Selva"));
                        
                        break;
                    }
                    case "Elfo Oscuro": {
                        hasCantrips = true;

                        //bonus
                        this.bonuses.add(new Bonus("Carisma", 1));

                        //competenze
                        this.competences.add(new Competence("Arma", "Spade Corte"));
                        this.competences.add(new Competence("Arma", "Stocchi"));
                        this.competences.add(new Competence("Arma", "Balestre a mano"));

                        //privilegi
                        this.privilegi.add(new Privilege("Scurovisione Superiore"));
                        this.privilegi.add(new Privilege("Sensibilita' alla luce del Sole"));
                        this.privilegi.add(new Privilege("Magia Drow"));

                        break;
                    }
                }

                for (Privilege privilegio : privilegi) {
                    if (privilegio.competenza != null) {
                        this.competences.add(privilegio.competenza);
                    }

                    if (privilegio.trucchetto != null) {
                        this.cantrips.add(privilegio.trucchetto);
                    }
                }

                break;
            }
            case "Halfling": {

                //bonus
                this.bonuses.add(new Bonus("Destrezza", 2));

                //privilegi
                this.privilegi.add(new Privilege("Fortunato"));
                this.privilegi.add(new Privilege("Coraggioso"));
                this.privilegi.add(new Privilege("Agilita' Halfling"));

                //lingue
                this.languages.add("Comune");
                this.languages.add("Halfling");
                
                switch (subrace) {
                    case "Halfling Piedelesto": { 
                        hasCantrips = false;

                        //bonus
                        this.bonuses.add(new Bonus("Carisma", 1));

                        //privilegi
                        this.privilegi.add(new Privilege("Furtivita' Innata"));
                        
                        break;
                    }
                    case "Halfling Tozzo": {
                        hasCantrips = false;

                        //bonus
                        this.bonuses.add(new Bonus("Costituzione", 1));

                        //privilegi
                        this.privilegi.add(new Privilege("Resilienza dei Tozzi"));
                        
                        break;
                    }
                }

                for (Privilege privilegio : privilegi) {
                    if (privilegio.competenza != null) {
                        this.competences.add(privilegio.competenza);
                    }

                    if (privilegio.trucchetto != null) {
                        this.cantrips.add(privilegio.trucchetto);
                    }
                }

                break;
            }
            case "Nano": {

                //bonus
                this.bonuses.add(new Bonus("Costituzione", 2));

                //privilegi
                this.privilegi.add(new Privilege("Scurovisione"));
                this.privilegi.add(new Privilege("Resilienza Nanica"));
                this.privilegi.add(new Privilege("Esperto Minatore"));
                this.privilegi.add(new Privilege("Competenza negli Strumenti"));

                //competenze
                this.competences.add(new Competence("Arma", "Asce"));
                this.competences.add(new Competence("Arma", "Asce da Battaglia"));
                this.competences.add(new Competence("Arma", "Martelli leggeri"));
                this.competences.add(new Competence("Arma", "Martelli da Guerra"));

                //lingue
                this.languages.add("Comune");
                this.languages.add("Nanico");
                
                switch (subrace) {
                    case "Nano delle Colline": { 
                        hasCantrips = false;

                        //bonus
                        this.bonuses.add(new Bonus("Saggezza", 1));

                        //privilegi
                        this.privilegi.add(new Privilege("Robustezza Nanica")); //!pv + 1
                        
                        break;
                    }
                    case "Nano delle Montagne": { 
                        hasCantrips = false;

                        //bonus
                        this.bonuses.add(new Bonus("Forza", 2));

                        //competenze
                        this.competences.add(new Competence("Armature", "Armature Leggere"));
                        this.competences.add(new Competence("Armature", "Armature Medie"));
                        
                        break;
                    }
                }

                for (Privilege privilegio : privilegi) {
                    if (privilegio.competenza != null) {
                        this.competences.add(privilegio.competenza);
                    }

                    if (privilegio.trucchetto != null) {
                        this.cantrips.add(privilegio.trucchetto);
                    }
                }

                break;
            }
            case "Dragonide": {

                //bonus
                this.bonuses.add(new Bonus("Carisma", 1));
                this.bonuses.add(new Bonus("Forza", 2));

                //privilegi
                this.privilegi.add(new Privilege("Discendenza Draconica"));
                this.privilegi.add(new Privilege("Soffio Draconico"));

                //lingue
                this.languages.add("Comune");
                this.languages.add("Draconico");

                for (Privilege privilegio : privilegi) {
                    if (privilegio.competenza != null) {
                        this.competences.add(privilegio.competenza);
                    }

                    if (privilegio.trucchetto != null) {
                        this.cantrips.add(privilegio.trucchetto);
                    }
                }

                break;
            }
            case "Gnomo": {

                //bonus
                this.bonuses.add(new Bonus("Intelligenza", 2));

                //privilegi
                this.privilegi.add(new Privilege("Scurovisione"));
                this.privilegi.add(new Privilege("Astuzia Gnomesca"));

                //lingue
                this.languages.add("Comune");
                this.languages.add("Gnomesco");
                
                switch (subrace) {
                    case "Gnomo delle Foreste": { 
                        hasCantrips = false;

                        //bonus
                        this.bonuses.add(new Bonus("Destrezza", 1));

                        //privilegi
                        this.privilegi.add(new Privilege("Illusionista Nato"));
                        this.privilegi.add(new Privilege("Parlare con le Piccole Bestie"));

                        break;
                    }
                    case "Gnomo delle Rocce": { 
                        hasCantrips = false;

                        //bonus
                        this.bonuses.add(new Bonus("Costituzione", 1));

                        //privilegi
                        this.privilegi.add(new Privilege("Conoscenze dell'Artefice"));
                        this.privilegi.add(new Privilege("Inventore"));

                        break;
                    }
                }

                for (Privilege privilegio : privilegi) {
                    if (privilegio.competenza != null) {
                        this.competences.add(privilegio.competenza);
                    }

                    if (privilegio.trucchetto != null) {
                        this.cantrips.add(privilegio.trucchetto);
                    }
                }

                break;
            }
            case "Tiefling": {

                //bonus
                this.bonuses.add(new Bonus("Intelligenza", 1));
                this.bonuses.add(new Bonus("Carisma", 2));

                //privilegi
                this.privilegi.add(new Privilege("Scurovisione"));
                this.privilegi.add(new Privilege("Resistenza Infernale"));
                this.privilegi.add(new Privilege("Eredita' Infernale")); //! cantrip -> taumaturgia

                //lingue
                this.languages.add("Comune");
                this.languages.add("Infernale");

                for (Privilege privilegio : privilegi) {
                    if (privilegio.competenza != null) {
                        this.competences.add(privilegio.competenza);
                    }

                    if (privilegio.trucchetto != null) {
                        this.cantrips.add(privilegio.trucchetto);
                    }
                }

                break;
            }
            default: 
                break;
        }
    }
}
