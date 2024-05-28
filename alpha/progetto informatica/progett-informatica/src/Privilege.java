package src;

public class Privilege {
    
    String nome;
    String descrizione;
    String tipo;

    Competence competenza;
    Cantrip trucchetto;

    public Privilege (String nome) {
        switch (nome) {
            case "Scurovisione": scurovisione(); break;
            case "Sensi Acuti": sensi_acuti(); break;
            case "Retaggio Fatato": retaggio_fatato(); break;
            case "Trance": trance(); break;
            case "Magia Drow": magia_drow(); break;
            case "Piede Lesto": piede_lesto(); break;
            case "Maschera della Selva": maschera_della_selva(); break;
            case "Scurovisione Superiore": scurovisione_superiore(); break;
            case "Sensibilita' alla luce del Sole": sensibilita_alla_luce_del_sole(); break;
            case "Fortunato": fortunato(); break;
            case "Coraggioso": coraggioso(); break;
            case "Agilita' Halfling": agilita_halfling(); break;
            case "Furtivita' Innata": furtivita_innata(); break;
            case "Resilienza dei Tozzi": resilienza_dei_tozzi(); break;
            case "Resilienza Nanica": resilienza_nanica(); break;
            case "Esperto Minatore": esperto_minatore(); break;
            case "Competenza negli Strumenti": competenza_negli_strumenti(); break;
            case "Robustezza Nanica": robustezza_nanica(); break;
            case "Discendenza Draconica": discendenza_draconica(); break;
            case "Soffio Draconico": soffio_draconico(); break;
            case "Astuzia Gnomesca": astuzia_gnonmesca(); break;
            case "Illusionista Nato": illusionista_nato(); break;
            case "Conoscenze dell'Artefice": conoscenze_dell_artefice(); break;
            case "Inventore": inventore(); break;
            case "Resistenza Infernale": resistenza_infernale(); break;
            case "Eredita' Infernale": eredita_infernale(); break;
            case "Ira": ira(); break;
            case "Difesa senza armatura": difesa_senza_armatura(); break;
            case "Ispirazione Bardica": ispirazione_bardica(); break;
            case "Dominio Divino": dominio_divino(); break;
            case "Stile di Combattimento": stile_di_combattimento(); break;
            case "Recuperare Energie": recuperare_energie(); break;
            case "Attacco Furtivo": attacco_furtivo(); break;
            case "Libro degli Incantesimi": libro_degli_incantesimi(); break;
            case "Recupero Arcano": recupero_arcano(); break;
            case "Arti Marziali": arti_marziali(); break;
            case "Percezione del Divino": percezione_del_divino(); break;
            case "Imposizione delle Mani": imposizione_delle_mani(); break;
            case "Nemico Prescelto": nemico_prescelto(); break;
            case "Esploratore Nato": esploratore_nato(); break;
            case "Origine Stregonesca": origine_stregonesca(); break;
            case "Patrono Ultraterreno": patrono_ultraterreno(); break;
        }
    }

    //#region DI RAZZA
    public void scurovisione() {
        this.nome = "Scurovisione";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void sensi_acuti() {
        this.nome = "Sensi Acuti";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
        this.competenza = new Competence("Skill", "percezione");
    }

    public void retaggio_fatato() {
        this.nome = "Retaggio Fatato";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void trance() {
        this.nome = "Trance";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void piede_lesto() {
        this.nome = "Piede Lesto";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void maschera_della_selva() {
        this.nome = "Maschera della Selva";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void scurovisione_superiore() {
        this.nome = "Scurovisione Superiore";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void sensibilita_alla_luce_del_sole() {
        this.nome = "Sensibilita' alla luce del Sole";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void magia_drow() {
        this.nome = "Magia Drow";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
        this.trucchetto = new Cantrip("Luci Danzanti");
    }

    public void fortunato() {
        this.nome = "Fortunato";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void coraggioso() {
        this.nome = "Coraggioso";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void agilita_halfling() {
        this.nome = "Agilita' Halfling";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void furtivita_innata() {
        this.nome = "Furtivita' Innata";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void resilienza_dei_tozzi() {
        this.nome = "Resilienza dei Tozzi";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void resilienza_nanica() {
        this.nome = "Resilienza Nanica";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void esperto_minatore() {
        this.nome = "Esperto Minatore";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void competenza_negli_strumenti() {
        this.nome = "Competenza negli Strumenti";
        this.descrizione = "descrizione";
        this.tipo = "Razza";

        this.competenza = new Competence("Strumento", "Strumenti da Fabbro");
    }

    public void robustezza_nanica() {
        this.nome = "Robustezza Nanica";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void discendenza_draconica() {
        this.nome = "Discendenza Draconica";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void soffio_draconico() {
        this.nome = "Soffio Draconico";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void astuzia_gnonmesca() {
        this.nome = "Astuzia Gnomesca";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void illusionista_nato() {
        this.nome = "Illusionista Nato";
        this.descrizione = "descrizione";
        this.tipo = "Razza";

        this.trucchetto = new Cantrip("Illusione Minore");
    }

    public void conoscenze_dell_artefice() {
        this.nome = "Conoscenze dell'Artefice";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void inventore() {
        this.nome = "Inventore";
        this.descrizione = "descrizione";
        this.tipo = "Razza";

        this.competenza = new Competence("Strumento", "Strumenti da Artigiano");
    }

    public void resistenza_infernale() {
        this.nome = "Resistenza Infernale";
        this.descrizione = "descrizione";
        this.tipo = "Razza";
    }

    public void eredita_infernale() {
        this.nome = "Eredita' Infernale";
        this.descrizione = "descrizione";
        this.tipo = "Razza";

        this.trucchetto = new Cantrip("Taumaturgia");
    }
    //#endregion

    //#region DI CLASSE
    public void ira() {
        this.nome = "Ira";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void difesa_senza_armatura() {
        this.nome = "Difesa senza armatura";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void ispirazione_bardica() {
        this.nome = "Ispirazione Bardica";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void dominio_divino() {
        this.nome = "Dominio Divino";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void stile_di_combattimento() {
        this.nome = "Stile di Combattimento";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void recuperare_energie() {
        this.nome = "Recuperare Energie";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void attacco_furtivo() {
        this.nome = "Attacco Furtivo";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void libro_degli_incantesimi() {
        this.nome = "Libro degli Incantesimi";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void recupero_arcano() {
        this.nome = "Recupero Arcano";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void arti_marziali() {
        this.nome = "Arti Marziali";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void percezione_del_divino() {
        this.nome = "Percezione del Divino";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void imposizione_delle_mani() {
        this.nome = "Imposizione delle Mani";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void nemico_prescelto() {
        this.nome = "Nemico Prescelto";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void esploratore_nato() {
        this.nome = "Esploratore Nato";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void origine_stregonesca() {
        this.nome = "Origine Stregonesca";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }

    public void patrono_ultraterreno() {
        this.nome = "Patrono Ultraterreno";
        this.descrizione = "descrizione";
        this.tipo = "Classe";
    }
    //#endregion
}
