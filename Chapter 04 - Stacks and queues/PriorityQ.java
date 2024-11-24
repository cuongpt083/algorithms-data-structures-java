public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    //----------------------------- constructer
    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }
    //------------------------------ chen phan tu vao hang doi 
    public void insert(long item) {
        int j;

        if(nItems ==0) {
            queArray[nItems++] = item;
        } else {
            for (j=nItems-1 ;j>0;j--) {
                if(item > queArray[j]){
                    queArray[j+1] = queArray[j];
                }else{
                    break;
                }
            }
            queArray[j+1] = item;
            nItems++;
        }
    }

    //---------------------------------
    public long remove() {
        return queArray[--nItems];
    }
    //--------------------------------
    public long peekMin() {
        return queArray[nItems -1];
    }
    //-------------------------
    public boolean isEmpty(){
        return(nItems==0);
    }

    //-------------------------------
    public boolean isFull(){
        return(nItems == maxSize);
    }
    //--------------------------------
    //chen phan tu do uu tien cao
    public void priorityInsert(long item) {
        if(nItems == maxSize) {
            System.out.println("Mang da day phan tu");
        }else{
            queArray[nItems++] = item;
        }
    }

    public void priorityRemove() {
        int indexMax =0;
        if(nItems == 0) {
            System.out.println("Mang trong");
        }
        for (int i = 1; i < nItems; i++) {
            if (queArray[i] > queArray[indexMax]) {
                indexMax = i;  
            }
        }
        long temp = queArray[indexMax];
        queArray[indexMax] = queArray[nItems-1];
        queArray[nItems - 1 ] = temp;
        nItems--;
    }

    public void print(){
        for(int i = 0 ; i < nItems ; i++) {
            System.out.println(queArray[i] + " ");
        }
        System.out.println(" ");
    }
    
}
