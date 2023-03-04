package list;

public class No<T> {
     private T data;
     private No<T> next;

     public No(T data){
         this.next = null;
         this.data = data;
     }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {

         int i = 1;
         String string = "O dado "+i+" =" + data + "\n";

         while (next != null){
             i++;
             string = string + "O dado "+i+" =" + next.data + "\n";

             next = next.next;

         }
         return string;
    }
}

