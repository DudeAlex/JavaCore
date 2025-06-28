package collections.viertesemester.musikstücksammlung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicStueckTest {

    MusikStueckSammlung sammlung;

    @BeforeEach
    public void setup(){
        sammlung = new MusikStueckSammlung();

        sammlung.musikStueckEinfügen(new MusikStueck("Bohemian Rhapsody", "Queen", 354));
        sammlung.musikStueckEinfügen(new MusikStueck("Yesterday", "The Beatles", 125));
        sammlung.musikStueckEinfügen(new MusikStueck("Stairway to Heaven", "Led Zeppelin", 482));
        sammlung.musikStueckEinfügen(new MusikStueck("Africa", "Toto", 295));
    }

    @Test
    public void testSortierungNachTitel(){

        List<MusikStueck> sortiered = sammlung.getAlleMusikStueckeNachTitel();
        assertEquals("Africa", sortiered.get(0).titel);
        assertEquals("Bohemian Rhapsody", sortiered.get(1).titel);
        assertEquals("Stairway to Heaven", sortiered.get(2).titel);
        assertEquals("Yesterday", sortiered.get(3).titel);
    }

    @Test
    public void testSortierungNachLaenge(){

        List<MusikStueck> sortiered = sammlung.getAlleMusikStueckeNachLaenge();

        assertEquals("Yesterday", sortiered.get(0).titel);
        assertEquals("Africa", sortiered.get(1).titel);
        assertEquals("Bohemian Rhapsody", sortiered.get(2).titel);
        assertEquals("Stairway to Heaven", sortiered.get(3).titel);

    }
}
