import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {

        Factory factory = new Factory();
        System.out.println("Podaj marke: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String brand = factory.getCar(str).getBrand();
        String clazz = factory.getCar(str).getClass().getName();

        System.out.println(brand);
        System.out.println(clazz);
    }

    public Cars getCar(String brand){
        Cars cars;

        if(brand.equals("fiat")){
            cars = new Fiat();
        } else if (brand.equals("ford")){
            cars = new Ford();
        }  else if (brand.equals("mercedes")){
            cars = new Mercedes();
        } else {
            cars = new Cars();
        }
        return cars;
    }
}
