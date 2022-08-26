public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] weights = new int[] {90, 91, 93, 92, 85, 87, 88, 89, 0, 0 ,0 , 0};
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

    }
}