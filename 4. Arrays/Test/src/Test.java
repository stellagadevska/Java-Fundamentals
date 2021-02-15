import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Integer[] ID1={19,20,12,13,14};

        Integer[] ID2={10,11,12,13,15};

        Set<Integer> union = new HashSet<Integer>(Arrays.asList(ID1));
        union.addAll(Arrays.asList(ID2));

        Set<Integer> intersection = new HashSet<Integer>(Arrays.asList(ID1));
        intersection.retainAll(Arrays.asList(ID2));

        union.removeAll(intersection);
    }
}