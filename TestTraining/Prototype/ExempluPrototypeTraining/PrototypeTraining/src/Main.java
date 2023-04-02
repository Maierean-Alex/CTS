public class Main {
    public static void main(String[] args) {

        TreeGenerator treeGenerator = new TreeGenerator();
        Tree firstTree = treeGenerator.generateTree("Pine", "Red", "Coconut");
        Tree secondTree = treeGenerator.generateTree("Coconut", "Bright Green", "Pine");

    }
}