import java.lang.management.GarbageCollectorMXBean;

public class Tester {

    public static void main(String[] args) {

        GenericsClass firstElement= new GenericsClass();
        GenericsClass secondElement= new GenericsClass();
        GenericsClass thirdElement= new GenericsClass();
        GenericsClass fourthElement= new GenericsClass();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("this is a string");
        fourthElement.setT("this is a string");

        System.out.println(GenericsClass.isEqual(firstElement,secondElement));
        System.out.println(GenericsClass.isEqual(thirdElement,fourthElement));
    }

}
