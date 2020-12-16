
package own;


import java.util.*;

public class Student
{
     Scanner sc=new Scanner(System.in);

   int Student_id,Total=0,subjects;

   String name;

   int marks[];
   float Average,percentage;

   Student()

   {

      System.out.print("Enter Student_id: ");

      Student_id=sc.nextInt();

      System.out.print("Enter Student Name: ");

      name=sc.next();;

      getDisMarks();

   }

   public void getDisMarks()

   {

       marks=new int[5];

       System.out.print("Enter marks of Physics: ");

       marks[0]=sc.nextInt();

       System.out.print("Enter marks of Chemistry: ");

       marks[1]=sc.nextInt();

       System.out.print("Enter marks of Maths: ");

       marks[2]=sc.nextInt();
       System.out.print("Enter marks of Computer: ");

       marks[3]=sc.nextInt();
       System.out.print("Enter marks of Zoology: ");

       marks[4]=sc.nextInt();
       for(int i=0;i<5;i++)
           

       {

          Total+=marks[i];
          Average+=marks[i]/5;
          percentage+=marks[i]/5;
       }

       System.out.println("Total Marks of student "+name+": " +Total);
       System.out.println("Average Marks of student "+name+": " +Average);
       System.out.println("percentage Marks of student "+name+": " +percentage);
       
   }   
}