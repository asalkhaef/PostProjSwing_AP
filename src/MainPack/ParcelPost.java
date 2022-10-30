package MainPack;

public class ParcelPost implements Comparable<ParcelPost>{
    private Letter cargo;
    private String senderName;
    private String receiverName;
    private String senderAddress;
    private String receiverAddress;
    private Integer senderZC;
    private Integer receiverZC;
    private boolean isReturned;
    //...Constructor.....................
    public ParcelPost(Letter cargo, String senderName, String receiverName, String senderAddress,
                      String receiverAddress, Integer senderZC, Integer receiverZC, boolean isReturned) {
        this.cargo = cargo;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.senderZC = senderZC;
        this.receiverZC = receiverZC;
        this.isReturned = isReturned;
    }
    //.....Setter&Getter.................
    public Letter getCargo() {
        return cargo;
    }
    public String getSenderName() {
        return senderName;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public String getSenderAddress() {
        return senderAddress;
    }
    public String getReceiverAddress() {
        return receiverAddress;
    }
    public Integer getSenderZC() {
        return senderZC;
    }
    public Integer getReceiverZC() {
        return receiverZC;
    }
    public boolean isReturned() {
        return isReturned;
    }
    public void setCargo(Letter cargo) {
        this.cargo = cargo;
    }
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }
    public void setSenderZC(Integer senderZC) {
        this.senderZC = senderZC;
    }
    public void setReceiverZC(Integer receiverZC) {
        this.receiverZC = receiverZC;
    }
    public void setReturned(boolean returned) {
        isReturned = returned;
    }
    //.......toString.....................
    @Override
    public String toString() {
        return "MainPack.ParcelPost{" +
                "\n  cargo=" + cargo +
                "\n  senderName='" + senderName + '\'' +
                "\n  receiverName='" + receiverName + '\'' +
                "\n  senderAddress='" + senderAddress + '\'' +
                "\n  receiverAddress='" + receiverAddress + '\'' +
                "\n  senderZC=" + senderZC +
                "\n  receiverZC=" + receiverZC +
                "\n  isReturned=" + isReturned +
                '}';
    }

    @Override
    public int compareTo(ParcelPost o) {
        if(this.cargo.getPriority() > o.cargo.getPriority())
            return 1;
        else if(this.cargo.getPriority() < o.cargo.getPriority())
            return -1;
        return 0;
    }
}
