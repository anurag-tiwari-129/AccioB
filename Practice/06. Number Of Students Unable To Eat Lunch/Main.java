// sitaram
// 20/06/2025
import java.util.*;
class Solution{
    public static int countStudents(List<Integer> students, List<Integer> sandwiches) {
        // Write your code here

        int i = 0, sand = sandwiches.size();
        int j = 0, stud = students.size();
        while(i < sand){
            int rotate = 0;
            j = 0;
            while(j < stud && stud > 0){
                // matched, remove that student, move to next sandwich
                if(sandwiches.get(i) == students.get(j)){
                    i++;
                    students.remove(j);
                    
                    stud = students.size();
                    rotate = 0;
                }
                // rotate the student until the match one found
                // if not found, return that these students are left to eat
                else{
                    j = (j + 1) % stud;
                    rotate++;
                    if(rotate == stud)
                        return stud;
                }
            }
        }
        return 0;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>students=new ArrayList<>();
        for(int i=0;i<n;i++)
            students.add(sc.nextInt());
        List<Integer>sandwiches=new ArrayList<>();
        for(int j=0;j<n;j++)
            sandwiches.add(sc.nextInt());
        System.out.println(Solution.countStudents(students,sandwiches));
        sc.close();
    }
}