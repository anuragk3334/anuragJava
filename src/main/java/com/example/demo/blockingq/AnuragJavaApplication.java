package com.example.demo.blockingq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnuragJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnuragJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BlockingQueue<Message> q=new ArrayBlockingQueue(15);
		Producer producer=new Producer(q);
		Consumer consumer=new Consumer(q);
		new Thread(producer).start();
		new Thread(consumer).start();
		
	}

}
