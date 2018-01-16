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

    public void setBeruf(BERUF beruf) {
        this.beruf = beruf;
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

    public BERUF getBeruf() {
        return beruf;
    }


    private String vorname;
    private String nachname;
    private Integer alter;
    private BERUF beruf;


    public enum BERUF {
        ENTWICKLER,
        ARCHITEKT,
        TESTER
    }


    public String getJobBeschreibung() {
        switch (beruf) {
            case ENTWICKLER:
                return "Entwickelt Code.";
            case ARCHITEKT:
                return "Designed die Architektur des Projekts.";
            case TESTER:
                return "Testet Code.";
            default:
                return "";
        }
    }
}
