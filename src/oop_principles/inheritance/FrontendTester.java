package oop_principles.inheritance;

public class FrontendTester extends Tester {

    //5 args constractor


    public FrontendTester() {
    }

    public FrontendTester(String fName, int age, String DOB, String SSN, boolean isAutomationTester) {
        super(fName, age, DOB, SSN, isAutomationTester);
    }
}
