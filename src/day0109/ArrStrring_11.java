package day0109;

public class ArrStrring_11 {
    public static void main(String[] args) {
        // 문자열 배열
        String [] str1 = {"텀블러","키보드","핸드크림","칫솔","우산"};
        String [] strColors = {"red","pink","blue","yellow","gray","white"};

        // str1은 1번째: 텀블러
        for(int i=0;i< str1.length;i++){
            System.out.println((i+1)+"번째: "+str1[i]);
        }
        System.out.println();
        int cnt=1;
        for(String s:str1){
            System.out.println(cnt+"번째: "+s);
            cnt++;
        }

        // strColors 0번지색: red
        for(int i=0;i< strColors.length;i++){
            System.out.println(i+"번지색: "+strColors[i]);
        }
        System.out.println();
        int cntColor=0;
        for(String s:strColors){
            System.out.println(cntColor+"번지색: "+s);
            cntColor++;
        }

    }
}
