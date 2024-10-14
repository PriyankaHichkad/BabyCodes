/** Q- A cab service has the following rates:
No. of km	Rate / km (Rs)
First 1 km	25
For next 4 km	20
For next 10 km	15
Above 15 km	10
WAP in Java to accept the name of customer and number of km travelled. Calculate bill amount. Display details in following format
NAME			NO. OF KMS			BILL AMOUNT
 */
import java.io.*;
public class CabRidePrice {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter Customer Name:");
        String n=in.readLine();
        System.out.println("Enter no. of kilometers travelled:");
        int km= Integer.parseInt(in.readLine());
        int bill=0;
        if(km>0 && km<=1)
            bill=km*25;
        else if(km>1 && km<=5)
            bill=1*25+(km-1)*20;
        else if (km>5 && km<=15)
            bill=1*25+4*20+(km-5)*15;
        else if (km>15)
           bill=1*25+4*20+10*15+(km-15)*10;
        System.out.println("bill=Rs"+bill);
    }
}
