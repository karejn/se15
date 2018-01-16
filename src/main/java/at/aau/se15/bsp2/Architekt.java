package at.aau.se15.bsp2;

public class Architekt extends Person {

    public Architekt(String vorname, String nachname, Integer alter, String taetigkeitsfeld) {
        super(vorname, nachname, alter);
        this.taetigkeitsfeld = taetigkeitsfeld;
    }

    private String taetigkeitsfeld;

    public String getFeld() {
        return taetigkeitsfeld;
    }

    public void setFeld(String taetigkeitsfeld) {
        this.taetigkeitsfeld = taetigkeitsfeld;
    }

    public enum TAETIGKEITSFELD {
        ENTERPRISE,
        APPLIKATION
    }

    public String getJobBeschreibung() {
        return this.getClass().getSimpleName();
    }


}
