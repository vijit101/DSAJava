package HashmapUse;
import java.util.ArrayList;


public class Myhashmap<K,V> {

    public static void main(String[] args) {
        Myhashmap<String,Integer> hmap = new Myhashmap<>();
        hmap.insert("abc", 10);
        hmap.insert("dnd", 20);
        hmap.insert("abd", 30);
        hmap.insert("abd", 45);
        hmap.insert("ocd", 69);
        hmap.insert("dragon", 7);
        System.out.println(hmap.getValue("abd"));
    }

    ArrayList<MapNode<K,V>> buckets;
    int length = 0;
    int numBuckets = 20;

    public Myhashmap(){
        buckets = new ArrayList<>();
        numBuckets = 5;
        int i = 0;
        while(i<numBuckets){
            buckets.add(null);
            i++;
        }
    }
    private void rehash(){
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<>();
        numBuckets*=2;
        int j = 0;
        while(j<numBuckets){
            buckets.add(null);
            j++;
        }
        length = 0;
        for(int i=0;i<temp.size();i++){
            MapNode<K,V> head = temp.get(i);
            while(head!=null){
                K key = head.key;
                V val = head.value;
                insert(key, val);
                head = head.next;
            }
        }
    }
    public void insert(K key,V value){
        int bucketIndex = hashFunction(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        // if(head == null){
        //     head.key = key;
        //     head.value = value;
        //     buckets.add(head);
        //     return;
        // }
        while(head!=null){
            if(head.key.equals(key)){ // as == compared addresses and it would mean the value is not compared 
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K,V> newmapNode = new MapNode<>(key,value);
        //MapNode<K,V> headnodenext = head.next;
        newmapNode.next = head;
        buckets.set(bucketIndex, newmapNode);
        length++;
        double loadFac = (1.0*length)/(1.0*numBuckets);
        if(loadFac>0.7){
            rehash();
        }
    }

    private int hashFunction(K key){
        int hc = key.hashCode();
        int indx = hc % numBuckets; // compression 
        return indx;
    }

    public int size(){
        return length;
    }

    public V getValue(K key){
        int bucketIndex = hashFunction(key);
        MapNode<K,V> head = buckets.get(bucketIndex);      
        while(head!=null){
            if(head.key.equals(key)){ // as == compared addresses and it would mean the value is not compared 
               return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removeKey(K key){
        int bucketIndex = hashFunction(key);
        MapNode<K,V> head = buckets.get(bucketIndex); 
        V finalval = null;  
        MapNode<K,V> prevNode = null;
        // if key is the first element of the hash map then prev is null
        if(head!=null && head.key.equals(key)){
            finalval = head.value;
            buckets.set(bucketIndex, head.next);
            length--;
            return finalval;
        }

        while(head!=null){
            if(head.key.equals(key)){ // as == compared addresses and it would mean the value is not compared              
                finalval = head.value;
                prevNode.next = head.next;
                head.next = null;   
                length--;
            }
            prevNode = head;
            head = head.next;
        }
        
        return finalval;
    }
    
}
