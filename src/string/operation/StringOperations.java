package string.operation;

public class StringOperations {

    public static void main(String[] args) {

        String name = "  Username : Archana | Password : archana123 ";

        // total number of chars available in the String ==> String.length();
        System.out.println("Total Chars : " + name.length());

        // Get char at specific index ==> String.charAt(Index);
        System.out.println("Char at 9th Index : " + name.charAt(9));

        // Reverse a String
        for (int i = name.length() - 1; i >= 0; i--)
            System.out.print(name.charAt(i));

        System.out.println();

        // Remove unwanted beginning and trailing spaces ==> String.trim();
        System.out.println("Trimmed text is : " + name.trim());

        // Change the case of String ==> String.toLowerCase(); /toUpperCase();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // Convert String into Char Array
        char[] chars = name.toCharArray();
        System.out.println(chars[9]);

        // get last index of chars
        System.out.println(name.lastIndexOf("n"));

        // Get part of the String from the Main String ==>
        // String.subString(beginingIndex, endingIndex);
        System.out.println(name.substring(13, 18));

        // Get particular part of String using pattern ==> String.split(regular
        // expression);
        String[] values = name.trim().split(" ");
        System.out.println(values[2].trim());
        System.out.println(values[6].trim());

        //Replace String
        String text = "I Love My India";        
        String [] textvalues = text.split(" ");
       
       
        for(int i=0; i<textvalues.length; i++) {
            if(textvalues[i].equalsIgnoreCase("India")) {
//                textvalues[i]= textvalues[i].toUpperCase();
                String temp="" ;
                for(int j=textvalues[i].length()-1;j>=0;j--) {
                    temp= temp+textvalues[i].charAt(j);
                }
                textvalues[i]=temp;
            }
            System.out.print(textvalues[i]+" ");
        }
        System.out.println();
       
        System.out.println(text.replace("India", "INDIA"));
       
        //Replace specific chars
        String username = "Admin@123";
        System.out.println(username.replaceAll("[0-9]", ""));
        System.out.println(username.replaceAll("[A-Za-z]", ""));
        System.out.println(username.replaceAll("[@$#%^&*]", ""));
       
        //equals  ==> exact match including case of each chars
        //equalsIgnoreCase  ==>  exact match by excluding case of each chars
        //contains  ==> String contains partial value
        //startswith  ==> can validate the starting value
       
        String user = "Admin";
        System.out.println(user.equals("Admin"));
        System.out.println(user.equals("ADMIN"));
        System.out.println(user.equalsIgnoreCase("ADMIN"));
        System.out.println(user.contains("min"));
        System.out.println(user.contains("nim"));
        System.out.println(user.startsWith("Adm"));
        System.out.println(user.startsWith("min"));
       
        //StringBuffer and StringBuilder
       
        String users = "Bharath";
        users.concat(" is a Trainer");
        System.out.println(users);
       
        StringBuffer sbf = new StringBuffer("Bharath");  //synchronized
        sbf.append(" is a Trainer");
        System.out.println(sbf);
       
        StringBuilder sbd = new StringBuilder("Bharath"); //non-synchronized
        sbd.append(" is a Trainer");
        System.out.println(sbd);
       
    }

}