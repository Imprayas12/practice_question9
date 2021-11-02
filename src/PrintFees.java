import java.util.Scanner;

class CalcFees{
    public int fees;
    public int fix_deposit;
    public double total_amount;
    public double fix_levy;
    public double Sports_fee;
    public double payable_amount;
    CalcFees(int fees, int fix_deposit){
        this.fees = fees;
        this.fix_deposit = fix_deposit;
    }
    void calc_payable_amount(){
        if(fix_deposit>=(fees/2))
            fees -= 0.05*fees;
        fix_levy = 0.1*fees;
        Sports_fee = 0.05*fees;
        total_amount = fees+fix_levy+Sports_fee;
        payable_amount = total_amount-fix_deposit;
        System.out.println("                               Total amount need to be paid = "+ total_amount);
        System.out.println("                               Remaining amount to be paid = "+ payable_amount);
    }
}


public class PrintFees {
    public static void main(String[] args) {
        System.out.println("                               Hello! Welcome to GLA school of programming");
        Scanner s = new Scanner(System.in);
        int fees = 0;
        int f = 1;
        while (f > 0) {
            System.out.print("                               Enter the Fee amount : ");
            fees = s.nextInt();
            if (fees < 5_00_00) {
                System.out.println("                               Enter amount more than Rs.50000");
            } else f = 0;
        }
        int fix_deposit=0;
        while (f == 0) {
            System.out.print("                               Enter the amount you want to deposit: ");
            fix_deposit = s.nextInt();
            if(fix_deposit>=1_00_00) {
                f = 1;
            }
            else
                System.out.println("                               Enter an amount greater than Rs.10000");
        }
        CalcFees ob = new CalcFees(fees,fix_deposit);
        ob.calc_payable_amount();
    }
}
