package language.basics;

public class SwitchCaseStatements {

    public static void main(String[] args) {
        // Switch and execute particular case based on expression

        int direction = 10;

        switch (direction) {
        case 1:
            System.out.println("EAST");
            break;
        case 2:
            System.out.println("WEST");
            break;
        case 3:
            System.out.println("NORTH");
            break;
        case 4:
            System.out.println("SOUTH");
            break;
        default:
            System.out.println("This is invalid Input");

        }

    }

}
