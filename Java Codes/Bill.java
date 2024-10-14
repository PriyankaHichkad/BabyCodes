/** Q- WAP to accept the name of user and number of units concumed and calculate the bill
No. of Units	Rate per Unit
Upto 170 	50 paise
Nexr 80	75 paise
Next 100	Re. 1
More than 350	Rs 1.35 
Add Rs 200 as fixed charge to the bill. Display:
NAME				BILL AMOUNT
*/
import java.io.*;
public class Bill {
    public static void main(String[] args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter your Name");
        String n=in.readLine();
        System.out.println("Enter no. of Units");
        int u=Integer.parseInt(in.readLine());
        double bill=0.0;
        if(u<=170)
            bill=u*0.5;
        if(u>170 && u<=250)
            bill=170*0.5+(u-170)*0.75;
        if(u>250 && u<=350)
            bill=170*0.5+80*0.75+(u-250)*1;
        if(u>350)
            bill=170*0.5+80*0.75+100+(u-350)*1.35;
        System.out.println("Name\t Bill Amount");
        System.out.println(n+"\t"+(bill+200));
    }
}
