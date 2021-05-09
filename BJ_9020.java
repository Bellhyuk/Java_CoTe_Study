package backjoon.one;

import java.util.Scanner;

// �� �������� �� �Ҽ��� ���� ����� ���� ���� �ð� ���� �������� �̸� �Ҽ��� �ƴ� �͵��� �����佺�׳׽��� ü�� �ɷ����� �Ѵ�. (����Ʈ��
// ���� ����(4948) ����)
// �� �Ŀ� �Ҽ��̰�, ���� ���� ������, ������ �� �Է°��� ������Ű�� �� ���� ���Ѵ�. �̴� ��� ����� ���� �������� �ʾƵ� �����ѵ�
// ���� �� ���� n/2 �� �д�.
// �׸��� �� �ݺ����� �ϳ��� ����, �ϳ��� ������Ű�� �Ҽ����� üũ�Ѵ�. ���� ���� ������ �����ϴ� ���� ������ ��Ƽ������ ��µǰ�
// �ݺ����� Ż���Ѵ�.

public class BJ_9020 {

	public static boolean isPrime(int num) {
		if (num == 0)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int a, b =0;
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			for (a = num / 2, b = num / 2;; a++, b--) {

				num = a + b;

				if (isPrime(a) && isPrime(b)) {

					System.out.println(b + " " + a);
					
					break;
				}
			}
		}
	}
}
