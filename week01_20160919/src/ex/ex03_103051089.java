package ex;

/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		System.out.println("輸入a");
		int a = scn.nextInt();
		System.out.println("輸入b");
		int b = scn.nextInt();
		System.out.println(Math.pow(a,b));
	}

}
