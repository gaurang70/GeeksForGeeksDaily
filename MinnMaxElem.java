class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}



class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        // int a[]={1,5,41,665,441,0,8,4,-1};

        for (int n : arr) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        return new Pair<>(min, max);
    }
}
public class MinnMaxElem extends Solution {

    public static void main(String[] args) {
        Solution s=new Solution();
        int a[]={1,5,41,665,441,8,4,1};
        Pair<Integer, Integer> result=s.getMinMax(a);
        System.out.println("minimum "+result.getKey());
        System.out.println("maximum "+result.getValue());
        
        
    }
}