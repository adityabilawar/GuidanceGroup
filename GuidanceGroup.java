	import java.util.Arrays;
	import java.lang.*;
	
public class GuidanceGroup {
	// Array group will store SatStudent objects
	//private SatStudent[] group;
//	public static String[] n1;
	//public static int[] m1;
	//public static int[] v1;
	//public static int[] w1;
	//public static double[] g1;
	//public static int[] total;
	
	/**
	* Default Constructor for objects of class GuidanceGroup
	*/
	public GuidanceGroup() {
	group = new SatStudent[12];
	group[0] = (new SatStudent("Ye", 640, 695, 686));
	group[1] = (new SatStudent("Bradley", 778, 768, 780));
	group[2] = (new SatStudent("Chen", 687, 614, 705));
	group[3] = (new SatStudent("Davis", 620, 534, 556));
	group[4] = (new SatStudent("Aarons", 550, 565, 517));
	group[5] = (new SatStudent("Gupta", 687, 720, 640));
	group[6] = (new SatStudent("Park", 722, 721, 745));
	group[7] = (new SatStudent("Kohl", 595, 605, 615));
	group[8] = (new SatStudent("Mehta", 525, 637, 521));
	group[9] = (new SatStudent("Bahl", 611, 607, 610));
	group[10] = (new SatStudent("Smith", 670, 703, 610));
	group[11] = (new SatStudent("Issacs", 670, 690, 710));
	
	
	total = new int[group.length];
	for(int i = 0; i != group.length;i++){total[i]= group[i].getTotal();}

	n1 = new String[group.length];
	for(int i = 0; i != group.length;i++){n1[i]= group[i].getName();}
	
	m1 = new int[group.length];
	for(int i = 0; i != group.length;i++){m1[i]= group[i].getMath();}
	
	v1 = new int[group.length];
	for(int i = 0; i != group.length;i++){v1[i]= group[i].getVerbal();}
	
	w1 = new int[group.length];
	for(int i = 0; i != group.length;i++){w1[i]= group[i].getWriting();}
	
	g1 = new double[group.length];
	for(int i = 0; i != group.length;i++){g1[i]= group[i].getGrade();}
	
	}
	// Constructor with a SatStudent[] array as a parameter
	public GuidanceGroup(SatStudent[] myGroup) {
	group = myGroup;
	
	total = new int[group.length];
	for(int i = 0; i != group.length;i++){total[i]= group[i].getTotal();}

	n1 = new String[group.length];
	for(int i = 0; i != group.length;i++){n1[i]= group[i].getName();}
	
	m1 = new int[group.length];
	for(int i = 0; i != group.length;i++){m1[i]= group[i].getMath();}
	
	v1 = new int[group.length];
	for(int i = 0; i != group.length;i++){v1[i]= group[i].getVerbal();}
	
	w1 = new int[group.length];
	for(int i = 0; i != group.length;i++){w1[i]= group[i].getWriting();}
	
	g1 = new double[group.length];
	for(int i = 0; i != group.length;i++){g1[i]= group[i].getGrade();}
	
	}
	
