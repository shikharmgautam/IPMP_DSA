// User function Template for Java
// User function Template for Java



// class Pair<K, V> {
//     private final K key;
//     private final V value;

//     public Pair(K key, V value) {
//         this.key = key;
//         this.value = value;
//     }

//     public K getKey() {
//         return key;
//     }

//     public V getValue() {
//         return value;
//     }
// }
/*
Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    // Function to find minimum and maximum element in an array
    public static <K, V> Pair<K,V> getMinMax(int[] arr) {
        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];
        
        // Traverse the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Return min and max as a Pair object
        return new Pair(min, max);
    }
}