import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {

    public void miniMaxSum(List<Integer> arr) {
        long totalSum = totalSumOfArray(arr);
        List<Integer> sortedList = arr;
        sortedList.sort(Comparator.naturalOrder());
        long minimumSum = totalSum - arr.get(0);
        long maximumSum = totalSum - arr.get(4);

        System.out.println(maximumSum + " " + minimumSum);
    }

    public long totalSumOfArray(List<Integer> arr){
        long sum = 0;
        for ( int number: arr){
            sum = sum + number;
        }
        return sum;
    }

    public static void main(String[] args) {

        Application app = new Application();
        List<Integer> arr1 = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> arr2 = new ArrayList<>(List.of(5,4,3,2,1));

        //System.out.println(app.totalSumOfArray(arr1));
        app.miniMaxSum(arr1);
        app.miniMaxSum(arr2);

    }
}
