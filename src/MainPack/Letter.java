package MainPack;

public class Letter extends Data<String> {
    private String letterContent;
    private Integer receiverZC;
    private Integer senderZC;
    private int priority;
    private String letterCode;
    //...Constructor......................

    public Letter(String letterContent, Integer receiverZC, Integer senderZC, int priority, String letterCode) {
        super(letterCode);
        this.letterContent = letterContent;
        this.receiverZC = receiverZC;
        this.senderZC = senderZC;
        this.priority = priority;
        this.letterCode = letterCode;
    }

    //.....Setter&Getter..................
    public String getLetterContent() {
        return letterContent;
    }
    public Integer getReceiverZC() {
        return receiverZC;
    }
    public Integer getSenderZC() {
        return senderZC;
    }
    public int getPriority() {
        return priority;
    }
    public String getLetterCode() {
        return letterCode;
    }
    public void setLetterContent(String letterContent) {
        this.letterContent = letterContent;
    }
    public void setReceiverZC(Integer receiverZC) {
        this.receiverZC = receiverZC;
    }
    public void setSenderZC(Integer senderZC) {
        this.senderZC = senderZC;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void setLetterCode(String letterCode) {
        this.letterCode = letterCode;
    }
    //.......toString........................
    @Override
    public String toString() {
        return "MainPack.Letter{" +
                "\n  key=" + key +
                "\n  letterContent='" + letterContent + '\'' +
                "\n  receiverZC=" + receiverZC +
                "\n  senderZC=" + senderZC +
                "\n  priority=" + priority +
                "\n  letterCode='" + letterCode + '\'' +
                '}';
    }

}
