package example;

import java.util.Scanner;

public class Stars01{
	public static void main(String[] args){

		// 打印星星
		
		int i = 1;// 初始层数
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入星星的层数");
		int starLevel = myScanner.nextInt();

		while(i <= starLevel ) {
			int j = 1;
			int k = 1;

			//空格
			while(k <= starLevel-i){
				System.out.print(" ");
				k++;
			}

			// 星星
			while(j <= (2*i-1)) {
				if (j == 1 || j == (2*i-1) || i==starLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.print('\n');
			i++;
		}

	}
}