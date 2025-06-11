package collections.viertesemester.aufgabefahrzeuge.musikstücksammlung;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusikStueckSammlungTest {

    @Test
    public void testSortierungNachTitelUndLaenge() {
        MusikStueck s1 = new MusikStueck("B Lied", "Artist1", 210);
        MusikStueck s2 = new MusikStueck("A Lied", "Artist2", 180);
        MusikStueck s3 = new MusikStueck("C Lied", "Artist3", 150);

        MusikStueckSammlung sammlung = new MusikStueckSammlung();
        sammlung.musikStueckEinfügen(s1);
        sammlung.musikStueckEinfügen(s2);
        sammlung.musikStueckEinfügen(s3);


        // Nach Titel
        MusikStueck[] nachTitel = sammlung.getAlleMusikStueckeNachTitel();
        assertEquals("A Lied", nachTitel[0].titel);
        assertEquals("B Lied", nachTitel[1].titel);
        assertEquals("C Lied", nachTitel[2].titel);


        // Nach Laenge
        List<MusikStueck> liste = new ArrayList<>(Arrays.asList(nachTitel));
        liste.sort(new VergleicheMusikStueckLaenge());


        assertEquals(150, liste.get(0).laenge); 
        assertEquals(180, liste.get(1).laenge);
        assertEquals(210, liste.get(2).laenge);





    }

}
