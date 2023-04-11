public class BmiService {
    public double calculate(int weight, double height){
        double heightToM = height/100;
        double result = weight/(heightToM*heightToM);//weight-масса ,height-рост
        return result;//= Math.round(result*10.0)/10.0;


    }
}
