import java.util.*;
/* �ǻ��ڵ�
�ֽ��� ���ʵ��� �������� �ʾҴ����� ���°���!
����, �ֽ��� ������ ���ÿ� ��� ���� �ƴ϶� �ֽİ����� �ε����� ���ÿ� ��Ƽ�, prices[�������ε���]������ ���Ѵ�.
���û�� �ε����� ���� prices[i]�� ������ ���ؼ� ���� ���������� �� �ε����� ���̸�ŭ answer�� �ش��ε����� ��´�.
���� ���ų� �����Ҷ��� ���ÿ� ��� �ִ´�.
�� ������ ���� ������ ��ü���̿��� ���ÿ� ��� �ε������� ���̸� ���ؼ� �ֽð����� ������������ �Ⱓ�� answer�� �ִ´�.
*/
class Stock_Price {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // �� ���ݸ��� �������� ���� �ð��� answer�迭 ��� return
        Stack<Integer> stack = new Stack<Integer>(); // �ε��� ���� ���� ���û���
      
        for(int i=0; i<prices.length; i++) {
            while(!stack.empty()) { // ������ ����������� ��
                if(prices[stack.peek()] > prices[i]) { // ���� �������� ��
                    int preEl = stack.pop(); 
                    answer[preEl] = i-preEl; // ������ ������ �ε��� - ���� ��ܰ�(���� �ε���) ����
                } else break;
            }
            stack.push(i); // ������ ����ų�, ���� ���ų� ������ ��
        }
        
        while(!stack.empty()) { // ���� ���� ó��
            answer[stack.peek()] = (prices.length-1) - stack.pop(); // ��ü���̿��� ���ÿ� ��� �ε������� ����
        }
        return answer;
    }
}