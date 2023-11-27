public class myArray {
    public static void main(String[] args) throws Exception {
        // Use wrapper classes

        Integer[] myArrays = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(myArrays[5]);

        Float[] myFloat = new Float[12];
        myFloat[0] = 1.0f;
        myFloat[1] = 2.0f;
        myFloat[2] = 3.0f;
        myFloat[3] = 4.0f;
        myFloat[4] = 5.0f;
        myFloat[5] = 6.0f;
        myFloat[6] = 7.0f;
        myFloat[7] = 8.0f;
        myFloat[8] = 9.0f;
        myFloat[9] = 10.0f;
        myFloat[10] = 11.0f;
        myFloat[11] = 12.0f;
        System.out.println(myFloat[5]);

        Double[] myDoubles = { 1.5, 2.3, 3.7, 4.2, 5.1 };
        System.out.println(myDoubles[4]);

        Boolean[] myBoolean = { true, false, true, false, true, false };
        System.out.println(myBoolean[5]);

        // Creating a matrix of arrays
        Object[][] matrixOfArrays = {
                myArrays,
                myFloat,
                myDoubles,
                myBoolean
        };

        System.out.println("Element in myFloat array at index 5: " + ((Float[]) matrixOfArrays[1])[5]);
        System.out.println("Element in myDoubles array at index 4: " + ((Double[]) matrixOfArrays[2])[4]);
        System.out.println("Element in myBoolean array at index 5: " + ((Boolean[]) matrixOfArrays[3])[5]);

    }
}
