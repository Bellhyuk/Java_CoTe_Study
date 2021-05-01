import java.util.*;
import java.io.*;
// https://st-lab.tistory.com/64
// �ؽø����ε� Ǯ���! 
// ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
// ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
public class BJ1157 {
    public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in); // ��ĳ���� ��� ����ϱ� �������� �ӵ��� �����ٴ� ġ������ ������ �ִ�. 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ���۸����� ������ ��°�� �Է¹޴� ������� �̰����� �����ؾ��� ���� ���� ���ŷ����� ���� ���� �� �ִٴ� ������ �ִ�.
		String str = br.readLine();
		str = str.toUpperCase(); 

		int[] arr = new int[26]; 
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - 65]++; // A -65-65 = 0, B-66-65 = 1, C-67... , A-Z = 26��
		}

		int max = Integer.MIN_VALUE;
		char answer = '\u0000';
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) { // �ش��ε����� ���� MAX���� ũ�� �� ���� MAX�� �ٲ�
				max = arr[i];
				answer = (char)(i + 65); // A=0+65, B=1+65, C=2+65...
			} else if(arr[i] == max){
				answer = '?';
			}
		}
		System.out.println(answer);
    }
}