package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("Mosogatás", "A tányérok tisztítása");
        task.setDuration(30);
        task.start();

        System.out.println("Feladat: " + task.getTitle() +
                "\nFeladat leírása: " + task.getDescription() +
                "\nElkezdve: " + task.getStartDateTime() +
                "\nIdőtartam: " + task.getDuration() + " perc");

    }

}
