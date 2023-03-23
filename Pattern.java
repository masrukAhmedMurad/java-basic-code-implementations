

package dynamic.programming;

import java.util.Scanner;



public class Pattern {
    
    
    public static void main(String[] args){
        
    //create scanner class object for taking input.
       Scanner sc=new Scanner(System.in);
       
        // take an integer type input. which defines how many row's will be there in my pattern
        int n=sc.nextInt();
        
        
        
////  key points:
////  outer loop always defines how many lines are in the pattern
////  out goal is is find out the common logic when inner loop will stop.
////  for all the below pattern our input is n;



//// Pattern -1  Start
////        1
////        1 2
////        1 2 3
////        1 2 3 4

 System.out.println("\n\nPattern - 1\n\n");

    ///outer loop start
    

        for (int i = 1; i <= n; i++) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///inner loop start
            for (int j = 1; j <= i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable. 
                System.out.print(j+" ");     ///print 1 to outer loop variable in each line with spaces.
            }
            
            ///inner loop end for each line
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-1 End
        

System.out.println();
System.out.println();



//// Pattern -2  Start
////        *
////        * *
////        * * *
////        * * * *


        System.out.println("\n\nPattern - 2\n\n");

    ///outer loop start

        for (int i = 1; i <= n; i++) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///inner loop start
            for (int j = 1; j <= i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable. 
                System.out.print("* ");     ///print *(1 to outer loop variable no times) in each line with spaces.
            }
            
            ///inner loop end for each line
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-2 End







        System.out.println();
        System.out.println();


 
//// Pattern -3  Start
////        1 2 3 4
////        1 2 3
////        1 2 
////        1 

 System.out.println("\n\nPattern - 3\n\n");

    ///outer loop start
    

        for (int i = n; i>0; i--) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///inner loop start
            for (int j = 1; j <= i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable. 
                System.out.print(j+" ");     ///print 1 to outer loop variable in each line with spaces.
            }
            
            ///inner loop end for each line
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-3 End

        





       System.out.println();
        System.out.println();


 
//// Pattern -4  Start
////        * * * *
////        * * *
////        * * 
////        * 

 System.out.println("\n\nPattern - 4\n\n");

    ///outer loop start
    

        for (int i = n; i>0; i--) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///inner loop start
            for (int j = 1; j <= i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable. 
                System.out.print("* ");     ///print *(1 to outer loop variable value) in each line with spaces.
            }
            
            ///inner loop end for each line
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-4 End










      System.out.println();
        System.out.println();


 
//// Pattern -5  Start

////            *
////           **
////          *** 
////         ****


 System.out.println("\n\nPattern - 5\n\n");

    int starCounter=1;    
    
    ///outer loop start   

        for (int i = n; i>0; i--) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///space printer inner loop start
            for (int j = 1; j <= i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable. 
                System.out.print(" ");     ///print space(1 to (outer loop variable value-1)) in each line with spaces.
            }
             ///space printer inner loop end
            
             
              ///star printer inner loop start
            for (int j = 1; j <= starCounter; j++) {   ///star printer inner loop will stop when star_printer_inner_loop variable is equals to starCounter variable. 
                System.out.print("*");     ///print star(1 to (starCounter variable)) in each line with spaces.
            }
             ///star printer inner loop end
             
            starCounter++;  ///increment starCounter variable cause below lines print 1 more star each time. 
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-5 End








      System.out.println();
        System.out.println();


 
//// Pattern -6  Start

////            1
////           12
////          123 
////         1234


 System.out.println("\n\nPattern - 6\n\n");

    int starCounter2=1;    
    
    ///outer loop start   

        for (int i = n; i>0; i--) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///space printer inner loop start
            for (int j = 1; j <= i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable. 
                System.out.print(" ");     ///print space(1 to (outer loop variable value-1)) in each line with spaces.
            }
             ///space printer inner loop end
            
             
              ///star printer inner loop start
            for (int j = 1; j <= starCounter2; j++) {   ///star printer inner loop will stop when star_printer_inner_loop variable is equals to starCounter2 variable. 
                System.out.print(j);     ///print star(1 to (starCounter2 variable)) in each line with spaces.
            }
             ///star printer inner loop end
             
            starCounter2++;  ///increment starCounter variable cause below lines print 1 more star each time. 
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-6 End







  







      System.out.println();
        System.out.println();


 
//// Pattern -7  Start

////            *
////           ***
////          *****
////         *******

int sCount=1;

 System.out.println("\n\nPattern - 7\n\n");

      
    
    ///outer loop start   

        for (int i = n; i>0; i--) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///space printer inner loop start
            for (int j = 1; j <i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable-1. 
                System.out.print(" ");     ///print space(1 to (outer loop variable value-1)) in each line with spaces.
            }
             ///space printer inner loop end
            
             
              ///number printer inner loop start
            for (int j = 1; j <= sCount; j++) {   ///number printer inner loop will stop when star_printer_inner_loop variable is equals to starCounter2 variable. 
                System.out.print(j);     ///print number(1 to (starCounter2 variable)) in each line with spaces.
            }
             ///number printer inner loop end
             
            sCount+=2;  ///increment starCounter variable cause below lines print 1 more value each time. 
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-7 End













      System.out.println();
        System.out.println();


 
//// Pattern -7  Start

////            *
////           ***
////          *****
////         *******

int sCountt=1;

 System.out.println("\n\nPattern - 8\n\n");

      
    
    ///outer loop start   

        for (int i = n; i>0; i--) {    ///outer loop defines number of lines in my pattern.here will print n lines.

            ///space printer inner loop start
            for (int j = 1; j <i; j++) {   ///inner loop will stop when inner loop variable is equals to outer loop variable-1. 
                System.out.print(" ");     ///print space(1 to (outer loop variable value-1)) in each line with spaces.
            }
             ///space printer inner loop end
            
             
             
              ///star printer inner loop start
            for (int j = 1; j <= sCountt; j++) {   ///star printer inner loop will stop when star_printer_inner_loop variable is equals to starCounter2 variable. 
                System.out.print("*");     ///print star(1 to (starCounter2 variable)) in each line with spaces.
            }
             ///star printer inner loop end
             
             
            sCountt+=2;  ///increment starCounter variable cause below lines print 1 more star each time. 
            
            System.out.println();   ///print new line after each line 
            

        }
        
   ///outer loop end;
       
////Patern-8 End


        
        
   



        
        
    
   
        
        
    }
   
    
    
}
