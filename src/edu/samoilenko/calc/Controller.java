package edu.samoilenko.calc;

import java.util.HashMap;
import java.util.Map;

import edu.samoilenko.model.Model;
import edu.samoilenko.operations.Adder;
import edu.samoilenko.operations.Divider;
import edu.samoilenko.operations.Multiplayer;
import edu.samoilenko.operations.Substraction;
import edu.samoilenko.parser.MyParser;



public class Controller {
	private static final Map< String,Calculate<? extends Number>> commands= new HashMap<>();
		static{
			commands.put("*", new Multiplayer());
			commands.put("/", new Divider());
			commands.put("-", new Substraction());
			commands.put("+",new Adder());
		}
	private MyParser p;
	private Model<? extends Number> m;
	public Controller(){
		p = new MyParser();
	}
	public Controller(Model<? extends Number> m){
		this.m=m;
	}
	public Model<? extends Number> getM() {
		return m;
	}
	public void setM(Model<? extends Number> m) {
		this.m = m;
	}
	
	@SuppressWarnings("unchecked")
	public void start(){
		p.parse();
		m=p.getModel();
		System.out.println(commands.get(m.getCommand()).calculate(m));
	}
}
