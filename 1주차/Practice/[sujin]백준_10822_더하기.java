import java.util.*;
import java.io.*;

// ���ڿ� �޸��θ� �̷���� ���ڿ� S�� �־�����. �̶�, S�� ���ԵǾ��ִ� �ڿ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// S�� ù ���ڿ� ������ ���ڴ� �׻� �����̰�, �޸��� �����ؼ� �־����� �ʴ´�. �־����� ���� �׻� �ڿ����̴�. ���ڿ� S�� ���ԵǾ� �ִ� �ڿ����� ���� ����Ѵ�.
class BJ10822
{
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//
//		int sum = 0;
//
//		String[] arr = str.split(",");
//
//		for(String x : arr) {
//			sum += Integer.parseInt(x);
//		}
//		System.out.println(sum);
//	}

	public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), ",");

        int sum = 0;

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);

    }
}
