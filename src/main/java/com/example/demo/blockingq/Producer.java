package com.example.demo.blockingq;

import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producer implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	@Override
	public void run() {
		IntStream.range(0, 5).forEach(i->{
			try {
				Thread.sleep(200);
				queue.put(new Message("Messege sequence number is" + i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

}
