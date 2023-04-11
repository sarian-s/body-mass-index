public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        /*
        System.out.println(service.calculate(45, 90));
        */

        System.out.printf("%.1f", service.calculate(45, 90));
        System.out.println();

        System.out.printf("%.1f", service.calculate(100, 100));
        System.out.println();

        System.out.println();
        System.out.print("Мой ИМТ ");
        System.out.printf("%.1f", service.calculate(87, 182));
        System.out.println(" кг/м2");

    }

}
