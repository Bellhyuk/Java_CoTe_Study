import java.util.*;

// �±״� �ܾ �ƴϸ�, �±׿� �ܾ� ���̿��� ������ ����. ù° �ٿ� ���ڿ� S�� �ܾ ����� ����Ѵ�.
public class BJ17413 {
	public static void main(String[] args) 
	{
		String answer = "";
		boolean tag = false; // tag�˻�

		Stack<Character> st = new Stack<Character>();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i); // str.charAt(i)�� ����ȭ

			if(c == '<') { // �±� ���۽� ���û��� Ȯ�� �� ���ÿ� ��� ���ڸ� ���
				tag = true;
				while(!st.isEmpty()) {
					answer += st.pop(); 
				}
				answer += c;
			} else if(c == '>') {
				tag = false;
				answer += c;
			} else if(tag) {
				answer += c;
			} else {
				if(c == ' ') {
					while(!st.isEmpty()) {
						answer += st.pop();
					}
					answer += c;
				} else {
					st.push(c);
				}
			}

		}
		
		while(!st.isEmpty()) {
			answer +=  st.pop();
		}
		System.out.println(answer);
	}
}
