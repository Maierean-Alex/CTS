import java.util.HashMap;
import java.util.Map;

public class TreeGenerator {

    private Map<String, Tree> trees = new HashMap<>();

    public TreeGenerator(){

        trees.put("Pine", new Pine());
        trees.put("Coconut", new Coconut());

    }

    public Tree generateTree(String treeType, String leaves, String type) {
        try {
            Tree tree = trees.get(treeType).clone();
            tree.setLeaves(leaves);
            tree.setType(type);
            tree.generateTree();
            return tree;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error cloning report prototype: " + e.getMessage());
            return null;
        }
    }

}
