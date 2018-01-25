package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		//set up
		Map<String, String> animalsToGroups = new HashMap <> ();
		animalsToGroups.put("rhino", "Crash");
		animalsToGroups.put("giraffe", "Tower");
		animalsToGroups.put("elephant", "Herd");
		animalsToGroups.put("lion", "Pride");
		animalsToGroups.put("crow", "Murder");
		animalsToGroups.put("pigeon", "Kit");
		animalsToGroups.put("flamingo", "Pat");
		animalsToGroups.put("deer", "Herd");
		animalsToGroups.put("dog", "Pack");
		animalsToGroups.put("crocodile", "Float");
		
			// get the group name
			animalName = animalName.toLowerCase(); //first normalize the animal name they gave you
			String groupName = animalsToGroups.get(animalName); 
			
			if (groupName == null) { //null means it (in this case the animal name) did not exsist in the key
				groupName = "unknown";
			}
			
			return groupName;
		}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double> itemToDiscount = new HashMap<>();
			itemToDiscount.put("kitchen4001" , 0.20);
			itemToDiscount.put("garage1070" , 0.15);
			itemToDiscount.put("livingroom" , 0.10);
			itemToDiscount.put("kitchen6073" , 0.40);
			itemToDiscount.put("bedroom3434" , 0.60);
			itemToDiscount.put("bath0073" , 0.15);
			
			itemNumber = itemNumber.toLowerCase();
			Double discount = itemToDiscount.get(itemNumber);
			
			if (discount == null) {
				return 0.00;
			}
			return discount;
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
			if ( peterMoney > 0 && paulMoney < 1000) {
				int moneyToPaul = peterMoney / 2;
				peterPaul.put("Paul", paulMoney + moneyToPaul );
				peterPaul.put("Peter", peterMoney - moneyToPaul);
				}
			return peterPaul;
			}

		

	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		Integer peterMoney = peterPaul.get("Peter");
		Integer paulMoney = peterPaul.get("Paul");
		if (peterMoney >= 5000 && paulMoney >= 10000) {
			int peterShare = peterMoney / 4;
			int paulShare = paulMoney / 4;
			
			peterPaul.put("Peter", peterMoney - peterShare);
			peterPaul.put("Paul", paulMoney - paulShare);
			peterPaul.put("PeterPaulPartnership", peterShare + paulShare);
			
		}
		return peterPaul;
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"} //first character being key, last value
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"} //m repeats so it takes the most recent one, moat in place of muddy.
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> firstCharKey = new HashMap <> (); //creating the new map you will return
		for (String element: words) {  //for the element in words
            firstCharKey.put(element.substring(0,1), String.valueOf(element.charAt(element.length()-1)));
        }
        return firstCharKey;
	}
		
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}   //contains key. if contains key update count. value is how many times it has been found.
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *///if its not in map it'll come in as new.
	 //*//
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> keyDiffString = new HashMap<String, Integer> ();
		  for (String element : words) {
		    
		    if (!keyDiffString.containsKey(element)) {  
		      keyDiffString.put(element, 1);
		    }
		    else {
		      int count = keyDiffString.get(element);
		      keyDiffString.put(element, count + 1);
		    }
		  }
		  return keyDiffString;
		}
				
			
	
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> keyEachInt = new HashMap<>(); 
		for (Integer elements : ints) {
			 if (!keyEachInt.containsKey(elements)) {  
			      keyEachInt.put(elements, 1);	
		} else {
			 int count = keyEachInt.get(elements);
		      keyEachInt.put(elements, count + 1);
		}
		
		}
		return keyEachInt;
	}	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> boolMap = new HashMap<>();
		Map < String, Integer > intMap = new HashMap<>();
		  
		   for (String buffer:words) {
		      if (boolMap.containsKey(buffer) && boolMap.get(buffer)) {
		        continue;
		      }
		      if (intMap.containsKey(buffer)) {
		          intMap.put(buffer, intMap.get(buffer)+1);
		      } else {
		          intMap.put(buffer, 1);
		      }
		      boolMap.put(buffer, intMap.get(buffer) >= 2);
		   }
		   return boolMap;    
		}
	
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map<String,Integer> consolidatedMaps=new HashMap<String,Integer>();
		Map<String,Integer> keyMap=new HashMap<String,Integer>();
		consolidatedMaps.put("SKU1",100);
		consolidatedMaps.put("SKU2",64);
		consolidatedMaps.put("SKU3",44);
		consolidatedMaps.put("SKU4",5);
		Set<String> s=keyMap.keySet();
		for(String i:s){
		    if(consolidatedMaps.get(i)==null){
		    	consolidatedMaps.put(i,keyMap.get(i));
		    }
		}
		return consolidatedMaps;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 *///
	//extra step of comparing segements of the string
	public Map<String, Integer> last2Revisted(String[] words) {
		return null;
	}
}
