package ControlStatement;


public class SwitchCase {

    public static void main(String[] args) {

    // switch case is used for multiple condition where there are cases

    int num1 = 4;


    switch(num1)

    { // switch statement is used to execute one block of code among many alternatives

        case 1:
            System.out.println("The number is 1");
            break; // break statement is used to exit the switch case
        case 2:
            System.out.println("The number is 2");
            break;
        case 3:
            System.out.println("The number is 3");
            break;
        case 4:
            System.out.println("The number is 4");
            break;
        default:
            System.out.println("The number is not 1, 2, 3 or 4");
            break; // default case is executed if none of the cases match
    }

}
}


