import java.util.Scanner;


public class IT24100786Lab4Q2
{
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    float examMark,labSub,markPer,labPer,finMark,totPer;


    System.out.print("Enter your exam marks :");
    
    examMark = input.nextFloat();

    if(examMark > 100 || examMark < 0)

    { 
     System.out.print("Invalid Input for exam marks. Terminating program ..");
    return;} 

    

    System.out.print("Please enter the lab submission marks (out of 100) :");

    labSub = input.nextFloat();


   if(labSub > 100 || labSub < 0)

   {
    System.out.print("Invalid Input for lab marks. Terminating program ..");
   return;}



   System.out.print("Piease enter the percentage given for the exam :");

   markPer = input.nextFloat();

   System.out.print("Piease enter the percentage given for the lab submission:");

   labPer = input.nextFloat();

      totPer = markPer + labPer;
  
   
  if(totPer > 100 || totPer < 0)

  {
   System.out.print("The percentage must add up to 100. Terminating the program..");
  return;}
  

  finMark = (examMark * markPer/100) + (labSub*labPer/100);

  System.out.print("Final mark is :" + finMark);
 


}

}


