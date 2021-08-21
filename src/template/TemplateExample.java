package template;

public class TemplateExample {
    public static void main(String[] args) {
        System.err.println("******* Template Example******");
        BasicEngineering prefferredCourse = new ComputerScience();
        System.out.println("Computer science");
        prefferredCourse.completecourse();
        System.out.println();
        prefferredCourse = new Electronics();
        System.out.println("Electronic");
        prefferredCourse.completecourse();
    }
}
