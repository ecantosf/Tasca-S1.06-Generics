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


        System.out.println("\nExercise 2: Generic Varargs:");

        GenericMethodsVarargs vgm = new GenericMethodsVarargs();

        System.out.println("1. Basic Varargs Demostration:");

        System.out.println("\n1.1 - Multiple Strings (Planets):");
        vgm.printAll("Mercury", "Venus", "Earth", "Mars");

        System.out.println("\n1.2 - Multiple Integers (Prime Numbers):");
        vgm.printAll(2, 3, 5, 7, 11);

        System.out.println("\n1.3 - Custom Objects (Chemical Elements):");
        vgm.printAll(
                new ChemicalElement("Hydrogen", "H", 1, 14.01),
                new ChemicalElement("Helium", "He", 2, 0.95),
                new ChemicalElement("Lithium", "Li", 3, 180.54)
        );

        System.out.println("\n2. Varargs Characteristics:");

        System.out.println("\n2.1 - Zero arguments (empty varargs):");
        vgm.printAll();

        System.out.println("\n2.2 - Single argument:");
        vgm.printAll("Only one element");

        System.out.println("\n2.3 - Array passed as varargs:");
        String[] planetsArray = {"Jupiter", "Saturn", "Uranus", "Neptune"};
        vgm.printAll(planetsArray);

    }

}
