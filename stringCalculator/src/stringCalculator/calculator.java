package stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculator {


	
	
	public int Add(String numbers){
	int sum=0, number=0;
	String str="";
		/*for(int i=0; i<numbers.length()-1; i++){
			if(numbers.charAt(i)==',' && numbers.charAt(i+1)=='\n')
				return 0;
			if(numbers.charAt(i)=='\n' && numbers.charAt(i+1)==',')
				return 0;
		}*/
	
		for(int i=0; i<numbers.length(); i++){
			if(numbers.charAt(i)!=',' || numbers.charAt(i)!='\n'){
				str+=numbers.charAt(i);
				number=Integer.parseInt(str);
				sum+=number;
		}
			else{
				number=0;
				str="";
			}
			
	}
		
	return sum;	
	}

}
