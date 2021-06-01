import java.util.*;
/*
�ǻ��ڵ�
ó�� ������ ���(k���� ���� �߰��� ���ϴ� ��??�� ���� ����� ������...)
max�� ���� 
start = 0, end = start + k, start++
���۰� ���� ��ĭ�� ������Ű�� ������ +1�� ���ָ� �����찡 ���������� �����̸鼭 nowsum�� ���Ѵ�.arr[start] + ??? + arr[end]
nowsum > max�̸� nowsum = max(=���⼱ answer)
*/
class IFR3_3 {
	public int solution(int k, int[] arr) {
		int answer = 0, nowsum = 0; // ���⼭ answer�� max��
		
		for(int i=0; i<k; i++) {
			nowsum += arr[i];
		}
		answer = nowsum;

		for(int i=k; i<arr.length; i++) {
			nowsum += arr[i] - arr[i-k];
			answer = Math.max(answer, nowsum);
		}
			
		return answer;
	}
	public static void main(String[] args) {
		IFR3_3 C = new IFR3_3();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt(); // �� ���� �ջ� �� ���ΰ�
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();

		System.out.println(C.solution(k, arr));
	}
}
