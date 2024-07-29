public class incomeTax{
    static double calculateTax(double totalIncome)
    {
        double tax = 0 ;

        else if (totalIncome <= 305850) {
            tax = 35253 + 0.26 * (totalIncome - 195850);
        } 
        else if (totalIncome <= 423300) {
            tax = 63853 + 0.31 * (totalIncome - 305850);
        } 
        else if (totalIncome <= 555600) {
            tax = 100263 + 0.36 * (totalIncome - 423300);
        } 
        else if (totalIncome <= 708310) {
            tax = 147891 + 0.39 * (totalIncome - 555600);
        } 
        else if (totalIncome <= 1500000) {
            tax = 207448 + 0.41 * (totalIncome - 708310);
        } 
        else {
            tax = 532041 + 0.45 * (totalIncome - 1500000);
        }

        system.out.println("Total tax abount: " + tax );

    }
}