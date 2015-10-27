package edu.samoilenko.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.samoilenko.model.Model;

public class MyParser {
	private Model model;
	private BufferedReader br;
	private String arg1;
	private String arg2;
	private String command;
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public MyParser(){
		br = new BufferedReader(new InputStreamReader(System.in));
		model = new Model();
	}
	private boolean parseExp(){
		String regex="([-+]?[0-9]+{1,9}\\.?[0-9]*){1}+([*/+-]{1})([-+]?{1}[0-9]+{1,9}\\.?[0-9]*){1}";
        Pattern r = Pattern.compile(regex);
		System.out.println("Input  the expression, something like this: arg1*arg2");
		try {
			String s = br.readLine();
			 Matcher m = r.matcher(s);
			 if (m.find()) {
				    System.out.println("group 1: " + m.group(1));
				    System.out.println("group 2: " + m.group(2));
				    System.out.println("group 3: " + m.group(3));
				    arg1=m.group(1);
				    command=m.group(2);
				    arg2=m.group(3);	
				    model.setCommand(command);
				    return true;
				}
			 else{
				 System.out.println("Invalid expression,restart and try again");
				 return false;
			 }
		}   catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	@SuppressWarnings("unchecked")
	private void parseArgs(){
		String regex ="([-|+]?+[0-9]+{1,9}\\.?[0-9]*)";
		Pattern r= Pattern.compile(regex);
		Matcher m = r.matcher(arg1);
		Matcher m2=r.matcher(arg2);
		if(m.find()){
			model.setArg1(Double.parseDouble(arg1));
		}
		else
			model.setArg1(Integer.parseInt(arg1));
	if(m2.find()){
			model.setArg2(Double.parseDouble(arg2));
		}
		else
			model.setArg2(Integer.parseInt(arg2));
		}
	public boolean parse(){
		if(parseExp()){
			parseArgs();
			return true;}
		return false;	
	}
}


