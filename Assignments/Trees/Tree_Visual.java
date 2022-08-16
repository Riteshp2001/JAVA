package Trees;

import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}


public class Tree_Visual {

//        static int maxLoot(int[] val,int n){
//        if(n<0)return 0;
//        if(n==0)return val[0];
//        int pick = val[n]+maxLoot(val,n-2);
//        int notpick = maxLoot(val,n-1);
//        return Math.max(pick,notpick);
//    }
    static Node createTree() {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter data");
        int data = sc.nextInt();
        if(data==-1)return null;
        root = new Node(data);
        System.out.println("Enter Left data of "+data);
        root.left = createTree();
        System.out.println("Enter Right data of "+data);
        root.right = createTree();
        return root;
    }

    static void inOrder(Node root){
        if(root == null)return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null)return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null)return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    static int binaryHeight(Node root){
        if(root == null)return 0;
        return Math.max(binaryHeight(root.left),binaryHeight(root.right))+1;
    }

    static int binarySize(Node root){
        if(root == null)return 0;
        return binaryHeight(root.left)+binaryHeight(root.right)+1;
    }

    static int binaryMaximumElem(Node root){
        if(root == null)return 0;
        return Math.max(root.data,Math.max(binaryMaximumElem(root.left),binaryMaximumElem(root.right)));
    }

    static void levelOrder(Node root,int lvl){
        if(root == null)return;
        if(lvl == 1){
            System.out.print("level "+lvl+"data is : "+root.data+" ");
        }else{
            levelOrder(root.left,lvl-1);
            levelOrder(root.right,lvl-1);
        }
    }

    static void levelOrderusingQueue(Node root){
        int i =1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr==null){
                if(q.isEmpty()){
                    return ;
                }
                q.add(null);
                System.out.println();
                i++;
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        System.out.println("Total levels in Binary tree are: "+i);
    }

    static void levelOrderusingHashmap(Node root){
        HashMap<Integer, List<Integer>>map = new HashMap<>();
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        int level = 0;
        map.put(level,new ArrayList<>());
        map.get(level).add(root.data);
        level++;
        int nullCount = 0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                nullCount++;
                level++;
                if(nullCount==2){
                    break;
                }
                q.add(null);
            }else{
                if(map.get(level)==null){
                    map.put(level,new ArrayList<>());
                }else{
                    map.get(level).add(curr.data);
                }
                nullCount = 0;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        map.forEach((key, val) -> {
            System.out.print(key + " : ");
            val.forEach(value -> System.out.print(value + " "));
            System.out.println();
        });
    }


//NET solution
    private static void addIntoLevelMap(Map<Integer, List<Integer>> map, int level, int data) {

        if(map.get(level) == null){
            map.put(level, new ArrayList<>());
        }
        map.get(level).add(data);

    }

    public static void levelOrderTraversalWithHashMap(Node root){
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        queue.add(null);
        int nullCount = 1;
        while(!queue.isEmpty()){
            Node node = queue.remove();//or q.poll();
            if(node == null){
                ++nullCount;
                ++level;
                if(nullCount == 2){
                    break;
                }
                queue.add(null);
            }else {
                addIntoLevelMap(map, level, node.data);
                nullCount = 0 ;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        map.entrySet().stream().forEach(entry -> {
            System.out.print(entry.getKey() + " : ");
            entry.getValue().forEach(value -> System.out.print(value + " "));
            System.out.println();
        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);//LNR
        System.out.println();
        preOrder(root);//NLR
        System.out.println();
        postOrder(root);//LRN
        System.out.println();
        System.out.println("height of Binary tree is :"+binaryHeight(root));
        levelOrder(root,3);
        System.out.println();
        levelOrderusingQueue(root);
        System.out.println();
//        levelOrderusingHashmap(root); //need some correction
        levelOrderTraversalWithHashMap(root);
    }
}
