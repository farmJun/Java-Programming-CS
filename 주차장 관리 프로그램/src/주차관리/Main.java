package 주차관리;
import java.util.Scanner;

class User{
	String userName="___";
	String carNum="____";
	int posX;
	int posY;
	boolean isPark =false;
	
	void setIsPark() {
		isPark=true;
	}
	void setIsNotPark() {
		isPark=false;
	}
	boolean getIsPark() {
		return isPark;
	}
	void setPosX(int x) {
		this.posX=x;
	}
	int getPosX() {
		return posX;
	}
	void setPosY(int y) {
		this.posY=y;
	}
	int getPosY() {
		return posY;
	}
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
	
	void init() {
		this.carNum="____";
		this.userName="___";
		this.posX = 0;
		this.posY =0;
		this.isPark =false;
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

		Scanner s = new Scanner(System.in);
		System.out.println("학번 이름");
		System.out.print("주차장 크기(행과 열)을 입력하세요 : ");
		
		int row,col;
		row =s.nextInt();
		col= s.nextInt();
		
		System.out.println("이름 근무를 시작합니다!\n");
		
		User[] user= new User[row*col];

		for(int i=0;i<row*col;i++) {
			user[i] = new User();
		}
		
		String num;
		int cnt=0;
		
		while(true) {
			int cnt2=0;
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print("(" + i + ", " + j + "):"+user[cnt2].getCarNum()+"("+user[cnt2].getUserName()+")" );
					user[cnt2].setPosX(i);
					user[cnt2].setPosY(j);
					cnt2++;
				}
				System.out.println();
			}
			
			System.out.print("차량 번호를 입력하세요! : ");
			
			num=s.next();
			boolean park=true;
			
			if(num.equals("퇴근")) {
				System.out.println("이름 퇴근합니다.");
				break;
			}
			
			boolean isp=true;
			
			for(int i=0;i<numList.length;i++) {
				  
				if(num.equals(numList[i])) {
					for(int j=0;j<user.length;i++) {
						if(user[j].getCarNum().equals(num)) {
							System.out.println("차주 "+ user[j].getUserName()+","+user[j].getCarNum()+"번 차량 출차했습니다.");
							user[j].init();
							user[j].setIsNotPark();
							isp=false;
							continue;
						}
					}
					
					if(isp) {
						user[cnt].setCarNum(num);
						user[cnt].setUserName(userList[i]);
						user[cnt].setIsPark();
						cnt++;
						park= true;
						break;
					}
						
					}
					
				
				else {
					park=false;
				}
				
				
			}
			  
			  if(park) {
					System.out.println(num +"번 차량 ("+user[cnt-1].getPosX()+"," +user[cnt-1].getPosY() +")에 주차했습니다." );
					System.out.println();
					continue;
			  }
			  else {
				  System.out.println("등록되지 않은 차량입니다.");
			  }
			  
			
			  System.out.println();
		}
		
		
		s.close();
	}

}
