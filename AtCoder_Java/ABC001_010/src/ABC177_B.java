import java.util.Scanner;

public class ABC177_B {
	public void Act() {
		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		String T = scan.next();

		int count = 0;
		int maxCount = 0;

	  if(S.length() == T.length())
	  {
		  for(int i = 0; i < S.length(); i++) {
				if((S.charAt(i) == T.charAt(i)))
				{
					maxCount++;
				}
			}
	  }
	  else
	  {
      for(int x = 0; x < S.length() - T.length(); x++) {
		for(int i = 0; i < T.length(); i++) {
			if((S.charAt(i + x) == T.charAt(i)))
			{
				count++;
			}
		}
		if(count > maxCount) {
			maxCount = count;
		}
		count = 0;
      	}
      }
		System.out.println(T.length() - maxCount);
		scan.close();
	}
}
