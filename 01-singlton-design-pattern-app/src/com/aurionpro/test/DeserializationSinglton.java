package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import com.aurionpro.model.SingltonDemo;

public class DeserializationSinglton {
	public static void main(String[] args) {
		SingltonDemo ins1 = SingltonDemo.instance;
		SingltonDemo instance = null;

		try {
			FileInputStream file = new FileInputStream("./lib/objecthashcode.ser");
			ObjectInput in = new ObjectInputStream(file);

			//SingltonDemo readObject = (SingltonDemo) in.readObject();
			instance = (SingltonDemo) in.readObject();
			System.out.println(ins1.hashCode());
			System.out.println(instance.hashCode());

			file.close();
			in.close();

			System.out.println("deserialized");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
