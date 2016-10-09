package onboarding.misc;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class ImporttantClasses {

	public List question1() {
		String carBrand = "BMW Kia-Forte Toyota-Camry Lexus Honda-Civic Audi";
		String[] carArray = carBrand.split(" ");
		List carList = Arrays.asList(carArray);
		return carList;
	}

	public Map question2() {
		Map<String, Integer> carPrices = new HashMap<String, Integer>();
		carPrices.put("BMW", 70000);
		carPrices.put("Kia-Forte", 29000);
		carPrices.put("Toyota-Camry", 60000);
		carPrices.put("Lexus", 90000);
		carPrices.put("Honda-civic", 31000);
		carPrices.put("Audi", 90000);
		return carPrices;
	}

	public List question3(Map carPrices) {
		List<String> sortedCarBrands = new Vector<String>();
		sortedCarBrands.addAll(carPrices.keySet());
		java.util.Collections.sort(sortedCarBrands);
		return sortedCarBrands;
	}

	public String question4(Map carPrices) {
		String priceOfAllCar = "";
		Set<Entry> entries = carPrices.entrySet();
		Iterator itr = entries.iterator();
		while (itr.hasNext()) {
			Entry element = (Entry) itr.next();
			priceOfAllCar += element.getKey() + "(" + element.getValue() + "),";
		}
		return priceOfAllCar;
	}

	public List question5(Map carPrices) {
		List<String> sortedCarBrands = new Vector<String>();
		sortedCarBrands.addAll(carPrices.values());
		java.util.Collections.sort(sortedCarBrands);
		return sortedCarBrands;
	}

	public List question(Map carPrices) {
		List<String> sortKeyValueOfCar = new Vector<String>();
		return sortKeyValueOfCar;
	}

	// TODO sort map key value

	public List question6(Map carPrices) {
		List<String> sortedCarBrands = new Vector<String>();
		sortedCarBrands.addAll(carPrices.keySet());
		java.util.Collections.reverse(sortedCarBrands);
		return sortedCarBrands;
	}

	public static void question7() {
		Map<String, Integer> otherCarPricesMap = new HashMap<String, Integer>();
		otherCarPricesMap.put("BMW", 70000);
		otherCarPricesMap.put("Honda-Civic", 31000);
		otherCarPricesMap.put("Audi", 90000);

		for (Map.Entry<String, Integer> e : otherCarPricesMap.entrySet()) {
			System.out.println("[" + e.getKey() + ":" + e.getValue() + "]");
		}

	}

	public static void main(String[] args) {

		ImporttantClasses im = new ImporttantClasses();
		List list = im.question1();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Map carPrices = im.question2();
		Iterator itr = carPrices.keySet().iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element + ":" + carPrices.get(element));
		}

		List sortedCarBrands = im.question3(carPrices);
		System.out.println(sortedCarBrands);

		String priceOfAllCar = im.question4(carPrices);
		System.out.println(priceOfAllCar);

		List sortedCarBrand = im.question5(carPrices);
		System.out.println(sortedCarBrand);

		List sortedCarBrandss = im.question6(carPrices);
		System.out.println(sortedCarBrandss);
		ImporttantClasses.question7();

	}
}
