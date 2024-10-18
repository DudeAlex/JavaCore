/*
 Professor und Student (Vererbung: Generalisierung, Abstrakte Klasse)
Schreiben Sie eine abstrakte Klasse Person mit der abstrakten Methode gibTaetigkeitAus, die
zur Ausgabe der Tätigkeit einer Person (auf die Konsole) genutzt werden soll.
Leiten Sie die konkreten Klassen Student und Professor von Person ab. Beiden soll im
Konstruktor ein Fach übergeben werden können, das sie unterrichten/besuchen.
Erzeugen Sie ein Feld von 100 Personen, die das Fach Programmieren besuchen/unterrichten ‐ abwechselnd belegt mit einem Studenten und einem Professor.
Rufen Sie bei allen 100 Personen die Methode gibTaetigkeitAus auf. Bei einem Studenten soll folgende Ausgabe erfolgen:
Der Student besucht das Fach Programmieren.
Bei einem Professor soll folgende Ausgabe erfolgen:
Der Professor unterrichtet Programmieren.
Wie könnten die Klassen sinnvoll mit JUnit‐Tests getestet werden?
 */

package hausaufgabe.lektion15.mitarbeiterbeförder.proffesorundstudent;

public abstract class Person {
    String fach;
    public Person(String fach){
        this.fach = fach;
    }

    public abstract String gibTaetigkeitAus();
}
