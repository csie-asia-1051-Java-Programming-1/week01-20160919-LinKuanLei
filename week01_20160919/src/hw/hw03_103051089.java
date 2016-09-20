package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入 6 個數(可以有小數)，將輸出這 6 個數中的最小值");
		float min;
		System.out.print("請輸入第一個數字：");
		float a= scn.nextFloat();
		a=Math.round(a);
		System.out.print("請輸入第二個數字：");
		float b= scn.nextFloat();
		b=Math.round(b);
		min=Math.min(a, b);
		System.out.print("請輸入第三個數字：");
		float c= scn.nextFloat();
		c=Math.round(c);
		min=Math.min(min, c);
		System.out.print("請輸入第四個數字：");
		float d= scn.nextFloat();
		d=Math.round(d);
		min=Math.min(min, d);
		System.out.print("請輸入第五個數字：");
		float e= scn.nextFloat();
		e=Math.round(e);
		min=Math.min(min, e);
		System.out.print("請輸入第六個數字：");
		float f= scn.nextFloat();
		f=Math.round(f);
		min=Math.min(min, f);
		System.out.print("最小值為："+(int)min);
	}

}
