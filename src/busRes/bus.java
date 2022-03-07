package busRes;

public class bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    bus(int no,boolean ac,int cp){
        this.ac = ac;
        this.busNo = no;
        this.capacity = cp;
    }

    public int getBusNo(){
        return busNo;
    }

    public boolean isAc(){
        return ac;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setAc(boolean val){
        ac = val;
    }

    public void setCapacity(int cap){
        capacity = cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: "+busNo+" \nAc: "+ac+" \nTotal Capacity: "+capacity+"\n");
    }
}
