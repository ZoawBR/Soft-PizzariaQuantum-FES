package model;

import java.util.ArrayList;

public class BaseDadosPizza {
	public static ArrayList<Pizza> basePizza = new ArrayList<Pizza>();
	
	public static ArrayList<Pizza> getBasePizza() {
		return basePizza;
	}

	public static void setBasePizza(ArrayList<Pizza> basePizza) {
		BaseDadosPizza.basePizza = basePizza;
	}

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
	
	public static Pizza searchPizza(String pizza) { 
		for (Pizza pizz : basePizza) {
			if (pizz.getSabor().equals(pizza)) {
				return pizz;
			}
		}
		return null;
	}
	
	public static boolean existPizza(Pizza pizza) {
		for (Pizza pizz : basePizza) {
			if (pizz.getSabor().equals(pizza.getSabor())) {
				return true;
			}
		}
		return false;
	}
}
