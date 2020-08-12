package com.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	  private List<Observer> observers = new ArrayList<Observer>();
	   private int state;

	   public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
		  System.out.println("2");
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      /*for (Observer observer : observers) {
	         observer.update();
	      }*/
		  observers.stream().forEach(p -> {
			  System.out.print(p);
			   p.update(); 
		  });
	   } 

}
