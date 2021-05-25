package banking.interfaces;

public interface IPay {
    public boolean spend(double amount);
    public int getNumber();
    public String getType();
}
