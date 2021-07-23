package com.app;

public class LifeCycle 
{
	 private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("\nYour Message : " + message);
	   }
	   public void init()
	   {
	      System.out.println("\nBean in init stage ");
	   }
	   public void destroy() {
	      System.out.println("\nBean in destroy stage ");
	   }
}
