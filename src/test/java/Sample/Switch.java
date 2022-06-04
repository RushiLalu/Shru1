package Sample;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Working on Switch Class");

        int choice = 2;
        switch (choice) {

            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday 2");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Had a Wrong Choice");
        }

    }
}
