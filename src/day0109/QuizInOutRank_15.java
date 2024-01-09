package day0109;

public class QuizInOutRank_15 {
    public static void main(String[] args) {

        String [] name = {"홍수연","김수연","최수연","민수연"};
        int [] kor = {90,88,100,78};
        int [] eng = {100,55,100,87};
        int [] mat = {44,55,100,66};
        int [] sum = new int[4];
        double [] avg = new double[4];
        int [] rank = new int[4];

        /**
         *      번호  이름  국어  영어  구학  총점  평균  등수
         *      =========================================
         *
         */

        for(int i=0;i<4;i++){
            sum[i] = kor[i]+eng[i]+mat[i];
            avg[i] = sum[i]/3.0;
        }

        for(int i=0;i<4;i++){
            rank[i]=1;
            for(int j=0;j<4;j++){
                if(avg[i]<avg[j])
                    rank[i]++;
            }
        }

        System.out.println("번호\t\t이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t등수");
        System.out.println("=============================================================");
        for(int i=0;i<4;i++){
            System.out.printf("%d\t\t%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%d\n",i+1,name[i],kor[i],eng[i],mat[i],sum[i],avg[i],rank[i]);
        }

    }
}
