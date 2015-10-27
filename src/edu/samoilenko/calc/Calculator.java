package edu.samoilenko.calc;

public abstract class Calculator<T extends Number> {
	public  abstract T add(T arg1, T arg2);
	public abstract T substract(T arg1, T arg2);
	public abstract T multiple(T arg1, T arg2);
	public abstract Number divide(T arg1, T arg2);
}
