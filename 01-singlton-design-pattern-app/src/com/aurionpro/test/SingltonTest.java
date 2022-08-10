package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.aurionpro.model.SingltonDemo;

public class SingltonTest {

	public static void main(String[] args) throws IOException {

		OutputStream file = new FileOutputStream("./lib/objecthashcode.ser");

		ObjectOutput out = null;
		try {
			out = new ObjectOutputStream(file);

			out.writeObject(SingltonDemo.instance);
			System.out.println(SingltonDemo.instance.hashCode());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			file.close();
			out.close();
			System.out.println("object created...!!");
		}

		SingltonDemo instance = null;

		try {
			FileInputStream file1 = new FileInputStream("./lib/objecthashcode.ser");
			ObjectInput in1 = new ObjectInputStream(file1);

			instance = (SingltonDemo) in1.readObject();
			System.out.println(instance.hashCode());

			file1.close();
			in1.close();

			System.out.println("deserialized");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		Runnable t1 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(SingltonDemo.createInstance().hashCode());
//			}
//		};
//		t1.run();
//
//		Runnable t2 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(SingltonDemo.createInstance().hashCode());
//			}
//		};
//		t2.run();
//		
//		Runnable t4 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(SingltonDemo.createInstance().hashCode());
//			}
//		};
//		t4.run();
//
//		Runnable t3 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(SingltonDemo.createInstance().hashCode());
//			}
//		};
//		t3.run();
//		
//		Runnable t5 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(SingltonDemo.createInstance().hashCode());
//			}
//		};
//		t5.run();
//
//		Runnable t6 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(SingltonDemo.createInstance().hashCode());
//			}
//		};
//		t6.run();
//		
//		Runnable t7 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(SingltonDemo.createInstance().hashCode());
//			}
//		};
//		t7.run();
//
//		Runnable t8 = ()-> System.out.println(SingltonDemo.createInstance().hashCode());
//		Runnable t9 = ()-> System.out.println(SingltonDemo.createInstance().hashCode());
//		Runnable t10 = ()-> System.out.println(SingltonDemo.createInstance().hashCode());
//		Runnable t11 = ()-> System.out.println(SingltonDemo.createInstance().hashCode());
//		Runnable t12 = ()-> System.out.println(SingltonDemo.createInstance().hashCode());
//		Runnable t13 = ()-> System.out.println(SingltonDemo.createInstance().hashCode());
//		t8.run();
//		t9.run();
//		t10.run();
//		t11.run();
//		t12.run();
//		t13.run();
//
//		System.out.println(.hashCode());
//		System.out.println(SingltonDemo.createInstance().hashCode());
	}

}
