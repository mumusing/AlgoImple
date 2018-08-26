package com.algo.impl.dataCompression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthEncoding 
{
     
	 public String encode(String source)
	 {
		 StringBuilder encoded=new StringBuilder();
		 for (int index = 0; index < source.length(); index++)
		 {
			  int runLength=1;
			  while(index<source.length()-1&&source.charAt(index)==source.charAt(index+1))
			  {
				  runLength++;
				  index++;
			  }
//			  if (runLength>1)
//			  {
				  encoded.append(runLength+""+source.charAt(index));			  
//		      }
//			  else
//			  {
//				  encoded.append(""+source.charAt(index));
	//		  }
		 }
		 System.out.println(encoded.toString());
		 return encoded.toString();
	 }
	 public void decode(String source)
	 {
		 StringBuilder decoded=new StringBuilder();
		 Pattern pattern= Pattern.compile("[0-9]+|[a-zA-Z]");
		 Matcher matcher=pattern.matcher(source);
		 while (matcher.find()) 
		 {
			int num=Integer.parseInt(matcher.group());
			//System.out.println(matcher.group());
		//	System.out.println(num);
			matcher.find();
			while (num--!=0)
			{
				decoded.append(matcher.group());
			}
		 }
		 System.out.println(decoded.toString());
	 }
	
}
