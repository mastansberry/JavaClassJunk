import java.util.Scanner;
import java.io.*; 
import java.util.*; 

public class delete{
    public static void main(String[] args) {
        
        //System.out.print("====EnterID=====");
        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        //CollegeCourse[] courses = new CollegeCourse[5];
        // declaring array size for Student class
        Thistoo[] attempt = new Thistoo[3];
        //String[] names = new String[5];
        //int stuID = sc.nextInt();
        
        ///for (int x = 0; x < attempt.length; x++) {
			///attempt[x]=new Thistoo();;
		///}
        
        
        for (int i=0; i<attempt.length; i++){
            //String userName = sc.nextLine();
            System.out.println();
            System.out.print("====EnterID=====");

            
            
            //names[i]=userName;
            //courses[i].setCourseID(userName);
            attempt[i]=new Thistoo();
            attempt[i].setStudentNum(sc.nextInt());
            for(int z =0;z<5;z++){
                //System.out.println();
                //attempt[i].setCourseID(sc.nextLine(),z);
                System.out.print("====EnterCourses=====");
                attempt[i].setCourseID(sx.nextLine(),z);
                System.out.println(attempt[i].getCourse(z).getCourseID());
                }
            //System.out.println(Arrays.toString(attempt.getStudentNum()));
            //System.out.println(attempt[i].getStudentNum());
        }
        
        //System.out.println(Arrays.toString(courses));
        //for (int x =0; x<names.length;x++){System.out.println(courses[x].getCourseID());}

    } 
}
