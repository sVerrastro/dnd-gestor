import java.util.Vector;

public class Elfo {
    
    Vector<Privilegio> privilegi = new Vector<>();
    Vector<String> languages = new Vector<>();

    public Elfo () {
        loadPrivileges();
        loadLanguages();
    }
    
    public void loadPrivileges() {
        privilegi.add(new Privilegio("scurovisione"));
        privilegi.add(new Privilegio("Sensi Acuti"));
        privilegi.add(new Privilegio("Retaggio Fatato"));
        privilegi.add(new Privilegio("Trance"));
    }

    public void loadLanguages() {
        languages.add("Comune");
        languages.add("Elfico");
    }

    private class Subrace {
    
        String name;

        public void setName(String name) {
            this.name = name;
        }

        
    }
}
