package com.creational.designpattern.singleton;

public class Logger implements Cloneable{

	private static Logger LOG;
	
	private Logger(){
		
	}
	
	public static Logger getInstance(){
		if(LOG==null){
			synchronized (Logger.class) {
				if(LOG==null){
					LOG = new Logger();
				}
			}
		}
		return LOG;
	}
	
	public void log(String message){
		System.out.println("Messaage is : "+message);
	}	

	@Override
	protected Object clone(){
		return new CloneNotSupportedException();
	}
}
