import java.util.Scanner;

public class BoolLogic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // triangle sides

        int num1, num2, num3;
//        num1 = 10;
//        num2 = 5;
//        num3 = 7;


        System.out.println("Please enter the first value of the first side of the triangle");
        num1=scanner.nextInt();

        System.out.println("Please enter the second value of the first side of the triangle");
        num2=scanner.nextInt();

        System.out.println("Please enter the third value of the first side of the triangle");
        num3=scanner.nextInt();


//if two of tree sides are equal that triangle is 'isosceles triangle'
        if (num2 == num1 || num1 == num3 || num2 == num3) {
            System.out.println("This is an isosceles triangle");
        }
//if two of tree sides are equal that triangle is 'equilateral triangle'
        if (num1 == num2 && num1 == num3) {
            System.out.println("This is equilateral triangle");
        }
//if all sides are different - 'scalene triangle'
        else if (num1 != num2 && num2 != num3 && num3 != num1) {
            System.out.println("This is scalene triangle");
        }
//if sum of two sides is smaller than third side - 'triangle don't exist'
        else if ((num1 + num2 < num3) || (num1 + num3 < num2) || (num2 + num3 < num1)) {
            System.out.println("Triangle doesn't exist");
        } else {
            System.out.println("Error");
        }


    }


}
