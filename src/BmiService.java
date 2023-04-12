public class BmiService {
    public int calculate(int weight, double height) {
        double heightToM = height / 100;
        double result = weight / (heightToM * heightToM);//weight-масса ,height-рост
        int bmi = (int) result;
        return bmi;

    }
}
