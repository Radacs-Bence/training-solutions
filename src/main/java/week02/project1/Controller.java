package week02.project1;

import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner(System.in);

    private Office office;
    private String button;


    public void readOffice(){

        office = new Office();
        int numberOfRooms;

        System.out.println("Hány Tárgyalót szeretne regisztrálni?");
        numberOfRooms = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfRooms; i++){
            String name;
            int length;
            int width;

            System.out.println("Terem neve:");
            name = scanner.nextLine();
            System.out.println("Terem hossza:");
            length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Terem szélessége:");
            width = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);

        }

    }

    public void printMenu(){
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján\n" +
                "Többi: Kilépés");
        button = scanner.nextLine();
    }

    public void runMenu(){

        if ("1".equals(button)){
            System.out.println("Tárgyalók sorrendben:");
            office.printNames();
        }if ("2".equals(button)){
            System.out.println("Tárgyalók visszafele sorrendben:");
            office.printNamesReverse();
        }if ("3".equals(button)){
            System.out.println("Minden második tárgyaló:");
            office.printEvenNames();
        }if ("4".equals(button)){
            System.out.println("Területek:");
            office.printAreas();
        }if ("5".equals(button)){
            System.out.println("Keresés pontos név alapján. Kérem adja meg a keresett terem nevét:");
            String name = scanner.nextLine();
            office.printMeetingRoomsWithName(name);
        }if ("6".equals(button)){
            System.out.println("Keresés névtöredék alapján. Kérem adja meg a keresett névtöredéket:");
            String part = scanner.nextLine();
            office.printMeetingRoomsContains(part);
        }if ("7".equals(button)){
            System.out.println("Keresés terület alapján. Kérem adja meg a keresett minimum területet:");
            int area = scanner.nextInt();
            scanner.nextLine();
            office.printAreasLargerThan(area);
        }
    }

    public Boolean exitButton() {
        return "1".equals(button) ||
                "2".equals(button) ||
                "3".equals(button) ||
                "4".equals(button) ||
                "5".equals(button) ||
                "6".equals(button) ||
                "7".equals(button);
    }

    public void stepMessage(){
        System.out.println("Nyomja meg az entert a továbblépéshez!");
        scanner.nextLine();
    }

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.readOffice();

        for (int i = 0; i != 2; ) {
            controller.printMenu();
            controller.runMenu();
            controller.stepMessage();
            if (controller.exitButton() == false){
                i =2;
            }
        }

    }

}
