package Section1_String;

/*8. 유효한 팰린드롬
저작권 관련 문제 제거
*/
import java.util.*;

public class no_8 {
  //풀이1, 알파벳말고 싹다 없애버리기
  //replaceAll -> 어떻게? 정규식 이용ㅎ
  public String solution(String str) {
    String answer="NO";
    str = str.toLowerCase().replaceAll("^[a~z]", "");
    String tmp = new StringBuilder(str).reverse().toString();
    if(str.equals(tmp)) return "YES";
    return answer;
  }
  
  //알파벳만 고려! index 고려를 버려야 한다!
  /*public String solution(String str) {
    String answer="YES";
    str = str.toLowerCase();
    int len = str.length();
    int s=0, e=len-1;
    while(e-s>0) {
      if(!Character.isAlphabetic(str.charAt(s))) {
        s++;
        continue;
      }
      if(!Character.isAlphabetic(str.charAt(e))) {
        e--;
        continue;
      }
      if(str.charAt(s)!=str.charAt(e)) return "NO";
      else {
        s++;
        e--;
      }
    }
    return answer;
  }*/
  
  public static void main(String[] args) {
    no_8 T = new no_8();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(T.solution(str));
  }
}
