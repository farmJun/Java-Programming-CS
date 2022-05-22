package 주차장;

import java.util.ArrayList;
import java.util.Scanner;

class User{
	String userName="";
	String carNum="";
	int posX;
	int posY;
	

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
	
}

class ParkingLot {
	ArrayList<User> list;
	
	ParkingLot(){
		list=new ArrayList<>();
	}
	
	void add(User u) {
		list.add(u);
	}
	
	boolean contains(User u) {
		return list.contains(u);
	}
	
	int size() {
		return list.size();
	}
	
	User uesrGet(User u){
		int index=list.indexOf(u);
		return list.get(index);
	}
	
	void remove(User u) {
		list.remove(u);
	}
}


class ParkControl{
	static ParkingLot park = new ParkingLot();
	static int parkingSize;
	static int cntCol =0;
	static int cntRow =0;
	static int col,row;
	
	
	static void insert(String name, String num) {
		if(park.size()<parkingSize) {
			
			User u = new User();
			u.setUserName(name);
			u.setCarNum(num);
			u.setPosX(cntCol);
			u.setPosY(cntRow);
			park.list.add(u);
			
			ParkControl.park.uesrGet(u);

			System.out.println(num + "번 차량" + "("+cntRow+", "+cntCol +")에 주차했습니다.\n");
			calc();
		}
		else {
			System.out.println("만차입니다. ");
		}
	}
	
	static void calc() {
		if(cntCol==col-1) {
			cntRow++;
			cntCol=0;
			
		}
		else {
			cntCol++;
		}
	}
	
	static void firstDoParking() {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("(" + i + ", " + j + ") : ____" );
			}
			System.out.println();
		}
	}

	static void doParking() {
		
		int cnt=0;
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				
				
				if(park.list.get(cnt).posX==j && park.list.get(cnt).posY==i ) {
					
					System.out.print("(" + i + ", " + j + ") : "+park.list.get(cnt).getCarNum()+"("+park.list.get(cnt).getUserName()+")" );
				
				}
				else {
					System.out.print("(" + i + ", " + j + ") : _________________" );
				}
				
				
				
				
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
		
		Scanner s = new Scanner(System.in);
		System.out.println("12191608 박준영");
		System.out.println("포켓몬 주차장에 오신 것을 환영합니다!");
		System.out.print("주차장 크기(행과 열)을 입력하세요 : ");

		int row,col;
		row =s.nextInt();
		col= s.nextInt();
		
		System.out.println("박준영 근무를 시작합니다!\n");
		
		ParkControl.parkingSize=row*col;
		ParkControl.col=col;
		ParkControl.row=row;
		
		User[] user= new User[row*col];
		
		for(int i=0;i<row*col;i++) {
			user[i]=new User();
		}
		
		boolean go = true;
		String num;
		
		ParkControl.firstDoParking();
		
		while(go) {
			
			System.out.print("차량 번호를 입력하세요! : ");
			num=s.next();
			for(int i=0;i<numList.length;i++) {
				if(num.equals(numList[i])) {
					ParkControl.insert(userList[i],num);
				}
				
			}
			ParkControl.doParking();
		}
	
		
	
		
		
		s.close();
		
	}

}
