import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CalanderCheker {

	public static void main(String[] args) {
		try {
			File file=new File("/Users/mdkha/eclipse-workspace/Practices/src/CalanderList.txt");			
			Scanner fileReader=new Scanner(file);
			
			int i=0;
			int mnth = 0;
			while(fileReader.hasNext()) {
				String date=fileReader.next();
				String[] parts=date.split("-");
				System.out.print(parts[0]+" ");
				System.out.print(parts[1]+" ");
				System.out.print(parts[2]+" ");
				
				if(parts[1].equals("Jan")) {
					mnth=31;
				}
				else if(parts[1].equals("Feb")) {
					int y=Integer.parseInt(parts[2]);
					if(y%4==0 && y%100==0 && y%400==0) {
						mnth=29;
					}else {
						mnth=28;
					}
				}
				else if(parts[1].equals("Mar")) {
					mnth=31;
				}
				else if(parts[1].equals("Apr")) {
					mnth=30;
				}
				else if(parts[1].equals("May")) {
					mnth=31;
				}
				else if(parts[1].equals("Jun")) {
					mnth=30;
				}
				else if(parts[1].equals("Jul")) {
					mnth=31;
				}
				else if(parts[1].equals("Aug")) {
					mnth=31;
				}
				else if(parts[1].equals("Sep")) {
					mnth=30;
				}
				else if(parts[1].equals("Oct")) {
					mnth=31;
				}
				else if(parts[1].equals("Nov")) {
					mnth=30;
				}
				else if(parts[1].equals("Dec")) {
					mnth=31;
				}
				
				int d=Integer.parseInt(parts[0]);
				if(d>0 && d<=mnth) {
					System.out.println(" ->Valid");
				}else {
					System.out.println(" ->Invalid");
				}
				
				
			}
			
	        fileReader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
