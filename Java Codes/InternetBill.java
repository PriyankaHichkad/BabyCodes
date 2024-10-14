/** Q- Monthly charges of Internet broadband connection is computed as per the following slab rates:
No. of hours used	Rate per hour (Rs)
Upto 30	10
Next 10	8
Next 10	6
Above 50	5
WAP to input name and no of hours used and then compute internet bill. Display the output in format
NAME		NO. OF HOURS		BILL AMOUNT

*/
import java.io.*;
public class InternetBill {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int hr, i, bill; String n;
        System.out.println ("Enter your Name");
        n=in.readLine();
        System.out.println("Enter the no. of hours");
        hr=Integer.parseInt(in.readLine());
        if (hr<=30)
          bill=hr*10;
        else if (hr>=30 && hr<=40)
          bill=30*10+(hr-30)*8;
        else if (hr>40 && hr<=50)
          bill=30*10+10*8+(hr-40)*6;
        else
          bill=30*10+10*8+10*6+(hr-50)*5;
        System.out.println("Name \t No. of hours \t Bill Amount");
        System.out.println (n+"\t"+hr+"\t"+bill);
    }
}
