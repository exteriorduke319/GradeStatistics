import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> reportCard = new HashMap<String, Integer>();


        reportCard.put("Math", 97);
        reportCard.put("Programming", 102);
        reportCard.put("Bio", 101);
        reportCard.put("German", 98);
        reportCard.put("ELA", 92);
        reportCard.put("History", 95);


        System.out.println("Grades by Subject: ");
        System.out.printf("Math: %12d \n", reportCard.get("Math"));
        System.out.printf("Programming: %5d \n", reportCard.get("Programming"));
        System.out.printf("Bio: %13d \n", reportCard.get("Bio"));
        System.out.printf("German: %10d \n", reportCard.get("German"));
        System.out.printf("ELA: %13d \n", reportCard.get("ELA"));
        System.out.printf("History: %9d \n", reportCard.get("History"));
        System.out.println();

        System.out.println("Number of Classes: " + reportCard.size() + "\n");

        int lowest = 105;
        String lowestSubject = "";
        for (String s : reportCard.keySet()) {
            if (reportCard.get(s) < lowest) {
                lowest = reportCard.get(s);
                lowestSubject = s;
            }
        }

        System.out.println("Lowest Grade");
        System.out.printf("Subject: %3s \n", lowestSubject);
        System.out.printf("Grade: %5d \n", lowest);

        int highest = 0;
        String highestSubject = "";
        for (String s : reportCard.keySet()) {
            if (reportCard.get(s) > highest) {
                highest = reportCard.get(s);
                highestSubject = s;
            }
        }

        System.out.println("\nHighest Grade");
        System.out.printf("Subject: %5s \n", highestSubject);
        System.out.printf("Grade: %13d \n", highest);

        double total = 0;
        for (String num : reportCard.keySet()) {
            total += reportCard.get(num);
        }

        System.out.println("\nOverall average: " + total/reportCard.size());

    }
}