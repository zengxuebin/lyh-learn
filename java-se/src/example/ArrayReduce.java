package example;

import java.util.Scanner;

public class ArrayReduce{
	public static void main(String[] args){

		// �����������������������ÿ�����������һ��Ԫ�أ���ʾ�����������û���ÿ�����������󣬽����ж�
		// 1.��������
		// 2.ÿ��������ζ����Ҫѭ��
		// 3.ÿ�����������ж��Ƿ�������Ƿ���ǰ����ѭ��

		// ����׼������������
		int[] arr = {1,8,97,31,45};
		int arrayLength = arr.length;
		boolean continueReduction = true;
		Scanner myScanner = new Scanner(System.in);

		/*
			����ѭ��������
				���һ��Ԫ��
			�Ƿ���Ҫ��ǰ����ѭ��
				�ǣ��û������Ƿ���ǰ����
			��ǰ����ѭ��������

		*/
		while(continueReduction && arrayLength > 1) {
			/*
				��������
				  �������鳤�ȣ���������Ԫ�ط������鵱�У��������鳤��
				  �������鳤�ȣ�
				  ʹ��forѭ��������Ԫ�ط�������˳��ȵ����鵱��
				*/
			arrayLength--;

			System.out.println("====��ӡ����====");
			for (int i = 0; i < arrayLength; i++) {
				System.out.println(arr[i]);
			}

			/*
				�����ж�
					���û��û�����Ľ����жϣ��Ǽ���ѭ�������ж�ѭ��
				����ж�ѭ��
					ʹ��һ��continueReduction���ж�ѭ��
				
			*/
			while(true) {
				System.out.println("====�Ƿ������������(y/n)====");
				String input = myScanner.next().toLowerCase();
				if ("y".equals(input)) {
					break;
				} else if("n".equals(input)){
					continueReduction = false;
					break;
				} else{
					System.out.println("���������������������");

				}
			}
		}
	}
}