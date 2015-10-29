package edu.samoilenko.calc;

public class UniversalCalc extends Calculator<Double> {

	@Override
	public Double add(Double arg1, Double arg2) {
				return arg1+arg2;
	}

	@Override
	public Double substract(Double arg1, Double arg2) {
		return arg1-arg2;
	}
	@Override
	public Double multiple(Double arg1, Double arg2) {
		return arg1*arg2;
	}
	@Override
	public Number divide(Double arg1, Double arg2) {
		if(arg2.doubleValue()!=0){
		return arg1/arg2;}
		else
			throw new IllegalArgumentException("Do wanr to get Nan?");
	}
	public Double add(Double arg1, Integer arg2) {
		if(arg1==null||arg1==null)
			throw new IllegalArgumentException("Null args");
				return arg1+arg2;
	}
	public Double substract(Double arg1, Integer arg2) {
		
		return arg1-arg2;
	}
	public Double multiple(Double arg1, Integer arg2) {
		return arg1*arg2;
	}
	public Double divide(Double arg1, Integer arg2) {
		if(arg2.doubleValue()!=0){
		return arg1/arg2;}
		else
			throw new IllegalArgumentException("Do wanr to get Nan?");
	}
	public Double add(Integer arg1, Double arg2) {
		if(arg1==null||arg1==null)
			throw new IllegalArgumentException("Null args");
				return arg1+arg2;}
	
	public Double substract(Integer arg1, Double arg2) {	
		return arg1-arg2;
	}
	
	public Double multiple(Integer arg1, Double arg2) {
		return arg1*arg2;
	}	
	public Double divide(Integer arg1, Double arg2) {
		if(arg2.doubleValue()!=0){
		return arg1/arg2;}
		else
			throw new IllegalArgumentException("Do wanr to get Nan?");
	}
	
	public Integer add(Integer arg1, Integer arg2) {
		return arg1+arg2;
	}
	
	public Integer substract(Integer arg1, Integer arg2) {
				return arg1-arg2;
	}
	
	public Integer multiple(Integer arg1, Integer arg2) {
		return arg1*arg2;
	}
	
	public  Number divide(Integer arg1, Integer arg2) {
		Calculator <Double> c;
		if(arg2.intValue()!=0){
			if(arg1%arg2==0)
		return arg1/arg2;
			else
				 c = new UniversalCalc();
			return c.divide(arg1.doubleValue(), arg2.doubleValue());
		}
		throw new IllegalArgumentException("Do you really want to get a Nan?");
	}
}
