public class BonusMilesService {

    public int calculate(int cost) {
        int miles = 20; // (за каждые 20 рублей начисляется 1 милля)
        return cost / miles;
