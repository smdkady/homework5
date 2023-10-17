import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightMeters = 1.87;
        int bmi = service.calculate(weightKg, heightMeters);
        System.out.println(bmi);

    }
}