import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SCC {
    private String input_file;
    private int[] sccList;
    private List<Integer> finishOrder;
    private Map<Integer, List<Integer>> graph;
    public SCC(String input_file) {
        this.input_file=input_file;
        sccList = new int[5];
        finishOrder = new ArrayList<>();
        graph = new HashMap<>();

    }
    public void inputFile() {
        
    }

}
