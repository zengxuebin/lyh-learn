package example;

public class SumHundredSHundred{
	public static void main(String[] args){

		// 计算1+(1+2)+(1+2+3)+(1+2+3+4)+...(1+2+3+...+100)的和
		// 1.本质上是计算多个和
		// 2.先计算1到100的和
		// 3.使用循环的嵌套，将j当中的100替换成i
		// 时间复杂度O(n^2)

		int sum = 0;

		for (int i = 1;i <= 100; i++ ) {
			for (int j = 1;j <= i; j++) {
				sum += j;
			}
		}

		// 或者等差数列前n项和，通项公式：an = a1 + (n-1)d，Sn = n(a1 + an)/2 = n[2a1 + (n-1)d]/2
		// a1 = 1 an = i 单个Sn = i(1+i)/2
		// 多个使用循环相加
		/* for (int i = 1;i <= 100; i++ ) {
		 *	 sum +=i *(1+i)/2
		 * 	}
		*/
		// 时间复杂度O(n)

		System.out.println(sum);

	}
}