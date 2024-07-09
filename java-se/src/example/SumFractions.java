package example;

public class SumFractions{
	public static void main(String[] args){

		// 计算1-1/2+1/3-1/4+...1/100的和
		// 1.分数分为分子和分母
		// 2.分子都是1
		// 3.分母一直到100
		// 4.分母偶数是负数

		double sum = 0;

		for( int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += -1.0/i;
			} else {
				sum += 1.0/i;
			}
			// 或者 sum += (i % 2 == 0 ? -1.0 : 1.0) / i;
		}

		System.out.println(sum);

	}
}