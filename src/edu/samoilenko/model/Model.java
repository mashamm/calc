package edu.samoilenko.model;

public class  Model<T extends Number>   {
	private T arg1;
	private T arg2;
	private String command;

	public T getArg1() {
		return arg1;
	}
	public void setArg1(T arg1) {
		this.arg1 = arg1;
	}
	public T getArg2() {
		return arg2;
	}
	public void setArg2(T arg2) {
		this.arg2 = arg2;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String toString(){
		
		return "arg1="+arg1+" arg2="+arg2+" command="+command;
	}
}
