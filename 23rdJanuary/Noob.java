import java.io.*;
import java.util.*;
import java.io.IOException;

public class Noob{
	public static void main(String[] argv){
		System.out.println("I ama print this ");
		int userChar=0;
		try{
		userChar = System.in.read();
		}catch(IOException e){
		System.out.println("Input Output Exception");
		e.printStackTrace();
		}
		System.out.println("You entered : " + userChar);
	}
}
