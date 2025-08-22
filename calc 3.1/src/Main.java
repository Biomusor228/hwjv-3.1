public class Main {
    public static void main(String[] args) {
        BonusMilesService service /*(Это - сервис, приложение)*/ = new BonusMilesService(); // (Это - объект, готовая формула, работающая по вызываемому алгоритму приложения)

        int ticketPrice1 = 10_000; //Стоимость билета
        int bonusMiles1 = service.calculate(ticketPrice1); // Бонусные мили равны вытаскиваемому классу (ячейке), высчитывающему количество милей (должно получиться 500)
        System.out.println("За билет стоимостью " + ticketPrice1 + " рублей начислено " + bonusMiles1 + " бонусных миль."); // Вывод бонусных милей

        int ticketPrice2 = 13_676;
        int bonusMiles2 = service.calculate(ticketPrice2);
        System.out.println("За билет стоимостью " + ticketPrice2 + " рублей начислено " + bonusMiles2 + " бонусных миль.");

        int ticketPrice3 = 500;
        int bonusMiles3 = service.calculate(ticketPrice3);
        System.out.println("За билет стоимостью " + ticketPrice3 + " рублей начислено " + bonusMiles3 + " бонусных миль.");
    }
}