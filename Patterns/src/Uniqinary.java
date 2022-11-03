public class Uniqinary {

    public static void main(String[] args) {
        int a[]={1,2,1,4,5,6,18,2,9,6},tmp,j;
        System.out.println("The unq elements are : ");
        for (int i = 0; i < 10; i++) {
            tmp=0;
            for (j = 0; j < 10; j++) {
                if (i != j) {
                    if (a[i] == a[j]) {
                        tmp = 1;
                        break;
                    }
                }
            }
           if (tmp==0){
               System.out.println(a[i]);
           }
        }
    }
}
