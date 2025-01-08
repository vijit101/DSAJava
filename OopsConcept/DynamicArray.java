package OopsConcept;

public class DynamicArray {
    private int len = 5;
    private int size = 0;
    int arr[];
    public DynamicArray(int initLen) {
        this.len = initLen;
        arr = new int[len];

    }

    public DynamicArray(){
        arr = new int[len];
    }

   


    public void addElement(int elem){
        if(size >= arr.length-1){
            int newarr[] = new int[len*2];
            for(int i=0;i<arr.length;i++){
                newarr[i] = arr[i];
            }
            arr = newarr;
            // int temp[] = arr[]
            // arr = new int[len*2]
            // for loop copy elem to arr  
        }

        arr[size] = elem;
        size++;
        
    }

    public void removeElement(){
        while(!this.isEmpty()){
            size--;
        }
    }

    public int GetSize(){
        return this.size;
    }
    
    public int getValueAtIndex(int indx){
        if(indx <=size){
            return arr[indx];
        }else{
            System.out.print("invalid index");
            return -1;
        }

    }
    public int setValueAtIndex(int indx,int val){
        return arr[indx] = val;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
}
