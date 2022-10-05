public class Main {
    public static void main(String[] args) {


        int[] wei = new int[3];
        wei[0]= 1;
        wei[1]=2;
        wei[2]=3;
        System.out.print(wei[0] + "," + wei[1] + "," + wei[2]);
        System.out.println();
        System.out.print(wei[2] + "," + wei[1] + "," + wei[0]);


        System.out.println();
        double[] wei1 = {1.57, 7.654, 9.986};
        System.out.println(wei1[0] + "," + wei1[1] + "," + wei1[2]);
        System.out.println(wei1[2] + "," + wei1[1] + "," + wei1[0]);

        int[] numb= new int [3];
        numb [0]=1;
        int y = 0;
        if (numb[y]% 2 == 1) {
            numb[y]=numb[y]+1;
        }
        System.out.println(numb[y]);
    }
}