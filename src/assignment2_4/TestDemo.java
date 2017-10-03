package assignment2_4;//package name

public class TestDemo {//TestDemo class
	
	public static void main(String args[]){//main method

		
		int val=Integer.parseInt(args[0]);//integer varaible to read the input value from arguments
		String ch=getCharForNumber(val);//calling method to return ascii value of the number passed
		
		if(val==0){//if the input value is 0
			//print statement with ascii character of the integer
			System.out.println("You have Entered Zero");
			
		}
		else if(val>0){//if input value is greater than zero
			//print statement with ascii character of the integer
			System.out.println("You have Entered Positive Value "+val);
		}
		else if(val<0){
			//print statement with ascii character of the integer
			System.out.println("You have Entered Negative Value "+val);
		}
		System.out.println("its Ascii character is "+ch);
	}
	
	//function that returns ascii character for the input integer
	public static String getCharForNumber(int charCode) {
			//Handling printable ascii characters
			if(charCode>=33 && charCode <=126){
				return Character.toString ((char) charCode);
			}
			//send null for non printable ascii characters
			else{
				return null;
			}
		
	
	
		
		
		  
		 
	}

}
