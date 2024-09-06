//Swapping of two numbers
package Numbers;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1=obj.nextInt();
        System.out.print("Enter n2:");
        int n2=obj.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("n1="+n1);
        System.out.print("n2="+n2);
	}

}
