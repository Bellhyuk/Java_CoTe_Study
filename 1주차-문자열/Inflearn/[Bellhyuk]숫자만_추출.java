package Section1_String;

/*9. 숫자만 추출
저작권 관련 문제 제거
*/
import java.util.*;

public class no_9 {
  //풀이2
  //isDigit && Integer.parseInt
  public int solution(String str) {
    String answer="";
    for(char c:str.toCharArray()) {
      if(Character.isDigit(c)) answer+=c;
    }
    return Integer.parseInt(answer);
  }
  
  //풀이1
  //아스키코드 값, 먼저 나오는 값에 10을 곱해줌으로써 자리수 변경 + 만나는 값 1의 자리로 더하기
  //0 - 48, 9 - 57
  /*public int solution(String str) {
    int answer=0;
    for(char c:str.toCharArray()) {
      if(c>=48 && c<=57) answer=answer*10+(c-48);
    }
    return answer;
  }*/
  //getNumericValue() 이용, 0~9면 해당 정수로 변환 아니면 -1
  //기본적으로 getNumericValue() 함수는 Unicode에 해당하는 값을 정수형으로 변환
  /*public String solution(String str) {
    String answer ="";
    StringBuilder sb = new StringBuilder();
    int len = str.length(), flag=0;
    for(int i=0; i<len; i++) {
      int num = Character.getNumericValue(str.charAt(i));
      if(num<0 || num>9) continue;
      else if(flag==0 && num==0) continue;
      else {
        sb.append(num);
        flag++;
      }
    }
    answer = sb.toString();
    return answer;
  }*/
  
  public static void main(String[] args) {
    no_9 T = new no_9();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(T.solution(str));
  }
}
