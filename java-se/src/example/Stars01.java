package example;

import java.util.Scanner;

public class Stars01{
	public static void main(String[] args){

		// ��ӡ����
		
		int i = 1;// ��ʼ����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������ǵĲ���");
		int starLevel = myScanner.nextInt();

		while(i <= starLevel ) {
			int j = 1;
			int k = 1;

			//�ո�
			while(k <= starLevel-i){
				System.out.print(" ");
				k++;
			}

			// ����
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