package edu.samoilenko.operations;

import edu.samoilenko.calc.Calculate;
import edu.samoilenko.calc.DoubleCalc;
import edu.samoilenko.calc.IntegerCalc;
import edu.samoilenko.model.Model;

public class Substraction implements Calculate {

	private Model<?extends Number> model;

	public Model<? extends Number> getM() {
		return model;
	}
	public void setM(Model<? extends Number> model) {
		this.model = model;
	}
	public Substraction(){}
	@SuppressWarnings("rawtypes")
	@Override
	public Number calculate(Model model) {
		if((model.getArg1()instanceof Double)||(model.getArg2()instanceof Double)){
			return new DoubleCalc().substract((Double)model.getArg1(), (Double)model.getArg2());
		}
		else
			return new IntegerCalc().substract((Integer)model.getArg1(), (Integer)model.getArg2());
	}
	

}
