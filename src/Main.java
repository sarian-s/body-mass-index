public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        /*
        System.out.println(service.calculate(45, 90));
        */

        System.out.println(service.calculate(45, 90));

        System.out.println(service.calculate(100, 100));

        System.out.print("Мой ИМТ ");
        System.out.print(service.calculate(87, 182));
        System.out.print(" кг/м2");

    }
}