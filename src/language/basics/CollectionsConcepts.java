package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsConcepts {

    public static void main(String[] args) {
       
        //Challenges with Array
        //1. Fixed in Length
        //2. Static memory allocation
        //3. Only we can store same data type
       
       
        //COLLECTIONS -
        //List - ArrayList and LinkedList ==> to store multiple values with same datatype, List can store duplicates
       
       
        //Set - HashSet, LinkedHashSet and TreeSet ==> to store multiple values with same datatype, Set cannot store duplicates
       
       
        //Map - HashMap , LinkedHashMap , TreeMap and Hashtable  ==> Can store mutiple values with different data types
        //and can store duplicate values but cannot store duplicate keys
       
        /***********************************LIST****************************************/
       
        //List - ArrayList and LinkedList ==> to store multiple values with same datatype, List can store duplicates
        //Syntax : List<DataType> Variable = new ArrayList<DataType>();
        //We can store values using List.add(value);
       
        System.out.println("***************ArrayList****************");
        //Order ==> Insertion Order
        //Null ==> Null values are allowed
       
        List<String> empNamesArrayList = new ArrayList<String>();
        System.out.println("Size of ArrayList : "+empNamesArrayList.size());
        empNamesArrayList.add("Akhila");
        empNamesArrayList.add("Bharath");
        empNamesArrayList.add("Dilip");
        empNamesArrayList.add("Harika");
        empNamesArrayList.add("Harpeet");
        empNamesArrayList.add("Akhila");
        empNamesArrayList.add(null);
       
        System.out.println(empNamesArrayList);
       
        System.out.println("***************LinkedList****************");
        //Order ==> Insertion Order
        //Null ==> Null values are allowed
       
        List<String> empNamesLinkedList = new LinkedList<String>();
        System.out.println("Size of LinkedList : "+empNamesLinkedList.size());
        empNamesLinkedList.add("Akhila");
        empNamesLinkedList.add("Bharath");
        empNamesLinkedList.add("Dilip");
        empNamesLinkedList.add("Harika");
        empNamesLinkedList.add("Harpeet");
        empNamesLinkedList.add("Akhila");
        empNamesLinkedList.add(null);
       
        System.out.println(empNamesLinkedList);

        /***********************************SET****************************************/

        //Set - HashSet, LinkedHashSet and TreeSet ==> to store multiple values with same datatype, Set cannot store duplicates

        System.out.println("***************HashSet****************");
        //Order ==> Random Order
        //Null ==> Null values are allowed
       
        Set<String> empNamesHashSet = new HashSet<String>();
        System.out.println("Size of HashSet : "+empNamesHashSet.size());
        empNamesHashSet.add("Akhila");
        empNamesHashSet.add("Bharath");
        empNamesHashSet.add("Dilip");
        empNamesHashSet.add("Harika");
        empNamesHashSet.add("Harpeet");
        empNamesHashSet.add("Akhila");
        empNamesHashSet.add(null);
       
        System.out.println(empNamesHashSet);
       
        System.out.println("***************LinkedHashSet****************");
        //Order ==> Insertion Order
        //Null ==> Null values are allowed
       
        Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
        System.out.println("Size of LinkedHashSet : "+empNamesLinkedHashSet.size());
        empNamesLinkedHashSet.add("Akhila");
        empNamesLinkedHashSet.add("Bharath");
        empNamesLinkedHashSet.add("Harika");
        empNamesLinkedHashSet.add("Harpeet");
        empNamesLinkedHashSet.add("Dilip");
        empNamesLinkedHashSet.add("Akhila");
        empNamesLinkedHashSet.add(null);
       
        System.out.println(empNamesLinkedHashSet);
       
        System.out.println("***************TreeSet****************");
        //Order ==> Alphabetical/Ascending Order
        //Null ==> Null values are not allowed
       
        Set<String> empNamesTreeSet = new TreeSet<String>();
        System.out.println("Size of TreeSet : "+empNamesTreeSet.size());
        empNamesTreeSet.add("Akhila");
        empNamesTreeSet.add("Bharath");
        empNamesTreeSet.add("Harika");
        empNamesTreeSet.add("Harpeet");
        empNamesTreeSet.add("Dilip");
        empNamesTreeSet.add("Akhila");
//        empNamesTreeSet.add(null);
       
        System.out.println(empNamesTreeSet);
       
        /***********************************MAP****************************************/
       
        //Map - HashMap , LinkedHashMap , TreeMap and Hashtable  ==> Can store mutiple values with different data types
        //and can store duplicate values but cannot store duplicate keys
        //Map<Key,Value> variable = new HashMap<Key,Value>();
       
        System.out.println("***************HashMap****************");
        //Order ==> Random Order of Keys
        //Null ==> Null values are allowed , Null Keys are allowed
       
        Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
        System.out.println("Size of HashMap : "+empNamesHashMap.size());
        empNamesHashMap.put("Akhila",1);
        empNamesHashMap.put("Bharath",2);
        empNamesHashMap.put("Harika",2);
        empNamesHashMap.put("Harpeet",3);
        empNamesHashMap.put("Dilip",4);
        empNamesHashMap.put("Akhila",5);
        empNamesHashMap.put("Anisa",null);
        empNamesHashMap.put(null,7);
       
        System.out.println(empNamesHashMap);
       
        System.out.println("***************LinkedHashMap****************");
        //Order ==> Insertion Order of Keys
        //Null ==> Null values are allowed , Null Keys are allowed
       
        Map<String,Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
        System.out.println("Size of LinkedHashMap : "+empNamesLinkedHashMap.size());
        empNamesLinkedHashMap.put("Akhila",1);
        empNamesLinkedHashMap.put("Bharath",2);
        empNamesLinkedHashMap.put("Harika",2);
        empNamesLinkedHashMap.put("Harpeet",3);
        empNamesLinkedHashMap.put("Dilip",4);
        empNamesLinkedHashMap.put("Akhila",5);
        empNamesLinkedHashMap.put("Anisa",null);
        empNamesLinkedHashMap.put(null,7);
       
        System.out.println(empNamesLinkedHashMap);
       
       
        System.out.println("***************TreeMap****************");
        //Order ==> Alphabetical/Ascending Order of Keys
        //Null ==> Null values are allowed , Null Keys are not allowed
       
        Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
        System.out.println("Size of TreeMap : "+empNamesTreeMap.size());
        empNamesTreeMap.put("Akhila",1);
        empNamesTreeMap.put("Bharath",2);
        empNamesTreeMap.put("Harika",2);
        empNamesTreeMap.put("Harpeet",3);
        empNamesTreeMap.put("Dilip",4);
        empNamesTreeMap.put("Akhila",5);
        empNamesTreeMap.put("Anisa",null);
//        empNamesTreeMap.put(null,7);
       
        System.out.println(empNamesTreeMap);
       
       
        System.out.println("***************Hashtable****************");
        //Order ==> Random Order of Keys
        //Null ==> Null values are not allowed , Null Keys are not allowed
       
        Map<String,Integer> empNamesHashtable = new Hashtable<String,Integer>();
        System.out.println("Size of Hashtable : "+empNamesHashtable.size());
        empNamesHashtable.put("Akhila",1);
        empNamesHashtable.put("Bharath",2);
        empNamesHashtable.put("Harika",2);
        empNamesHashtable.put("Harpeet",3);
        empNamesHashtable.put("Dilip",4);
        empNamesHashtable.put("Akhila",5);
//        empNamesHashtable.put("Anisa",null);
//        empNamesHashtable.put(null,7);
       
        System.out.println(empNamesHashtable);
       

    }

}


