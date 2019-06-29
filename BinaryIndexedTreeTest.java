

class BinaryIndexedTree{

    private int[] data;

    public BinaryIndexedTree(int capacity) {
        this.data = new int[capacity+1];
    }

    public void update(int i, int value) {

        while(i<data.length) {
            data[i] += value;
            i += i & -i;
        }
    }

    public int query(int i) {
        int sum = 0;

        while (i > 0) {
            sum += data[i];
            i -= i & -i;
        }
        return sum;
    }
}



public class BinaryIndexedTreeTest {
    public static void main(String[] args) {
        
        int[] originArray = new int[]{1,2,3,4,5,6,7,8}; 
        BinaryIndexedTree tree = new BinaryIndexedTree(8);
        
        for (int i = 0;i < originArray.length;i++)
            tree.update(i+1, originArray[i]);


        // get sum from index 3 to 6
        System.out.println(tree.query(6)-tree.query(2));

    }

}