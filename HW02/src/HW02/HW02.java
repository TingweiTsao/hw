package HW02;
import java.util.Scanner;	
import java.util.Random;
public class HW02 {

	public static void main(String[] args) {
		Random rand =new Random();
		int ans=rand.nextInt(10);
		int guess=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�п�J�@�Ӥ�r");
			guess=sc.nextInt();
			
			int validate_num=ans-guess;
			if(validate_num>0) {
				System.out.println("�A�q�����פӤp�F");
			}else if(validate_num<0) {
				System.out.println("�A�q�����פӤj�F");
			}else {
				System.out.println("�A�q�ﵪ�פF");
				break;
			}
		}
	}

}
