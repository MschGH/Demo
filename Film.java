package ch.bbw.ms.kino;

public class Film {
    dwduowhdkh

    private String name;
    private int dauer;

    public Film(String name, int dauer) {
        this.name = name;
        this.dauer = dauer;
    }

    public String getName() { return name; }

    public int getDauer() { return dauer; }

    public void printAllInfos(){
        System.out.println("\t- Name: "+name);
        System.out.println("\t- Dauer: "+dauer+"\n");
    }
}
