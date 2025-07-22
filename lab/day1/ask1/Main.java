import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Integer id,mark1,mark2,mark3;
        String name;
        Student [] sarr = new Student[n];
        for(int i=0;i<n;i++){
            String [] ip = sc.nextLine().split(" ");
            Student s = new Student(
                Integer.parseInt(ip[0]),
                ip[1],
                Integer.parseInt(ip[2]),
                Integer.parseInt(ip[3]),
                Integer.parseInt(ip[4])
            );
            sarr[i] = s;
        }
        Arrays.sort(sarr);
        int rank = 1;
        for(int i=n-1;i>=0;i--){
            System.out.println(sarr[i]+" "+rank++);
        }
    }
}
