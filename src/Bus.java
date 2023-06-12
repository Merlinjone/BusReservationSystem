public class Bus {
    private int busNo;
    private boolean Ac;
    private int capacity;
Bus(int no,boolean ac,int cap){
    this.busNo=no;
    this.Ac=ac;
    this.capacity=cap;
}

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public boolean isAc() {
        return Ac;
    }

    public void setAc(boolean val) {
        Ac = val;
    }

    public void setBusNo(int no) {
        busNo = no;
    }
    public void displayBusinfo(){
        System.out.println("Bus no:"+busNo+"Ac:"+Ac+"TotalCapacity:"+capacity);
    }


    public int getbusNo() {
        return busNo;
    }
}
