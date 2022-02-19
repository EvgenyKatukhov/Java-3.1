public class BonusMilesService {
    public int calculate(int price) {
        int cost = 50;
        int miles = price / cost;
        return miles;
    }
}
