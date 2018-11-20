package com.wxuan;

public class Student {
    	  String name;
    	  int english;
    	  int math;
    	  
    	  public Student(){
    		  
    	  }
    	public Student(String name, int english, int math){
    		this.name = name;
    		this.english = english;
    		this.math = math;
    	}
    	
    	public void print(){
    		int average = getAverage();
    	  System.out.print(name + "\t" + english + "\t" + math + "\t" +
    	          getAverage() + "\t");
    	  
    	  if(getAverage() < 60){
    		  System.out.println("FAILED");
    	  }else{
    		  System.out.println("PASS");
    		  }
    	  char grading = 'F';
    	  if (average >= 90 && average <= 100){
    		  grading = 'A'; 
    	  }else if(average >= 80 && average <= 89){
    		  grading = 'B';
    	  }else if(average >= 70 && average  <= 79){
    		  grading = 'C';
    	  }else if(average >= 60 && average <= 69){
    		  grading = 'D';
    		  
    	  }
      }
    	public int getAverage(){
			  return (english+math)/2;
}
    	public int highest(){
    		if(english < math){
    			return math;
    		}else{
    			return english;			
    			}
    		}
    		
    	}
