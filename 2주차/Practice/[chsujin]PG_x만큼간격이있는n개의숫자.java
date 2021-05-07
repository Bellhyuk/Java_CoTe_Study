import java.util.*;
// ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
// x�� -10000000 �̻�, 10000000 ������ �����Դϴ�. n�� 1000 ������ �ڿ����Դϴ�.
/* ����¿�
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]
*/

// 1. x��n�� ������ ���� int���� ������ ������� long���� ����.
// 2. n�� ������ŭ ����ؾ�������, n��ŭ ���鼭 x*i�� �Ѵ�. x+x = x*2 / x+x+x = x*3�� ���� ����. 
class PG_XtoN {
     public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
			       
        for(long i=1; i<=n; i++) {
            answer.add(x*i);  
			
        }
        return answer;
    }
}
