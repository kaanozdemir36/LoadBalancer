package loadBalance;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoadBalanceListener implements Runnable {


	private ServerSocket listenSock;
	
	public static int serverSelector = 0;

	public LoadBalanceListener(int port) {
		// Construct listening socket
		try {
			this.listenSock = new ServerSocket(port);
		} catch (IOException ex) {
			System.err.println("Error opening listening port");
			ex.printStackTrace();
			
		}
	}


	public void configure() {
		
		System.out.println("Configuration finished");
		

	}

	@Override
	public void run() {
		System.out.println("Listening for connections");

		while (!Thread.interrupted()) {
			try {
				
				Socket newSock = listenSock.accept();
				System.out.println("Connection detected");
				LoadBalanceSocket newCon = new LoadBalanceSocket(newSock);
				Thread newThread = new Thread(newCon);
				newThread.start();
			} catch (Exception e) {
				System.err.println("Server listen error");
				e.printStackTrace();

			}

		}

	}

}