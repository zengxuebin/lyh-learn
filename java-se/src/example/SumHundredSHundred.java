package example;

public class SumHundredSHundred{
	public static void main(String[] args){

		// ����1+(1+2)+(1+2+3)+(1+2+3+4)+...(1+2+3+...+100)�ĺ�
		// 1.�������Ǽ�������
		// 2.�ȼ���1��100�ĺ�
		// 3.ʹ��ѭ����Ƕ�ף���j���е�100�滻��i
		// ʱ�临�Ӷ�O(n^2)

		int sum = 0;

		for (int i = 1;i <= 100; i++ ) {
			for (int j = 1;j <= i; j++) {
				sum += j;
			}
		}

		// ���ߵȲ�����ǰn��ͣ�ͨ�ʽ��an = a1 + (n-1)d��Sn = n(a1 + an)/2 = n[2a1 + (n-1)d]/2
		// a1 = 1 an = i ����Sn = i(1+i)/2
		// ���ʹ��ѭ�����
		/* for (int i = 1;i <= 100; i++ ) {
		 *	 sum +=i *(1+i)/2
		 * 	}
		*/
		// ʱ�临�Ӷ�O(n)

		System.out.println(sum);

	}
}