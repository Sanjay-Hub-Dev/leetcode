import java.util.*;
public class BillCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();
        float total = item1 + item2 + item3;
        float totalBill = total + (total * 18) / 100;
        System.out.println(totalBill);
    }
}