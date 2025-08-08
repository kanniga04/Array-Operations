import java.util.Scanner;

public class Sec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = null;
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Fill array with numbers");
            System.out.println("2. Display array elements");
            System.out.println("3. Calculate sum and average");
            System.out.println("4. Display multiplication table");
            System.out.println("5. Print star pattern");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter size of the array: ");
                    int size = scanner.nextInt();
                    if (size <= 0) {
                        System.out.println("Size should be positive.");
                        break;
                    }
                    numbers = new int[size];
                    System.out.println("Enter " + size + " numbers:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Element " + (i+1) + ": ");
                        numbers[i] = scanner.nextInt();
                    }
                    System.out.println("Array filled successfully!");
                    break;
                    
                case 2:
                    if (numbers == null) {
                        System.out.println("Array is empty. Fill the array first.");
                    } else {
                        System.out.println("Array elements:");
                        for (int i = 0; i < numbers.length; i++) {
                            System.out.print(numbers[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    if (numbers == null) {
                        System.out.println("Array is empty. Fill the array first.");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < numbers.length; i++) {
                            sum += numbers[i];
                        }
                        double average = (double)sum / numbers.length;
                        System.out.println("Sum = " + sum);
                        System.out.printf("Average = %.2f\n", average);
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter a number for multiplication table: ");
                    int n = scanner.nextInt();
                    System.out.println("Multiplication table for " + n + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(n + " x " + i + " = " + (n * i));
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter number of rows for star pattern: ");
                    int rows = scanner.nextInt();
                    System.out.println("Star pattern:");
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 6:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
        
        scanner.close();
    }
}

