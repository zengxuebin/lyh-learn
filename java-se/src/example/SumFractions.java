package example;

public class SumFractions{
	public static void main(String[] args){

		// ����1-1/2+1/3-1/4+...1/100�ĺ�
		// 1.������Ϊ���Ӻͷ�ĸ
		// 2.���Ӷ���1
		// 3.��ĸһֱ��100
		// 4.��ĸż���Ǹ���

		double sum = 0;

		for( int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += -1.0/i;
			} else {
				sum += 1.0/i;
			}
			// ���� sum += (i % 2 == 0 ? -1.0 : 1.0) / i;
		}

		System.out.println(sum);

	}
}