package facade;

import java.util.Scanner;

public class Main {
	Scanner scan =  new Scanner(System.in);
	PCFacade pc = new PCFacade();
	String status = "off";
	
	public void cls(){
		for(int i = 0; i < 10; i++) {
			System.out.println("");
		}
	}
	
	public void menu1() {
		String password;
		cls();
		if(status == "off") {
			status = pc.turnOn();
			System.out.println("Turning on the fan");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Turning on the Monitor");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Turning on the CPU");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Pc Is Already on");
		}
	}
	
	public void menu2() {
		cls();
		if(status == "on") {
			status = pc.turnOff();
			System.out.println("Turning off the fan");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Turning off the Monitor");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Turning off the CPU");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("pc already off");
		}
	}
	
	public Main() {
		int menu;
		do {
			cls();
			System.out.println("CPU is "+ status);
			System.out.println("Monitor is "+ status);
			System.out.println("Fan is "+ status);
			System.out.println("1. Start playing game");
			System.out.println("2. Finish playing game");
			System.out.println("input >>");
			menu = scan.nextInt();
			scan.nextLine();

			switch (menu) {
			case 1:
				menu1();
				break;
			case 2:
				menu2();
				break;
			}

		}while(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
