package com.creational.designpattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonDeserializationIssue {

	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
	LazyInstantiation lazyObj1 = LazyInstantiation.getInstance();
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/workspace/DesignPattern/src/com/creational/designpattern/singleton/output.ser")));
	oos.writeObject(lazyObj1);
	
	LazyInstantiation lazyObj2;
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/workspace/DesignPattern/src/com/creational/designpattern/singleton/output.ser")));
	lazyObj2 = (LazyInstantiation) ois.readObject();
	
	System.out.println("Are two objects same ???"+(lazyObj1==lazyObj2));
	}
}
