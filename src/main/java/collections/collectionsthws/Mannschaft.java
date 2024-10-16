package collections.collectionsthws;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Mannschaft implements Comparable<Mannschaft> {

        int platzierung;
        String name;
        int anzahlGespielteSpiele;
        int tore;
        int gegentore;
        int punkte;

    public Mannschaft(int platzierung, String name, int anzahlGespielteSpiele, int tore, int gegentore, int punkte) {
        this.platzierung = platzierung;
        this.name = name;
        this.anzahlGespielteSpiele = anzahlGespielteSpiele;
        this.tore = tore;
        this.gegentore = gegentore;
        this.punkte = punkte;
    }

    @Override
    public String toString() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        ps.printf("%2s %14s %3s %7s %3s", platzierung, name,
                anzahlGespielteSpiele, tore + ":" + gegentore, punkte);
        ps.flush();
        return baos.toString();
    }

    @Override
    public int compareTo(Mannschaft m) {
        if (this.punkte < m.punkte) return 1;
        else if (this.punkte > m.punkte) return -1;
        else
        {
            if (this.tore - this.gegentore < m.tore - m.gegentore) return 1;
            else if (this.tore - this.gegentore > m.tore - m.gegentore) return -1;
        }
        return 0;
    }
}
