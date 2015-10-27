package edu.samoilenko.calc;

public class IntegerCalc extends Calculator<Integer> {
	@Override
	public Integer add(Integer arg1, Integer arg2) {
		return arg1+arg2;
	}
	@Override
	public Integer substract(Integer arg1, Integer arg2) {
				return arg1-arg2;
	}
	@Override
	public Integer multiple(Integer arg1, Integer arg2) {
		return arg1*arg2;
	}
	@Override
	public  Number divide(Integer arg1, Integer arg2) {
		Calculator <Double> c;
		if(arg2.intValue()!=0){
			if(arg1%arg2==0)
		return arg1/arg2;
			else
				 c = new DoubleCalc();
			return c.divide(arg1.doubleValue(), arg2.doubleValue());
		}
		throw new IllegalArgumentException("Do you really want to get a Nan?");
	}
}
