public class CommonElementBetweenTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Common elements between the two arrays:");
        findCommonElements(array1, array2);
    }

    private static void findCommonElements(int[] array1, int[] array2) {
        for(int j=0;j<array1.length;j++){
            for(int k=0;k<array2.length;k++){
                if(array1[j]==array2[k])
                    System.out.println(array1[j]);
            }
        }
    }

}
