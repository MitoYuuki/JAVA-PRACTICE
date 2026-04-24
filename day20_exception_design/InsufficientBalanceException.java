package day20_exception_design;

public class InsufficientBalanceException extends Exception{
  public InsufficientBalanceException(String message){
    super(message);
  }
}
