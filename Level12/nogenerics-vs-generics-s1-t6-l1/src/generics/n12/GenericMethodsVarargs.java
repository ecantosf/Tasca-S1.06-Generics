package generics.n12;

public class GenericMethodsVarargs {

    public <T> void printAll(T... elements){
        System.out.println("They are (" + elements.length +"):");

        for (T element : elements){
            System.out.println("- " + element);
        }

        if(elements.length == 0){
            System.out.println(" No elements");
        }
    }
}
