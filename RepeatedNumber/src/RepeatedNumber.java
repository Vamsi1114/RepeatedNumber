import java.util.Scanner;
public class RepeatedNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements do you want: ");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0; i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        
        for(int i=0; i<arr.length;i++) {
        	for(int j=i+1; j<arr.length;j++) {
            	if(arr[i]==arr[j]) {
            		 System.out.println("Repeated Number: "+arr[i]);
            	}
            }
        }
        
	}

}
