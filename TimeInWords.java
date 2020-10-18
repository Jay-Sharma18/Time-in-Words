package JavaAlgorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class TimeInWords {
	


	    // Complete the timeInWords function below.
	    static String timeInWords(int h, int m) {
	        StringBuilder timeString=new StringBuilder("");
	        //if minutes is 00 return hour to words value and append "o'clock"
	        if(m==00)
	        {
	            timeString.append(hourToString(h)).append(" "+"o'"+ " clock");
	        }
	        //if minutes<=30,return hour to word value, followed by minute to word value
	        else if(m<=30)
	        {   
	        	//if minutes is 15 or 30, append minute to word value with past
	            if(m==15 || m==30)
	            {
	            timeString.append(minuteToString(m)).append(" past ").append(hourToString(h));
	            }
	          //if minute is 1, return minute to word value followed by "minute past"
	            else if(m==1)
	            {
	              timeString.append(minuteToString(m)).append(" minute past ").append(hourToString(h));  
	            }
	            //else, return minute to word value followed by "minutes past"
	            else
	            {
	                 timeString.append(minuteToString(m)).append(" minutes past ").append(hourToString(h));
	            }
	        }
	      //if minutes>30, subtract minutes from 60 and return their word value followed by word value of the following hour
	        else if(m>30)
	        {   
	            m=60-m;
	            if(h==12)h=0;
	            if(m==15)
	            {
	                timeString.append(minuteToString(m)).append(" to ").append(hourToString(h+1));
	            }
	            else
	            {
	               timeString.append(minuteToString(m)).append(" minutes to ").append(hourToString(h+1)); 
	            }
	        }
	        return timeString.toString();
	    
	    }
	  //funtion to convert hour to words
	    static String hourToString(int hour)
	    {   
	        String hourString="";
	        switch(hour)
	        {
	            case 1: hourString="one";
	            break;
	            case 2: hourString="two";
	            break;
	            case 3: hourString="three";
	            break;
	            case 4: hourString="four";
	            break;
	            case 5: hourString="five";
	            break;
	            case 6: hourString="six";
	            break;
	            case 7: hourString="seven";
	            break;
	            case 8: hourString="eight";
	            break;
	            case 9: hourString="nine";
	            break;
	            case 10: hourString="ten";
	            break;
	            case 11: hourString="eleven";
	            break;
	            case 12: hourString="twelve";
	            break;
	            default:
	        }
	        return hourString;
	    }
	  //function to convert minute integer value to words. values from 0-30 only are converted as 31-60 are used similar to 0-30 but for the next hour. For ex:6:20 is 20 minutes past 6,whereas 6:50 is 10 minutes(60-50=10) to 7
	    static String minuteToString(int minute)
	    {   
	        String minuteString="";
	        switch(minute)
	        {
	            case 00:
	            break;
	            case 01: minuteString="one";
	            break;
	            case 02: minuteString="two";
	            break;
	            case 03: minuteString="three";
	            break;
	            case 04: minuteString="four";
	            break;
	            case 05: minuteString="five";
	            break;
	            case 06: minuteString="six";
	            break;
	            case 07: minuteString="seven";
	            break;
	            case 8: minuteString="eight";
	            break;
	            case 9: minuteString="nine";
	            break;
	            case 10: minuteString="ten";
	            break;
	            case 11: minuteString="eleven";
	            break;
	            case 12: minuteString="twelve";
	            break;
	            case 13: minuteString="thirteen";
	            break;
	            case 14: minuteString="fourteen";
	            break;
	            case 15: minuteString="quarter";
	            break;
	            case 16: minuteString="sixteen";
	            break;
	            case 17: minuteString="seventeen";
	            break;
	            case 18: minuteString="eighteen";
	            break;
	            case 19: minuteString="nineteen";
	            break;
	            case 20: minuteString="twenty";
	            break;
	            case 21: minuteString="twenty one";
	            break;
	            case 22: minuteString="twenty two";
	            break;
	            case 23: minuteString="twenty three";
	            break;
	            case 24: minuteString="twenty four";
	            break;
	            case 25: minuteString="twenty five";
	            break;
	            case 26: minuteString="twenty six";
	            break;
	            case 27: minuteString="twenty seven";
	            break;
	            case 28: minuteString="twenty eight";
	            break;
	            case 29: minuteString="twenty nine";
	            break;
	            case 30: minuteString="half";
	            break;
	        }
	        return minuteString;
	    }


	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium,Drivers and Cucumber\\test.txt"));

	        int h = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int m = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String result = timeInWords(h, m);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}



