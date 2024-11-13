//Program to demonstrate InterThread Communication - Consumer Thread Class
package tns.ifet.dayfourteen.interthreradcommunication;

public class Consumer extends Thread {
	Q obj; 

	public Consumer(Q obj) {
		this.obj = obj;
		start();
	}

	public void run() {
			while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}
}
