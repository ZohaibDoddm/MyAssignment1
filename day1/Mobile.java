package week1.day1;

public class Mobile {
	
public void makeCall() {
	System.out.println("this is to make a call");
}

public void sendMsg() {
	System.out.println("this is to send message");
}

public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.makeCall();
	mob.sendMsg();
}
}
