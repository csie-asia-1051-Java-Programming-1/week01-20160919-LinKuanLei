package ex;

/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入華氏");
		Scanner scn=new Scanner (System.in);
		float f = scn.nextFloat();
		float c=(f-32)*5/9;
		System.out.println("攝氏"+c);
		
	}

}
