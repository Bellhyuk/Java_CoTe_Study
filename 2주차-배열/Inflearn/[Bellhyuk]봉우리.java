package Section2_Array;

/*10. 봉우리
지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다.
봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
봉우리의 개수를 출력하세요.
*/
import java.util.*;

public class no_10 {
  //강사풀이
  //방향 배열을 만들어주자
  int[] dx = {-1, 0, 1, 0};
  int[] dy = {0, 1, 0, -1};

  public int solution(int n, int[][] arr) {
    int answer=0;
    for(int i=0;i<n;i++) {
      for(int j=0;j<n;j++) {
        boolean flag=true;
        for(int k=0;k<dx.length;k++) {
          int nx=i+dx[k];
          int ny=j+dy[k];
          if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
            flag=false;
            break;
          }
        }
        if(flag) answer++;
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    no_10 T = new no_10();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println(T.solution(n, arr));
  }
  
  //내 풀이
  /*public int solution(int n, int[][] arr) {
    int answer=0;//봉우리 수
    //체크 배열 형성 및 가장자리 체크
    int[][] check = new int[n+2][n+2];
    for(int i=0;i<n+2;i++) {
      check[0][i]=check[i][0]=check[n+1][i]=check[i][n+1]=1;
    }
    //가장자리는 0으로 가정 -> (1,1)부터 시작
    for(int i=1;i<n+1;i++) {
      for(int j=1;j<n+1;j++) {
        if(check[i][j]==1) continue;
        if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1]) {
          arr[i-1][j]=arr[i+1][j]=arr[i][j-1]=arr[i][j+1]=1;
          answer++;
          j++;
        }
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    no_10 T = new no_10();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n+2][n+2];
    for(int i=1; i<n+1; i++) {
      for(int j=1; j<n+1; j++) {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println(T.solution(n, arr));
  }*/
}