	// This method displays a chart with 2 columns: Name and Total SAT score
	public void display() {
		System.out.println("Name	Total SAT Score");
		 for (int i = 0; i < total.length; i++) {
				
			           System.out.println( n1[i]+ "   " + total[i] );
			           
			          
			       }
		
	}
	// This method returns the name of the student with the lowest total SAT
	public String getMin() {
		int a = 0;
		 int minValue = total[0]; 
		    for(int i=0;i<total.length;i++){ 
		      if(total[i] < minValue){ 
		        minValue = total[i]; 
		        a = i;
		      } 
		  
		
	
	}
  
		    
		    String name1 = n1[a];
		String out = "Name of lowest scorer: " + name1 + "	Score: " + minValue;
		return out;
	}
	// This method returns the name of the student with the highest total SAT
	// score
	public String getMax() {
		int a = 0;
		 int maxValue = total[0]; 
		    for(int i=0;i<total.length;i++){ 
		      if(total[i] > maxValue){ 
		        maxValue = total[i]; 
		        a = i;
		      } 
		  
		
	
	}
 
		    
		    String name1 = n1[a];
		String out = "Name of Highest scorer: " + name1 + "	Score: " + maxValue;
		return out;
	}
	// This method returns the average of all SAT scores
	public double average() {

		 int sum = 0;
		    double average;

		    for(int i=0; i < total.length; i++){
		        sum = sum + total[i];
		    }
		    average = (double)sum/total.length;
		    return average;    
	
	}
	// This method displays a list of names of students who scored below 1700
	public void below1700List() {
		int cou = 0;
		int cou1 = 0;
		int a = 0;
		for(int i=1;i<total.length;i++){ 
		      if(total[i] < 1700){ 
		       cou++;
		      } else {cou1++;}
		}
		 String[] below = new String[cou];
		 int count = 0;
		    for(int i=0;i<total.length;i++){ 
		      if(total[i] < 1700){ 
		        below[count++] = n1[i]; 
		        a = i;
		      } 
		  
	
	}

		  System.out.println("List of names of students who scored below 1700 : "); 
			 for (String element: below) {
				
		            System.out.println(element+ "\t");
		        }
	
		
	}
	// This method displays a list of names of students who scored above2000
	public void above2000List() {
		int cou = 0;
		
		
		for(int i=0;i<total.length;i++){ 
		      if(total[i] > 2000){ 
		       cou++;
		      } 
		}
		 String[] above = new String[cou];
		 int count = 0;
		    for(int i=0;i<total.length;i++){ 
		      if(total[i] > 2000){ 
		    	  above[count++] = n1[i]; 
		      
		      } 
		  
	
	}

		  System.out.println("List of names of students who scored above 2000 : "); 
			 for (String element: above) {
				
		            System.out.println(element+ "\t");
		        }
	
	}
	// this method will return the total score of an inputted name.
	// return -1 if student is not found
	public int getScore(String lookfor)
	{
		
		for(int i=0;i<n1.length;i++){ 
		      if(n1[i] == lookfor){ 
		       return total[i];
		    		
		      } else { continue;}
		}
		

	
		
	return -1;
	}
	// returns an array of SatStudents with total scores > 1900
	public SatStudent[] scholarship() {
		int cou = 0;
	
		int p = 1900;
		for(int i=0;i<total.length;i++){ 
		      if(total[i] > p){ 
		       cou++;
		      } 
		}
		SatStudent[] above1900 = new SatStudent[cou];
        int count = 0;
           for(int i=0;i<total.length;i++){ 
             if(total[i] > p){ 
                 above1900[count++] = group[i]; 
            
             } 
		  
	
	}

	return above1900;
	}
	// returns a new GuidanceGroup with the SatStudents of this class combined
	// with the SatStudents of other class
	 public GuidanceGroup combineGroups(GuidanceGroup other) {
		    SatStudent[] c = new SatStudent[ group.length + other.group.length];

		         for(int i = 0; i<group.length + other.group.length; i++) {
		             if(i< group.length) {
		                c[i] = group[i];
		             }
		             else {
		                 c[i] = other.group[i - group.length];
		             }

		         }

		        return new GuidanceGroup(c);

		    }
	
	//Sorts the array of the GuidanceGroup by total score (descending)
	public void sortByTotalScore() {
		  int temp = 0;    
		   
		   for (int i = 0; i < total.length; i++) {     
	            for (int j = i+1; j < total.length; j++) {     
	               if(total[i] < total[j]) {    
	                   temp = total[i];    
	                   total[i] = total[j];    
	                   total[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	            
	      
	        System.out.println("\nElements of array sorted in descending order: ");    
	        for (int i = 0; i < total.length; i++) {     
	            System.out.print(total[i] + " ");   } 
	
		
		
	}
	//Sorts the array of the GuidanceGroup by Name (ascending (alphabetically))
	public void sortByName() {
		int count = total.length;
		String temp;
		  for (int i = 0; i < count; i++) 
	        {
	            for (int j = i + 1; j < count; j++) 
	            { 
	                if (n1[i].compareTo(n1[j]) > 0) 
	                {
	                    temp = n1[i];
	                    n1[i] = n1[j];
	                    n1[j] = temp;
	                }
	            }
	        }
	         
	       
	        System.out.print("\nStrings in alphabetical order: " + Arrays.toString(n1));
	    }
	
	
	// this method will return the average of all of the students in the
	// Scholarship category
	public double getScholarShipAverage() {
		
		int cou = 0;
		
		int p = 1900;
		for(int i=0;i<total.length;i++){ 
		      if(total[i] > p){ 
		       cou++;
		      } 
		}
		int[] above1900 = new int[cou];
        int count = 0;
           for(int i=0;i<total.length;i++){ 
             if(total[i] > p){ 
                 above1900[count++] = total[i]; 
            
             } 
		
           }
		
		
		
		
		
		 int sum = 0;
		    double average;

		    for(int i=0; i < above1900.length; i++){
		        sum = sum + above1900[i];
		    }
		    average = (double)sum/above1900.length;
		    return average;    
		
           }
}
	
	
