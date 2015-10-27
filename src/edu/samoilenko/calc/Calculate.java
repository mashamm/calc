package edu.samoilenko.calc;

import edu.samoilenko.model.Model;

public interface Calculate <T extends Number>{
	Number calculate(Model<? extends Number> m);
}
