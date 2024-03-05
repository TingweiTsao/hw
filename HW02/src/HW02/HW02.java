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
			System.out.print("請輸入一個文字");
			guess=sc.nextInt();
			
			int validate_num=ans-guess;
			if(validate_num>0) {
				System.out.println("你猜的答案太小了");
			}else if(validate_num<0) {
				System.out.println("你猜的答案太大了");
			}else {
				System.out.println("你猜對答案了");
				break;
			}
		}
	}

}
