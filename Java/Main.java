class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123",new Account("Andres Herrera", "AND123"));
        car.passengenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567",new Account("Andrea Herrera", "AND876"));
        car2.passengenger = 3;
        car2.printDataCar();    }
}