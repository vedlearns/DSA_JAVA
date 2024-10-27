package QuestionCodes;

public class CN {
    public static void main(String[] args) {
        CN obj=new CN();
        obj.p1();
    }
    void p1()
    {
        int []a={2,3,4,1};
        int []a2={2,4,1,1};
        int totalsum=0;
        int n=a.length;
        for (int i = 0; i <n; i++) {
            if (i<n-1)
            {
                int t1=a[i+1];
                int t2=a2[i+1];
                int s1=Math.abs(a[i]-a2[i])+Math.abs(a[i+1]-a2[i]);
                int s2=Math.abs(a[i]-a2[i])+Math.abs(a2[i+1]-a2[i]);
                if (!(s1>=s2))
                {
                    a[i+1]=t2;
                    a2[i+1]=t1;
                    totalsum=s2;
                }
                else {
                    totalsum=s1;
                }
            }
            else {
                totalsum+=Math.abs(a[i]-a2[i]);
            }
        }
        System.out.println(totalsum);

    }
}
