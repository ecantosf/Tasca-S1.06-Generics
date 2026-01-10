package generics.n12;

public class MainN2 {
    public static void main(String[] args){

        System.out.println("Exercise 1: Partial Generic Methods:");

        GenericMethodsPartial pgm = new GenericMethodsPartial();

        Person scientist = new Person("Galileo","Galilei", 462);
        String quote = "E pur si muove.";
        float gravity = 9.8f;
        Boolean isEarthMoving = true;

        System.out.println("Test 1 - Initial combination:");
        pgm.printElementsGenericPartial(scientist,quote,"Pisa");

        System.out.println("\nTest 2 - Reversed generic order:");
        pgm.printElementsGenericPartial(quote, scientist, "Historical fact");

        System.out.println("\nTest 3 - Float and Boolean:");
        pgm.printElementsGenericPartial(gravity, isEarthMoving, "Physics constant");

        System.out.println("\nTest 4 - Primitive wrappers:");
        pgm.printElementsGenericPartial(1564, 3.14159, "Mathematical constant");

        System.out.println("\nTest 5 - Null values (type preserved):");
        pgm.printElementsGenericPartial(null, null, "Nullable generics");

    }

}
