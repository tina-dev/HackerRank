package net.tina.HackerRank.Algorithms.Implementation;

public class P01_GradingStudents
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }

	static int[] solve(int[] grades)
    {
        for(int i = 0; i < grades.length; i++)
        {
        	int grade = grades[i];
            if(grade >= 38)
            {
            	if(5 - grade % 5 < 3)
            	{
            		grades[i] = grade + 5 - grade % 5;
            	}
            }
        }
        
        return grades;
    }
}