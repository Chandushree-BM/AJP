import java.util.*;

public class Studentbaches{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of branches");
        int branches=sc.nextInt();

        
        System.out.println("Enter number of batches in each branches");
        int batches=sc.nextInt();

        
        System.out.println("Enter number of students in each batch");
        int students=sc.nextInt();

        int [][]studentAge=new int[branches][batches][students];

        for(int i=0;i<branches;i++)
        {
            System.out.println("Enter data for branch"+i)
            for(int j=0;j<batches;j++)
            {
                System.out.println("Enter data for batch"+j)

                for(int k=0;k<students;k++)
                {
                    System.out.println("Enter age of student"+k)
                }
            }
        }

        System.out.println("-----------------------------------------")

        for(int i=0;i<=branches;i++){
            for(int j=0;j<batches;j++){
                for(int k=0;k<=students;k++){
                    System.out.println("Branches"+i+"Batches"+j+"students"+k+"Age"+studentAge[i][j][k]);
        
                    }
                }
            }
        }
        
    }
}
}