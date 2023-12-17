public class Prob3_GrossPay {
    public static void main(String[] args) {
        int intHoursWorkedPerWeek = 40;
        double dblRatePerHour = 84.50, dblGrossPay;

        //Computation
        dblGrossPay = intHoursWorkedPerWeek * dblRatePerHour;

        System.out.print("\n\tName:\t\tJuan Dela Cruz\n");
        System.out.print("\tGross Pay:\tP"+ dblGrossPay +"\n\n");
    }
}