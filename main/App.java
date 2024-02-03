package main;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        University university = new University();
        Calculator calculator = new Calculator();

       
        




        boolean exit = false;
        while(!exit) {
            
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
                

                switch (i) {
                    case 1:
                        System.out.println("Anna opiskelijan nimi?");
                        String studentName = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        int studentNumber = Integer.parseInt(sc.nextLine());

                        Student student = new Student(studentName, studentNumber);
                        university.addStudent(student);
                        
                        break;
                    
                    case 2:
                        university.listStudents();
                        
                        break;
                    
                    case 3:
                        university.listStudentsNameIndex();
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        int studentIndex = Integer.parseInt(sc.nextLine());
                        System.out.println("Mille kurssille suorite lisätään?");
                        String course = sc.nextLine();
                        System.out.println("Mikä arvosana kurssille lisätään?");
                        int grade = Integer.parseInt(sc.nextLine());

                        Student newStudent = university.getStudentbyIndex(studentIndex);
                        newStudent.addGrade(course, grade);

                        break;
                    
                    case 4:
                        university.listStudentsNameIndex();
                        System.out.println("Minkä opiskelijan suoritteet listataan?");
                        int indexStudent = Integer.parseInt(sc.nextLine());
                        university.printStudentCourses(indexStudent);
                        
                        break;
                    
                    case 5:
                        university.listStudentsNameIndex();
                        System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                        int indexAgain = Integer.parseInt(sc.nextLine());
                        Student s = university.getStudentbyIndex(indexAgain);
                        double average = calculator.getAverageGrade(s);
                        System.out.println("Keski arvo on " + average);
                        
                        break;
                    
                    case 6:
                        university.listStudentsNameIndex();
                        System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                        int indexMedian = Integer.parseInt(sc.nextLine());
                        Student studentMedian = university.getStudentbyIndex(indexMedian);
                        double median = calculator.getMedianGrade(studentMedian);
                        System.out.println("Mediaani on " + median);

                        break;
                    
                    case 7:
                        university.saveStudents();
                        break;
                    
                    case 8:
                        university.loadStudents();
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        
                        break;
                    
                    
                    default:
                        System.out.println("Syöte oli väärä.");
                        
                        break;













                        









                }

                
            }


        }

        sc.close();
    }
}
