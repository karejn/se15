//01561035 Königstorfer

package at.aau.se15.bsp2;

public class Tester extends Person {

    public Tester(String vorname, String nachname, Integer alter, String bevorzugtesTestFramework) {
        super(vorname, nachname, alter);
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }

    private String bevorzugtesTestFramework;

    public String getBevorzugtesTestFramework() {
        return bevorzugtesTestFramework;
    }

    public void setBevorzugtesTestFramework(String bevorzugtesTestFramework) {
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }

    public String getJobBeschreibung() {
        return this.getClass().getSimpleName();
    }
}
