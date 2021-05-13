package backjoon.one;

import java.util.Scanner;
import java.util.Stack;

public class BJ_9093 {

	public static void main(String[] args) {
// stack�� �̿��� Ǯ��....�ð� �ʰ�
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			String arr = sc.nextLine() + " ";

			for (char s : arr.toCharArray()) {

				if (Character.isAlphabetic(s))
					stack.push(s);

				else {
					while (!stack.isEmpty())
						System.out.print(stack.pop());

					System.out.print(" ");
				}
			}
		}
	}
}

// StringBuffer�� reverse()�� ����� ���

//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		
//		sc.nextLine();// sc.nextInt() ����� sc.nextLine()�� ����ϰ� �Ǹ� sc.nextInt()���� �Էµ� ���� sc.nextLine()�� �Էµ� ���� ���ԵǱ� ������ �� ������ �ذ��ϱ� ���� ������� sc.nextLine();�� �־��ش�.
//		
//		//String[] arr = new String[n];
//		
//		for(int i=0; i<n; i++) {
//			
//			String[] arr = sc.nextLine().split(" ");
//		
//			int c=arr.length;
//		
//			for(int j=0; j<c; j++) {
//				
//				String text = arr[j];
//				
//				StringBuffer sb = new StringBuffer(text);
//				
//				sb.reverse();
//				
//				System.out.print(sb+" ");
//			}
//		}
//	}
//}
