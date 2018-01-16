package at.aau.se15.bsp2;

public class Person {
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public void setBevorzugteProgrammierSprache(String bevorzugteProgrammierSprache) {
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public void setDatenbanken(boolean datenbanken) {
        this.datenbanken = datenbanken;
    }

    public void setFeld(String feld) {
        this.feld = feld;
    }

    public void setBevorzugtesTestFramework(String bevorzugtesTestFramework) {
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }

    public String getVorname() {

        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Integer getAlter() {
        return alter;
    }

    public String getBeruf() {
        return beruf;
    }

    public String getBevorzugteProgrammierSprache() {
        return bevorzugteProgrammierSprache;
    }

    public String getIde() {
        return ide;
    }

    public boolean isDatenbanken() {
        return datenbanken;
    }

    public String getFeld() {
        return feld;
    }

    public String getBevorzugtesTestFramework() {
        return bevorzugtesTestFramework;
    }

    private String vorname;
    private String nachname;
    private Integer alter;
    private String beruf;
    private String bevorzugteProgrammierSprache;
    private String ide;
    private boolean datenbanken;
    private String feld;
    private String bevorzugtesTestFramework;

    public String getJobBeschreibung() {
        switch(beruf) {
            case "Entwickler": return "Entwickelt Code.";
            case "Architekt": return "Designed die Architektur des Projekts.";
            case "Tester": return "Testet Code.";
            default: return "";
        }
    }
}
