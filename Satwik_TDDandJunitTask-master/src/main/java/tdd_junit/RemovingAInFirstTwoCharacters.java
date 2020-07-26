package tdd_junit;

public class RemovingAInFirstTwoCharacters{

	public String remove(String input) {
		String result="";
		    if((input.length()==1 && input.charAt(0)=='A') || input.length()==0)
		    result="";
		    else if(input.length()>1)
			{
				 if(input.charAt(0)=='A' && input.charAt(1)=='A')
				   result=input.substring(2,input.length());
				 else if(input.charAt(0)=='A') 
				   result=input.substring(1,input.length());
				 else if(input.charAt(1)=='A')
					 result= input.substring(0,1)+input.substring(2,input.length()); 
				 else result=input;
			}
		    else
		    result=input;
		return result;
	}

}