import java.util.*;
// �����ڵ�
/* movesȽ����ŭ �ݺ����� ���鼭 ���� ��ǥ�� moves�� ���, ���� moves�� 1�� ��� 1������ �࿡�� 0�� �ƴ� ���� ���� �� ���� �������������� board�� ���� j������ ����
    moves�� 1���� �����ϴµ� �ε����� �����ؾ������� moves-1�� ���ش�.
	board�� ���鼭 0�̸� �����Ѵ�.
    �ٱ��ϴ� �����ڷᱸ���� ����Ѵ�. ����(ũ����)���� ���� ���� ���ÿ� ��(����)�� �ֱ� ���� ���ÿ��� peek�� ���� ���ڿ��� �������� ������ �����ʰ� pop�� �Ѵ�. 
    �� ������ �Ͷ߷� ���� �����̹Ƿ� result�� 2���� ���������ְ� ���� ������ ��(moves�� ��ġ)�� �Űܾ������� break�� ���ش�.
    ���� ��(����)�� �ε������� 0�� �־��ش�.
*/
class Kakao19_CraneDollGame {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                int doll = board[j][moves[i]-1]; 

				if(doll == 0) continue;
				
				if(st.isEmpty()) {
					st.push(doll);
				} else {
					if(st.peek() != doll) {
						st.push(doll);
					} else {
						st.pop();
						answer+=2;	
					}
				}
				board[j][moves[i]-1] = 0;
				break;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		Kakao19_CraneDollGame C = new Kakao19_CraneDollGame();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};

//		int[][] board = {{0,0,0,0,0},{0,2,1,0,0},{3,3,1,4,2},{5,5,4,3,1},{1,1,2,3,5}};
//		int[] moves = {1,2,5,4,2,3};
		System.out.println(C.solution(board, moves));
	}
}
