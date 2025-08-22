public class BonusMilesService {
    public int calculate(int ticketPrice){
        int rublesPerMile = 20;
        return ticketPrice / rublesPerMile;
    }
}
