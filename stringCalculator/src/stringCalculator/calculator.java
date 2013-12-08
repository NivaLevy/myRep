package stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculator {


	
	
	public int Add(String numbers) throws Exception
	{
	int sum=0, number=0;
	//String str="";
	if(numbers.equals(""))
		return 0;
	
		for(int i=0; i<numbers.length()-1; i++){
			if(numbers.charAt(i)==',' && numbers.charAt(i+1)=='\n')
				return 0;
			if(numbers.charAt(i)=='\n' && numbers.charAt(i+1)==',')
				return 0;
						
		}
	
		String Delimeter=",|\n";
		if(numbers.charAt(0)== '/' && numbers.charAt(1)== '/' && numbers.charAt(3)== '\n' ){
			Delimeter=numbers.charAt(2)  +"|\n";
			numbers.substring(4);//begin from charAt(4)
		}
	String newNumbers[] =numbers.split(Delimeter);
	String negStr="";
	for(int i=0; i<newNumbers.length; i++){
		//, posStr="";
		number=Integer.parseInt(newNumbers[i]);
		if(number <0){
			negStr+=number + ",";
		}
		else{
			if(number>1000)
				number=0;
			else
				sum+=number;// + ",";
		}
		
		
	}
	if(negStr != "")	{
		
		throw new Exception("negatives not allowed "+negStr);
		//return 0;
	}
	
		
	return (sum);	
	}
	
}