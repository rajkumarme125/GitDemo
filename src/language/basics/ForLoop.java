package language.basics;

public class ForLoop {

    //When we know how many iterations we want to execute
   
    public static void main(String[] args) {
        String name = "ABC";
       
        /*
         * System.out.println(name); System.out.println(name); System.out.println(name);
         * System.out.println(name); System.out.println(name); System.out.println(name);
         * System.out.println(name); System.out.println(name); System.out.println(name);
         * System.out.println(name);
         */
       
        /**********************For Loop*********************/
       
        /**** for(condition1;condition2;condition3){
         *
         * }
         */

        for(int i=1; i<=10;i++) {
           
            System.out.println(i+name);
           
        }

    }

}
