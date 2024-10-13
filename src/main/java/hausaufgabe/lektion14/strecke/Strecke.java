


package hausaufgabe.lektion14.strecke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Strecke {
    int a;
    int b;

    public Strecke(int a, int b) {
        if (a < b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }
    /*
    б) Добавьте в класс метод, который проверяет, пересекаются ли два маршрута!
     Метод должен возвращать true, если есть пересечение, иначе false. Два маршрута,
     соприкасающиеся в одной точке, не являются пересечением!
     */

    public boolean compare(Strecke out) {
        if (this.a >= out.b || this.b <= out.a) return false;
        return true;
    }

    /*
    Перепишите метод toString() таким образом, чтобы при выводе маршрута за начальной
    точкой следовали x черточек (-), где x - расстояние от конечной точки до начальной,
    а затем конечная точка.
    Пример вывода для расстояния от 3 до 5:
     3--5
    Пример вывода для расстояния от 2 до 8:
     2------8
    Если конечная и начальная точки одинаковы, то точка выводится только один раз.
    Пример вывода для расстояния от 4 до 4:
       4
     */

    @Override
    public String toString() {
        String str = "" + this.a;
        int minus = this.b - this.a;
        for(int i = 0; i < minus; i++){
            str = str + "-";
        }
        str = str + this.b;
        return str;
    }
}

    class TestStrecke {
        @Test
        public void testStrecke() {
            Strecke strecke = new Strecke(3, 5);
            assertEquals(3, strecke.a);
        }
        @Test
        public void testCompare(){
            Strecke strecke = new Strecke(3,5);
            Strecke out = new Strecke(6,8);
            assertFalse(strecke.compare(out));
        }
        @Test
        public void testToString(){
            Strecke strecke = new Strecke(4,4);
            System.out.println(strecke.toString());
        }
        @Test
        public void testCompareOverlap() {
            Strecke strecke = new Strecke(3, 7);
            Strecke out = new Strecke(5, 9);
            assertTrue(strecke.compare(out)); // Частичное пересечение
        }

        @Test
        public void testCompareTouching() {
            Strecke strecke = new Strecke(3, 5);
            Strecke out = new Strecke(5, 7);
            assertFalse(strecke.compare(out)); // Соприкосновение, но не пересечение
        }

        @Test
        public void testCompareFullOverlap() {
            Strecke strecke = new Strecke(3, 7);
            Strecke out = new Strecke(3, 7);
            assertTrue(strecke.compare(out)); // Полное перекрытие
        }
    }



