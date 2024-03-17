public class BmiService {
    public int calculate(int weight, double height) {
        double index = weight / (height * height);
        int bmi = (int) index; // должно получиться 28
        return bmi;

    }

}