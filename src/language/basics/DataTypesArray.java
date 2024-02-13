package language.basics;

public class DataTypesArray {

	public static void main(String[] args) {
		// Array data types
		// Array declaration
		int [] a1; //recommended
		a1 = new int [3];
		a1[0]=1;
		a1[1]=2;
		
		//-----------------------
		int a2[];
		
		int []a3; 
		
		int [] a4 =new int[2]; //dynamic initalization
		
		int [] a5= {1,2,2,3};
		
		
		String empName1 = "Akhila";
        int empId1 =1;
       
        String empName2 ="Bharath";
        int empId2=empId1+1;
       
       
        // Array ==> The datatype we are using to store 'MULTIPLE VALUES with SAME DATA TYPE' in single variable;
        //==> Arrays are fixed in length (meaning , user should specify the values count while initiating Array)
        //Syntax : DataType []  variable = new DataType[length];
        //we can store values using index , index always starts from zero (0)  ==> variable[Index] = data;
       
        //Store multiple employee names in single variable
        String [] employeeNames = new String [4];
        employeeNames[0] = "Akhila";
        employeeNames[1] = "Bharath";
        employeeNames[2] = "Dilip";
        employeeNames[3] = "Harika";
//        employeeNames[4] = "Harpeet";
       
       
        String [] group1 = {"Akhila","Ganesh"};
        String [] group2 = {"Harika","Harpeet"};
        String [] group3 = {"Harshita","Hima Bindhu"};
       
       
        String [][] groups = {{"Akhila","Ganesh"},{"Harika","Harpeet"},{"Harshita","Hima Bindhu"}};
       
        System.out.println(groups[0][0]);
       
       
        String [][] friends = new String [3][2];
        friends[0][0]="Akhila";
        friends[0][1]="Ganesh";
        friends[1][0]="Harika";
        friends[1][1]="Harpeet";
        friends[2][0]="Harshita";
        friends[2][1]="Hima Bindhu";
        
        for(int i=0;i<3;i++){
        	for (int j=0;j<2;j++) {
        		System.out.println(friends[i][j]);
        		
        	}
        	
        }
       
  
        //Challenges with Array
        //1. Fixed in Length
        //2. Static memory allocation
        //3. Only we can store same data type
		

	}

}
