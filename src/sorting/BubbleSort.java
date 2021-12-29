package sorting;

public class BubbleSort {
    public static void main(String...args){

//        creating an array
        int[] elements = new int[5];

        elements[0] = 90;
        elements[1] = 34;
        elements[2] = 121;
        elements[3] = 56;
        elements[4] = 74;

//        printing array before sort
        StringBuilder strElements = new StringBuilder();
        for(int value : elements){
            strElements.append(String.valueOf(value));
        }
        System.out.println("Before Sorting --> "+strElements);

        strElements = new StringBuilder("");

//        sorting
        BubbleSort.bubbleSort(elements);

//        printing array after sort
        for(int value : elements){
            strElements.append(value).append(" ");
        }
        System.out.println("After Sorting --> "+strElements);

    }

    public static void bubbleSort(int[] array){
        int length = array.length;

        for(int i=0; i<length-1; i++){
            boolean alreadySorted = true;
            for(int j=0; j<length-1-i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    alreadySorted = false;
                }
            }
            if(alreadySorted)
                break;
        }
    }
}
