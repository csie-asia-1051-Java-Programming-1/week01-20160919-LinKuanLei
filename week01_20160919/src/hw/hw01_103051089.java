package hw;
/*
 * Topic: 假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2)
 * Date: 2016/09/19
 * Author: 103051089 林冠磊
 */
import  java.util.Scanner;
public class hw01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入狀態總數:");
		Scanner scn = new Scanner(System .in);
		int n=scn.nextInt();
		System.out.print("需要"+Math.ceil(Math.log(n)/Math.log(2))+"bit");
			
	}

}
