package cse360assign2;

import java.util.Arrays;

/**
 * @author      Walter Ayers <wsayers1@asu.edu>
 * Class ID 433 
 * ASU ID 1214769725	
 */

public class SimpleList {
	
	   private int[] list;		// create an empty array list 
	   
	   private int count;			//create a private int count to initialize 
	   
	  
	   public SimpleList() {
		    
	       this.list = new int[10];	// create array of 10 integers all equaling 0 
	       
	       
	       this.count = 0;
	       
	   }
	  
	   public void add(int component) {
		   

	       
	       if(list.length  < 0 ){		// uses given constraints to initialize if conditional
	    	   
	           for(int a = list.length -1; a > 0; a--){		//takes the list length -1 to loop through the entire array
	        	   
	               if( list.length  == 10 ){		//if the list has 10 components subtract the last element from the list 
	            	   								// and continue shifting left 
	            	   
	                   list[a] = list[ a - 1 ];		
	                   
	               }
	               
	               else {
	            	   
	                   list[ a + 1 ] = list[a];	
	                   
	               }
	               
	           }
	           
	       }
	       
	       list[0]= component;
	       
	       if(this.count<10)
	    	   
	           this.count++;
	       
	       if(count==list.length) {
	    	   list = Arrays.copyOf(list,list.length+list.length*1/2);
	    	   count++;
	    	   
	       }
	   }
	
	  
	   public void remove(int  component){
	
	       int removeItem = -1;
	       
	       int emptyLimit= 0;
	       
	       for(int a = 0 ; a < list.length; a++){   //iterate through loop 
	    	   
	           if(list[a] == component){	//if the component is found it is removed and the list is shifted 
	        	   
	        	   removeItem = a;
	               
	               this.count--;
	               
	               if(list[a]==0) {
	            	   emptyLimit++;
		        	   
	            	   if(emptyLimit>(list.length*1/4) ) {
	    	        	   list = Arrays.copyOf(list,list.length-1);
	    		    	   count--;
	    	        	  
	    	           }
	    	         
		           }
	            
		           
	               
	           }
	          
	       }
	   
	       if(removeItem!=-1){		//This case is if the component is not found 
	    	   
	           for(int a = removeItem; a <   list.length-1; a++){		// iterate through loop
	        	   
	        	   
	               list[a]=list[a + 1];		
	               
	           }
	           
	           list[  list.length - 1 ] = 0;	
	           
	        
	       }
	      
	   }
	 
	   public int search(int component){
		   


	int placer = -1;
	
	       for(int a = 0; a <  list.length; a++){		//iterate through list 
	    	   
	           if(list[a] == component){			//if component is in list 
	        	   
	        	   placer = a;			// set to -1 
	           }
	       }
	       return placer;
	   }
	   
	   public int count(){		
		   
		   return this.count;		//counts list contents 
	   }
	  
	   public String toString(){
		   
	       		String stringers= "";
	       
	       		try {
	    	   
	       			for(int a = 0; a < this.list.length ; a++){ //iterate through list 
	       				
	       				stringers += list[a] + " ";		// convert list to string using stringers String 
	       				
	          	}
	     	 }
	       		
	       		catch (Exception e) {
	       			
	       			
	           // TODO: handle exception
	       }
	       		
	       return stringers.trim();
	       
	   }
	   public void append(int component) {
		   list[list.length-1]=component;
			
		   
		   
	   }
	   public int first() {
		   if(list[0]==0) {
			   return -1;
		   }
		   return list[0];
		   
	   }
	   public int last() {
		   if(list.length==0) {
			   return -1;
		   }
		   return list[list.length-1];
	   }
	   public int size() {
		   return list.length;
	   }
}
	  
	