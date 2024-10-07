package collections.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    @Test
    public void testPerson() {
        Adresse adresse = new Adresse("Sanderring", "2354", "97074", "Wurzburg");
        Person person = new Person("Daniyar", "Sabirov", adresse);
        assertNotNull(person); // Проверяем, что объект Person успешно создан
    }

    @Test
    public void testVorname() {
        Adresse adresse = new Adresse("Sanderring", "2354", "97074", "Wurzburg");
        assertThrows(RuntimeException.class, () -> {
            new Person("daniyar", "Sabirov", adresse); // Ожидаем исключение для некорректного имени
        });
    }

    @Test
    public void testInvalidAdresseStrasse() {
        assertThrows(RuntimeException.class, () -> {
            new Adresse("sanderring", "2354", "97074", "Wurzburg"); // Ожидаем исключение для некорректной улицы
        });
    }

    @Test
    public void testInvalidAdresseHausnummer() {
        assertThrows(RuntimeException.class, () -> {
            new Adresse("Sanderring", "A354", "97074", "Wurzburg"); // Ожидаем исключение для некорректного номера дома
        });
    }

    @Test
    public void testInvalidAdresseOrt() {
        assertThrows(RuntimeException.class, () -> {
            new Adresse("Sanderring", "2354", "97074", "wurzburg"); // Ожидаем исключение для некорректного города
        });
    }
}
