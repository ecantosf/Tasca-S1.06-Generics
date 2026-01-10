package generics.n12;

public class GenericMethodsPartial {

    public <T, U> void printElementsGenericPartial (T element1, U element2, String element3) {
        System.out.println("Element 1: " + element1);
        System.out.println("Element 2: " + element2);
        System.out.println("Element 3: " + element3);

    }
}
