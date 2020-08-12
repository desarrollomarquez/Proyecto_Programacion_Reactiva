package com.observer.pattern;

public class HexaObserver extends Observer{

	   public HexaObserver(Subject subject){
		  System.out.println("1");
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
	}
