package com.example.demo.blockingq;

import java.util.concurrent.BlockingQueue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consumer implements Runnable{

	private BlockingQueue<Message> queue;
	
	@Override
	public void run() {
		
		//String messege=queue.peek().getMessage();
		
		while(true) {
			try {
				String mess=queue.take().getMessage();
				System.out.println(mess);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
