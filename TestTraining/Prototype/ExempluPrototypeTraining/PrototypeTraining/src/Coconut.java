public class Coconut implements Tree{

    private String leaves;
    private String type;

    @Override
    public void setLeaves(String leaves) { this.leaves = leaves; }

    @Override
    public void setType(String type) { this.type = type; }

    @Override
    public void generateTree() {

        System.out.println("A new " + type + " tree with the color of leaves: " + leaves +
                ", has been generated!");

    }

    @Override
    public Tree clone() throws CloneNotSupportedException {
        return (Tree) super.clone();
    }
}
