public class Prime_No {
    public static void main(String[] args){
        int count = 50;
        System.out.print("2 3 5 ");
        for(int i = 6; i < count; i++){
            if(i % 2 == 0 || i % 3==0 || i % 5 ==0){
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
