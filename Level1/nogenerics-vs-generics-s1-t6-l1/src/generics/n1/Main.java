package generics.n1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1: Non Generic Methods:");

        NoGenericMethods galaxiesOriginalOrder = new NoGenericMethods("Milky Way","Andromeda","Whirlpool");
        NoGenericMethods galaxiesReordered = new NoGenericMethods("Andromeda","Milky Way","Whirlpool");

        System.out.println("Galaxies Original Order: " + galaxiesOriginalOrder.toString());
        System.out.println("Galaxies Reordered: " + galaxiesReordered.toString());

        System.out.println("\nExplicit Getter Demonstration:");
        System.out.println("galaxiesOriginalOrder.getElement1() = " + galaxiesOriginalOrder.getElement1() +
                " | galaxiesReordered.getElement1() = " + galaxiesReordered.getElement1());
        System.out.println("Same value ('Andromeda') in different positions: " +
                "galaxiesOriginalOrder.getElement2() vs galaxiesReordered.getElement1()");

        System.out.println("\nExercise 2: Generic Methods:");

        GenericMethods gm = new GenericMethods();

        Person astronomer = new Person("Carl","Sagan", 94);
        String quote = "Every one of us is, in the cosmic perspective, precious. If a human " +
                "disagrees with you, let him live. In a hundred billion galaxies, you will not find another.";
        Double universeTemperature =  -270.4;
        Long galaxyCount = 100_000_000_000L;
        Boolean isExpanding = true;
        List<String> celestialBodies = Arrays.asList("Star", "Planet", "Galaxy", "Nebula");

        System.out.println("Test 1 - Initial combination:");
        gm.printElements(astronomer, quote, universeTemperature);

        System.out.println("\nTest 2 - Different types and changed order:");
        gm.printElements(galaxyCount, isExpanding, astronomer);

        System.out.println("\nTest 3 - Three different types:");
        gm.printElements(celestialBodies, universeTemperature, galaxyCount);

        System.out.println("\nTest 4 - Two same types and one different:");
        gm.printElements(quote, "Additional string", astronomer);

        System.out.println("\nTest 5 - Null objects:");
        gm.printElements(null, astronomer, null);
    }
}
