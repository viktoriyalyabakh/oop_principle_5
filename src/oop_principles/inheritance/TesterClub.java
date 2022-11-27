package oop_principles.inheritance;

public class TesterClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111",false);
        FrontendTester ft2 = new FrontendTester("Mike", 29, "1983", "222", false);
        BackendTester bt2 = new BackendTester("Kate", 36, "1988", "333",false);

        Tester[] testers = {ft1, bt1, ft2, bt2};

        int manual = 0, automation = 0;
        int sum = 0;
        for (Tester tester : testers) {
            if(!tester.isAutomationTester) manual++;
            else automation++;

            sum += tester.age;
        }

        System.out.println("Manual tester = " + manual);
        System.out.println("Automation tester = " + automation);
        System.out.println("Average age = " + sum / testers.length);
    }
}
