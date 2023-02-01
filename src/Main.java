public class Main {
    public static void main(String[] args) {

        /*//class  object  keyword  class
            Car   car1  =   new    Car();
            car1.brand = "Tesla";
            car1.color = "Blue";
            car1.year = 2023;


            Car car2 = new Car();
            car2.brand = "Rolls-Roys";
            car2.color = "Black";
            car2.year = 2023;

        System.out.println("My first car is " + car1.brand + " Тусу " +
                car1.color + " Жылы " + car1.year);



        Synthesizer sin = new Synthesizer();
        sin.brand = "Yamaha";
        sin.color = "silver";
        sin.model = 510;
        sin.size = 61;

        System.out.println(" Менде болгон " + sin.brand + " тусу " + sin.color + " модели " +
                sin.model + " размери " + sin.size + "болчу.");*/

        Car cars = new Car();
        cars.brand = "X";
        cars.color = "Black";
        cars.year = 2023;
        System.out.println(cars.brand + " " + cars.color + " " + cars.year);
        cars.gaz();
        cars.tormoz();


    }
}