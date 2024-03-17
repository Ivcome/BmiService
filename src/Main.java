public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98; //Вес в килограмах
        double height = 1.87; //рост в метрах
        int bmi = service.calculate(weight, height);

        System.out.println(bmi);
    }
}