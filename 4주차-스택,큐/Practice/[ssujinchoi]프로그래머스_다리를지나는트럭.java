import java.util.*;

class Bridge_Truck {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int weightsum = 0;
        
        Queue<Integer> q = new LinkedList<>(); // ť = �ٸ�
        
        for(int i=0; i<truck_weights.length; i++) { // ���Ʈ������ŭ �ݺ�
        	while(true) {
        		if(q.isEmpty()) { // 1. ť(�ٸ�)�� ��������� 
        			q.add(truck_weights[i]); // ������ Ʈ���� �ִ´�.
             	   	weightsum += truck_weights[i]; // Ʈ�������տ� ó������ Ʈ�����Ը� �־���.
             	   	time++; 
             	   	break;
                } else if(q.size() == bridge_length){ // 3. ť(�ٸ�)�� ��á�� ��
					weightsum -= q.poll(); // Ʈ�������տ��� �ٸ��� ����Ʈ���� ���Ը� ����.
                } else { // 2. ť(�ٸ�)�� ���� ���
                	if(weightsum + truck_weights[i] > weight) { // 2-1. ���繫���� + ����Ʈ������ > �ߵ�¹���
                		q.add(0); // (0kg) ���԰����� Ʈ���� �־���
                		time++; 
                	} else { // 2-2. ���繫���� + ����Ʈ������ <= �ߵ�¹���
            			q.add(truck_weights[i]); // ����Ʈ���� ť(�ٸ�)�� �־���.
                 	   	weightsum += truck_weights[i]; // ���繫�Կ� ������
                 	   	time++; 
                 	   	break;
                	}
                }
        	}
        }
        return time + bridge_length; // �������� ���� Ʈ���� �ٸ��Ǳ��̸�ŭ �����µ� �ð��� �ɸ���
    }
	public static void main(String[] args) {
		Bridge_Truck C = new Bridge_Truck();
		int bridge_length = 2;
		int weight = 10	;
		int[] truck_weights = {7,4,5,6};
		System.out.println(C.solution(bridge_length, weight, truck_weights));
	}
}
