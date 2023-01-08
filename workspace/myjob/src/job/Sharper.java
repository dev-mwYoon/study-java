package job;

import java.util.Random;
import java.util.Scanner;

class job{
	
//	- Å¸Â¥ ( ³ë¸§²Û < Á¤¸¶´ã < ¾Æ±Í < Â¦±Í < °í´Ï < Æò°æÀå)
//	- È®·ü (¼¼·ú(30%) < Àå»ç(30%) < ¾Ë¸®(20%) < ±¤¶¯(20%))
//	- ½ÂÁø, Æ¼¾î (³ë¸§²Û(40) < Á¤¸¶´ã(40) < ¾Æ±Í(40) < Â¦±Í(40) < °í´Ï(40) < Æò°æÀå)
//		¼¼·ú 40 = Àå»ç20 = ¾Ë¸®10 = ±¤¶¯5
//		¼¼·ú 8 = Àå»ç4 = ¾Ë¸®2 = ±¤¶¯1
//		¼¼·ú 1 = Àå»ç2 = ¾Ë¸®4 = ±¤¶¯8
	
	
	
	String job; // 
	int grade; // 1 > 2 > 3 > 4 > 5
	int income; // 100 / 200 / 300 / 400 / 500
	int upCount; // 5¹ø ´çÃ·¸¶´Ù ´ÙÀ½·¹º§ °¡´É
	
	{
//		Á÷¾÷ ÃÊ±â ÀÚ±Ý
		income = 100;
		upCount++;
	}
	public job(String job, int grade, int income) {
		this.job = job;  
		this.grade = grade; 
		this.income = income; 
	}
	
//	½ÃµµÇÒ ¶§¸¶´Ù 10¾¿ Â÷°¨
//	¼º°ø ½Ã 100 È¹µæ
	int rating(int play) {
		Random random = new Random();
		int result = 0;
		int[] rating = new int[10];
		for (int i = 0; i < 2; i++) {
			rating[i] = 1;
		}
		for (int i = 0; i < play; i++) {
			if (rating[random.nextInt(10)] == 1) {
				result ++;
			}
		}
		return result;
	}
	
	
}

public class Sharper {
	public static void main(String[] args) {
		
//		¸Þ´º
//		1. Á÷¾÷ ¼±ÅÃ "Æò°æÀå" "¾Æ±Í" "Â¦±Í" "°í´Ï" "Á¤¸¶´ã"
//		2. ´Ü°è ¼±ÅÃ 1 2 3 4 5
//		3. »Ì±â 10 20 30 40 50 ¾¿ Â÷°¨ È¹µæ
//		4. Á¾·á
		String[] menuMessage = {"¸Þ´º¸¦ °ñ¶óÁÖ¼¼¿ä.", "1. Á÷¾÷ ¼±ÅÃ", "2. ´Ü°è ¼±ÅÃ", "3. »Ì±â", "4. Á¾·á"};
		String[] jobMessage = {"1. Æò°æÀå", "2. ¾Æ±Í", "3. Â¦±Í", "4. °í´Ï", "5. Á¤¸¶´ã"};
		int[] levelMessage = {1, 2, 3, 4, 5};
		String ratingMessage = "";
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for (int i = 0; i < menuMessage.length; i++) {
				System.out.println(menuMessage[i]);
			}
			choice = sc.nextInt();
			if (choice == 1) {
				for (int i = 0; i < jobMessage.length; i++) {
					System.out.println(jobMessage[i]);
				}
			} 
			
		}
		
		
		
	}
}
