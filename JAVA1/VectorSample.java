import java.util.Scanner;

class VectorSample {
    private int[] array;

    // Constructor to initialize the array
    public VectorSample(int size) {
        array = new int[size];
    }

    // Method to read elements into the array from the user
    public void readArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements for the vector:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    // Method to multiply each element by a scalar value
    public void multiplyByScalar(int scalar) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= scalar;
        }
    }

    // Overloaded sum() method to add a constant value to each element
    public void sum(int constant) {
        for (int i = 0; i < array.length; i++) {
            array[i] += constant;
        }
    }

    // Overloaded sum() method to add two VectorSample objects
    public VectorSample sum(VectorSample other) {
        if (other.array.length != this.array.length) {
            throw new IllegalArgumentException("Both VectorSample objects must have the same size.");
        }
        VectorSample result = new VectorSample(this.array.length);
        for (int i = 0; i < array.length; i++) {
            result.array[i] = this.array[i] + other.array[i];
        }
        return result;
    }

    // Method to display the array elements
    public void displayArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the vector: ");
        int size = scanner.nextInt();

        VectorSample vector1 = new VectorSample(size);
        System.out.println("Input for first vector:");
        vector1.readArray();

        System.out.println("\nOriginal Array:");
        vector1.displayArray();

        System.out.print("\nEnter a scalar value to multiply with the first vector: ");
        int scalar = scanner.nextInt();
        vector1.multiplyByScalar(scalar);
        System.out.println("After multiplying by scalar:");
        vector1.displayArray();

        System.out.print("\nEnter a constant value to add to each element of the first vector: ");
        int constant = scanner.nextInt();
        vector1.sum(constant);
        System.out.println("After adding constant:");
        vector1.displayArray();

        VectorSample vector2 = new VectorSample(size);
        System.out.println("\nInput for second vector:");
        vector2.readArray();

        System.out.println("\nSecond Vector:");
        vector2.displayArray();

        System.out.println("\nSum of two Vectors:");
        VectorSample sumVector = vector1.sum(vector2);
        sumVector.displayArray();
    }
}
