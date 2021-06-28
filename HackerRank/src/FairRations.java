import java.util.List;

public class FairRations {

    public static String fairRations(List<Integer> B) {

        int sum = 0;
        for (int loaves : B) sum += loaves;
        if (sum % 2 == 1) return "NO"; //unsolvable

        int count = 0;
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i) % 2 != 0) {
                B.set(i, (B.get(i) + 1));
                B.set(i+1, (B.get(i+1) + 1));
                count += 2;
            }
        }

        return Integer.toString(count);
    }
}
