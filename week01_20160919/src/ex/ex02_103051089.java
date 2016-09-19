package ex;

/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入公斤");
		Scanner scn=new Scanner (System.in);
		float kg = scn.nextFloat();
		float p = kg/0.45359f;
		System.out.println("磅"+p);
	}

}
