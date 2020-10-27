import java.util.*;
public class main {

	public static void main(String[] args) {
		
	printName();
	printAge();
	printGrade();
	printCGPA();
	printGender();	
	printBirthday();
	printMarital();
	printCitizenship();
	printHomeaddress();
	printHp();
	printWorkExperiences();
	printLanguage();
	printSkill();
	printawards();
	
	}

	public static void printName() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR NAME             :");
		String name = in.nextLine();
		System.out.println("Name "+"\t\t\t"+"    :" +name);
	
	}
	
	public static void printAge() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR AGE"+"              :");
		int age = in.nextInt();
		System.out.println("Age"+"\t\t\t "+"   :"+age);
	
	}
	
	
	
	public static void printGrade() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR GRADE            :");
		String str = in.next();
		char grade = str.charAt(0);
		System.out.println("Grade"+"\t\t\t "+"   :"+grade);
		
	}
	
	public static void printCGPA() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER CGPA SEM 1            :");
		double i = in.nextDouble();
		System.out.print("ENTER CGPA SEM 2            :");
		double j = in.nextDouble();
		
		double k = i+j;
		double l = k/2;
		System.out.println("Current CGPA"+"\t\t "+"   :"+l );
	
	}
	
	public static void printGender() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR GENDER           :");
		String gdr = in.next();
		char gender = gdr.charAt(0);
		System.out.println("gender"+"\t\t\t "+"   :"+gender);
		
	}
	
	public static void printBirthday() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR BIRTHDAY         :");
		String birthday = in.next();
		System.out.println("birthday"+"\t\t "+"   :"+birthday);
		
	}
	
	public static void printMarital() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR MARITAL          :");
		String marital = in.next();
		System.out.println("marital"+"\t\t\t "+"   :"+marital);
		
	}
	
	public static void printCitizenship() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR CITIZENSHIP      :");
		String citizenship = in.next();
		System.out.println("citizenship"+"\t\t "+"   :"+citizenship);
		
	}
	
	
	public static void printHomeaddress() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR HOMEADDRESS      :");
		String homeaddress = in.nextLine();
		System.out.println("homeaddress                 :"+homeaddress);
		
	}
	
	public static void printHp() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR HP               :");
		String hp = in.next();
		System.out.println("hp"+"\t\t\t "+"   :"+hp);
		
	}
	
	public static void printWorkExperiences() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR Work Experiences : 1.");
		String WorkExperiences1 = in.nextLine();
		System.out.print("ENTER YOUR Work Experiences : 2.");
		String WorkExperiences2 = in.nextLine();
		System.out.println("Work Experiences            : 1."+WorkExperiences1+"\n\t\t\t"+" "     +"     2."+WorkExperiences2);
	}
	
	public static void printLanguage() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR LANGUAGE         : 1.");
		String Language1 = in.nextLine();
		System.out.print("ENTER YOUR LANGUAGE         : 2.");
		String Language2 = in.nextLine();
		System.out.print("ENTER YOUR LANGUAGE         : 3.");
		String Language3 = in.nextLine();
		System.out.println("Language                    : 1."+Language1+"\n\t\t\t"+" "+"     2."+Language2+"\n\t\t\t"+" "+"     3."+Language3);
	}
	
	public static void printSkill() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR SKILL            : 1.");
		String skill1 = in.nextLine();
		System.out.print("ENTER YOUR SKILL            : 2.");
		String skill2 = in.nextLine();
		System.out.println("skill                       : 1."+skill1+"\n\t\t\t"+"      "+"2."+skill2);
	}
	
	public static void printawards() {
		Scanner in = new Scanner (System.in);
		System.out.print("ENTER YOUR AWARDS           :");
		String awards = in.nextLine();
		System.out.println("awards"+"\t\t\t"+"    :"+awards);
		
	}
	
}
