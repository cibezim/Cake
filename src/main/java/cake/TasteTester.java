package cake;

public class TasteTester {
    public static void main(String[] args) {

        BirthdayCake birthdayCake = new BirthdayCake("Chocolate", 29.99, 10);

        WeddingCake weddingCake = new WeddingCake("Vanilla", 199.99, 3);

        System.out.println("Birthday Cake Flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday Cake Price: $" + birthdayCake.getPrice());
        System.out.println("Number of Candles: " + birthdayCake.getCandles());

        System.out.println("\nWedding Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake Price: $" + weddingCake.getPrice());
        System.out.println("Number of Tiers: " + weddingCake.getTiers());
    }
}
