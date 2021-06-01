import java.util.*;
/*
array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

����� ��
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
*/
/*
1. divisor�� ������ �� ��� return���� �𸣹Ƿ� arraylist���
2. divisor�� ����� ���ϸ� ������ for���ȿ��� divisor�� �������������� Ȯ���ϸ�ȴ�.
3. answer�� �⺻���� -1�� �ʱ�ȭ��Ű��, divisor�� �������� ���� ������ list�� ��� ���� �����Ƿ� list.size()�� 0�̸� �ٷ� return���ش�.
*/
class PG_DivisorNumArr {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] answer = {-1};
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) {
			return answer;
		} else {
			answer = new int[list.size()];
			Collections.sort(list);
			for(int i=0; i<answer.length; i++) {
				answer[i] = list.get(i);
			}
    
		}
        return answer;
    }
}