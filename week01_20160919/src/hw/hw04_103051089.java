package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入 A 與 B, 程式輸出 a 開 b 次方後的結果");
		System.out.print("輸入A：");
		double a = scn.nextDouble();
		System.out.print("輸入B：");
		double b = scn.nextDouble();
		System.out.print( a + " 開 " + b + " 次方 = " + Math.pow(a, 1/b));
	}

}
