package parking;
import java.util.Scanner;
class User{
	String userName;
	String carNum;
	void setUserName(String name) {
		this.userName=name;
	}
	String getUserName() {
		return userName;
	}
	void setCarNum(String num) {
		this.carNum=num;
	}
	String getCarNum() {
		return carNum;
	}
}
class ParkingLot {
	User USER[][];
	ParkingLot(int row, int col) {
		USER = new User[row][col];
	}
	boolean isFull() {
		for (User[] user : USER) {
			for (User userOfUser : user) {
				if (userOfUser == null) {
					return false;
				}
			}
		}
		return true;
	}
	void parking(User user, String num) {
		for (int i = 0; i < USER.length; i++) {
			for (int j = 0; j < USER[i].length; j++) {
				if (USER[i][j] == null) {
					continue;
				}
				if (num.equals(USER[i][j].getCarNum())) {
					System.out.println("차주 " +  USER[i][j].getUserName() + ", " +  USER[i][j].getCarNum() + "번 차량 출차했습니다.");
					USER[i][j] = null;
					return;
				}
			}
		}
		if (isFull()) {
			System.out.println("만차입니다.");
			return;
		} 
		else {
			for (int i = 0; i < USER.length; i++) {
				for (int j = 0; j < USER[i].length; j++) {
					if (USER[i][j] == null) {
						USER[i][j] = user;
						System.out.print(USER[i][j].getCarNum()+"번 차량 (" +i+", "+j+")에 주차했습니다.");
						return;
					}
				}
			}
		}
	}
	void draw() {
		for (int i = 0; i < USER.length; i++) {
			for (int j = 0; j < USER[i].length; j++) {
				System.out.print("(" + i + ", " + j +") : ");
				if (USER[i][j] != null) {
					System.out.print(USER[i][j].getCarNum() + "(" +  USER[i][j].getUserName() + ")");
				}
				else {
					System.out.print("_____");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
public class Main {
	public static void main(String[] args) {
		String[] userList = {"피카츄","꼬부기","야도란","이상해씨","치코리타",
				"파이리","캐터피","딱충이","뮤","마그케인",
				"잠만보","마자용","루기아","앤테이","라이코",
				"썬더","뮤츠","펄기아","디아루가","기라티나"};
		String[] numList= {"1111","2222","3333","4444","5555",
				"6666","7777","8888","9999","1222",
				"1333","1444","1555","1666","1777",
				"1888","1999","2111","2333","2444"};
		Scanner s= new Scanner(System.in);
		System.out.println("실습과제4 12191608 박준영");
		System.out.println("포켓몬 주차장에 오신 것을 환영합니다!");
		System.out.print("주차장 크기(행과 열)를 입력하세요 : ");
		int row=s.nextInt();
		int col=s.nextInt();
		System.out.println("박준영 근무를 시작합니다.\n");
		ParkingLot park= new ParkingLot(row,col);
		while(true) {
			park.draw();
			System.out.print("차량 번호를 입력하세요 :");
			String num=s.next();
			if(num.equals("퇴근")){
				System.out.println("박준영 퇴근합니다.");
				break;
			}
			try {
				int isItNum = Integer.parseInt(num);
			}
			catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요. \n");
				continue;
			}
			User u= new User();
			boolean doParking=true;
			for(int i=0;i<numList.length;i++) {
				if(num.equals(numList[i])) {
					u.setCarNum(num);
					u.setUserName(userList[i]);
					doParking=true;
					break;
				}
				else {
					doParking=false;
				}
			}
			if(doParking) {
				park.parking(u,num);
				System.out.println();
			}
			else {
				System.out.println("등록되지 않은 차량입니다.");
			}
			System.out.println();
		}
		s.close();
	}
}
