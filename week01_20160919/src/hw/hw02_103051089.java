package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 103051089 林冠磊
 */
import  java.util.Random; 
import  java.util.Scanner;
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random ran=new Random();
		System.out.println("輸入 n 將產生 6 個介於 1~n 之間的亂數");
		System.out.print("輸入 n ：");
		int n = scn.nextInt();
		System.out.print("1. "+ (ran.nextInt(n)+1) + "\n2. " + (ran.nextInt(n)+1) + "\n3. " + (ran.nextInt(n)+1) + "\n4. " + (ran.nextInt(n)+1) + "\n5. " + (ran.nextInt(n)+1) + "\n6. " + (ran.nextInt(n)+1));
	}

}
 