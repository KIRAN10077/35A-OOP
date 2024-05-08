public class FunctionClass {
    /*Function should be creared in class scope
         * meaning either top or bottom of main
         */
        void printSomething(){
            System.out.println("this function prints");
        }
        //void is considered a data type that returns nothing
    public static void main(String[] args){
        /*Function should be created in class scope
         * meaning either top or bottom of main
         */

         FunctionClass fc = new FunctionClass();
         fc.printSomething();
         //can be used multiple times.
         fc.printSomething();
    }
    
}
