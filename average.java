import java.util.Scanner;
class Activity {
		public static void main(String[] args) {
			
			Scanner grades = new Scanner(System.in);
			double grade[] = new double[4];
			String rank;
			
			System.out.print("Enter your first grade: ");
			grade[0] = grades.nextDouble();
    			System.out.print("Enter your second grade: ");
    			grade[1] = grades.nextDouble();
        			System.out.print("Enter your third grade: ");
        			grade[2] = grades.nextDouble();
            			System.out.print("Enter your fourth grade: ");
            			grade[3] = grades.nextDouble();
		                    double average = ((grade[0] + grade[1] + grade[2] + grade[3]) / 4);
                        			
            if (average > 100) rank = "Invalid Grade";
                else if (average >= 98 && average < 100) rank = "With Highest Honor";
                    else if (average >= 95 && average <= 97.99) rank = "With High Honors";
                        else if (average <90 && average >= 94.99) rank = "With Honors";
                            else if (average < 75 && average >= 89.99) rank = "Passed";
                                else rank = "Failed";
            System.out.print("Your average is: " + average + ", " + rank);
             grades.close();           			
		}
	}