package model;

import java.util.ArrayList;

public class BaseDadosPizza {
	private static ArrayList<Pizza> basePizza = new ArrayList<Pizza>();
	
	public static boolean addPizza(Pizza pizza) {
		if (basePizza.add(pizza)) {
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean deletPizza(Pizza pizza) {
		if (existPizza(pizza)) {
			for (Pizza pizz : basePizza) {
				if (pizz.getCodigo() == pizza.getCodigo()) {
					basePizza.remove(pizz);
					return true;
				}
			}
		}
		return false;
	}
	
	public static Pizza searchPizza(Pizza pizza) { 
		for (Pizza pizz : basePizza) {
			if (pizz.getNome().equals(pizza.getNome())) {
				return pizz;
			}
		}
		return null;
	}
	
	public static boolean existPizza(Pizza pizza) {
		for (Pizza pizz : basePizza) {
			if (pizz.getNome().equals(pizza.getNome())) {
				return true;
			}
		}
		return false;
	}
}
