

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 4 integers");                             //asking the clinet to insert 4 numbers
        System.out.println(" please enter the speed of train 1: ");                 //asking for the speed of train 1
        int v1 = scan.nextInt();                                                    //decleration of a int variable that recived by clinet
        System.out.println("please enter the time of train 1: ");                   //asking for the time in minutes of train 1
        int t1 = scan.nextInt();                                                    //decleration of a int varuble that recived by clinet

        System.out.println("please enter the speed of train 2: ");                  //asking for the speed of train 2
        int v2 = scan.nextInt();                                                    //decleration of a int variable that recived by clinet
        System.out.println("please enter the time of train 2: ");                   //asking for the time in minutes of train 2
        int t2 = scan.nextInt();                                                    //decleration of a int variable that recived by clinet 

        final double Hour = 60;                                                       //decleration of a final variable =60
        double Time1 = t1 / Hour;                                                     //the total time of the 1st train converted to a double integer
        double Dis1 = Time1 * v1;                                                     //the toatl distance of the 1st train = converted time*speed

        double Time2 = t2 / Hour;                                                     //the total time of the 2nd train converted to a double integer
        double Dis2 = Time2 * v2;                                                     //the toatl distance of the 2nd train = converted time*speed
        double sum;                                                                 //decleration of sum
        System.out.println("time1: " + Time1);
        System.out.println("time2: " + Time2);                                         //printing the time and distance of the trains
        System.out.println("dis1: " + Dis1);
        System.out.println("dis2: " + Dis2);
        sum = Dis1 - Dis2;                                                            // calculating the distance between trains
        System.out.println("The distance between the trains is: " + sum + "Km.");   // printing the result(distance between trains)
    }
}
        
       
        
        
        
        
        