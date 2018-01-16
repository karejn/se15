//01561035 Königstorfer

package at.aau.se15.bsp2;

public class Entwickler extends Person {

    public Entwickler(String vorname, String nachname, Integer alter, String bevorzugteProgrammierSprache, IDE ide, boolean datenbanken) {
        super(vorname, nachname, alter);
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
        this.ide = ide;
        this.datenbanken = datenbanken;
    }

    private String bevorzugteProgrammierSprache;
    private IDE ide;
    private boolean datenbanken;

    public String getBevorzugteProgrammierSprache() {
        return bevorzugteProgrammierSprache;
    }

    public IDE getIde() {
        return ide;
    }

    public boolean isDatenbanken() {
        return datenbanken;
    }

    public void setBevorzugteProgrammierSprache(String bevorzugteProgrammierSprache) {
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
    }

    public void setIde(IDE ide) {
        this.ide = ide;
    }

    public void setDatenbanken(boolean datenbanken) {
        this.datenbanken = datenbanken;
    }

    public enum IDE {
        ECLIPSE,
        INTELLIJ,
        NANO
    }

    public String getJobBeschreibung() {
        return this.getClass().getSimpleName();
    }
}
