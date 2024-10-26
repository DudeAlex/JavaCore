package collections.interfaces.munzautomat;

public class ChangeCalculatorUpdate implements ChangeCalculator {

    @Override
    public int[] getChange(int euros, int cent) {
        int totalCents = euros * 100 + cent; // Переводим всю сумму в центы
        int[] coins = new int[Coin.values().length]; // Массив для хранения количества монет каждого типа

        // Жадный алгоритм размена, начиная с самой крупной монеты
        for (int i = Coin.values().length - 1; i >= 0; i--) {
            Coin coin = Coin.values()[i];
            coins[i] = totalCents / coin.value; // Количество монет данного номинала
            totalCents %= coin.value; // Оставшаяся сумма после размена

            // Отладочный вывод
            System.out.println("Coin value: " + coin.value + " - Number of coins: " + coins[i]);
            System.out.println("Remaining cents: " + totalCents);
        }

        return coins; // Возвращаем массив с количеством каждой монеты
    }
}
