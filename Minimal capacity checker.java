'''
7)
There are 3 labs in the CSE department(L1, L2, and L3) with a seating capacity of x, y, and z respectively. Find the lab which has minimal seating capacity.  
Input format:
Input consists of 3 integers
The first input denotes the seating capacity of L1(a)
The second input denotes the seating capacity of L2(b)
The third input denotes the seating capacity of L3(c)
Output format:
Print the minimal seating lab capacity
Refer the Sample output for formatting
Sample Input:
30
40
20
Sample Output:
L3
'''

Answer::
import java.util.*;

public class CapacityChecker {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int l1=sc.nextInt();
int l2=sc.nextInt();
int l3=sc.nextInt();
if(l1<l2 && l1<l3) {
	System.out.println("L1");
}
else if(l2<l1 && l2<l3) {
	System.out.println("L2");
	
}
else {
	System.out.println("L3");
}

	}

}

Output:

30
40
20
L3
