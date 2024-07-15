package example;

import java.util.Scanner;

public class ArrayReduce{
	public static void main(String[] args){

		// 数组的缩减：将数组缩减，每次缩减至最后一个元素，提示不能缩减，用户在每次缩减结束后，进行判断
		// 1.数组缩减
		// 2.每次缩减意味着需要循环
		// 3.每次缩减进行判断是否继续，是否提前结束循环

		// 创建准备缩减的数组
		int[] arr = {1,8,97,31,45};
		int arrayLength = arr.length;
		boolean continueReduction = true;
		Scanner myScanner = new Scanner(System.in);

		/*
			结束循环的条件
				最后一个元素
			是否需要提前结束循环
				是，用户决定是否提前结束
			提前结束循环的条件

		*/
		while(continueReduction && arrayLength > 1) {
			/*
				缩减代码
				  减少数组长度，并把数组元素放入数组当中，定义数组长度
				  减少数组长度，
				  使用for循环把数组元素放入减少了长度的数组当中
				*/
			arrayLength--;

			System.out.println("====打印数组====");
			for (int i = 0; i < arrayLength; i++) {
				System.out.println(arr[i]);
			}

			/*
				缩减判断
					对用户用户输入的进行判断，是继续循环，否中断循环
				如何中断循环
					使用一个continueReduction来中断循环
				
			*/
			while(true) {
				System.out.println("====是否继续进行缩减(y/n)====");
				String input = myScanner.next().toLowerCase();
				if ("y".equals(input)) {
					break;
				} else if("n".equals(input)){
					continueReduction = false;
					break;
				} else{
					System.out.println("你的输入有误，请重新输入");

				}
			}
		}
	}
}