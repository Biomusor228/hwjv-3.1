public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int ticketPrice1 = 10_000;
        int bonusMiles1 = service.calculate(ticketPrice1);
        System.out.println("За билет стоимостью " + ticketPrice1 + " рублей начислено " + bonusMiles1 + " бонусных миль.");

        int ticketPrice2 = 13_676;
        int bonusMiles2 = service.calculate(ticketPrice2);
        System.out.println("За билет стоимостью " + ticketPrice2 + " рублей начислено " + bonusMiles2 + " бонусных миль.");

        int ticketPrice3 = 500;
        int bonusMiles3 = service.calculate(ticketPrice3);
        System.out.println("За билет стоимостью " + ticketPrice3 + " рублей начислено " + bonusMiles3 + " бонусных миль.");
    }
}
