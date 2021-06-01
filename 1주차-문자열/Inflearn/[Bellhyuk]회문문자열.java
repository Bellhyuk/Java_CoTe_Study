package Section1_String;

/*7. 회문 문자열
저작권 관련 문제 제거
*/
import java.util.*;

public class no_7 {
  //풀이2
  //equals() 대소문자 구분, equalsIgnoreCase() 대소문자 구분X
  public String solution(String str) {
    String answer = "NO";
    String tmp = new StringBuilder(str).reverse().toString();
    if(str.equalsIgnoreCase(tmp)) answer = "YES";
    return answer;
  }
  
  //풀이1
  /*public String solution(String str) {
     String answer = "YES";
     int len = str.length();
     for(int i=0; i<len/2; i++) {
       if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
     }
     return answer;
  }*/
  
  //뒤집는 것이 아닌 중심을 기준으로 비교
  /*public String solution(String str) {
    String answer="";
    str = str.toLowerCase();
    String[] arr = str.split("");
    int len = str.length(), flag=0;
    for(int i=0;i<len/2;i++) {
      if(!arr[i].equals(arr[len-i-1])) {
        flag++;
        break;
      }
    }
    answer = flag>0 ? "NO":"YES";
    return answer;
  }*/
  
  //StrinBuilder 사용
  /*public String solution(String str) {
    String answer = "";
    str = str.toLowerCase();
    StringBuilder sb = new StringBuilder(str);
    String rstr = sb.reverse().toString();
    if(str.equals(rstr)) answer = "YES";
    else answer = "NO";
    
    return answer;
  }*/
  
  //String -> List -> String
  /*public String solution(String str) {
    String answer = "";
    str = str.toUpperCase();
    String[] arr = str.split("");//대소문자 구분X
    
    List<String> list = new ArrayList<String>();
    list = Arrays.asList(arr);
    Collections.reverse(list);
    
    String rstr = "";
    for(String s:list) rstr += s;
    
    if(str.equals(rstr)) answer = "YES";
    else answer = "NO";
    
    return answer;
  }*/
  
  public static void main(String[] args) {
    no_7 T = new no_7();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
  }
}
