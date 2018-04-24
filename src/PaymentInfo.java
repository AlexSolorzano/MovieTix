public class PaymentInfo{
  
  private String cardNumber;
  private String expiration;
  private String cardCVC;
  private String coupon;

  public PaymentInfo(){};
  
  public PaymentInfo(String cardNumber, String expiration, String cardCVC, String coupon){

    this.cardNumber = cardNumber;
    this.expiration = expiration;
    this.cardCVC = cardCVC;
    this.coupon = coupon;
  }

  public String getCardCVC() {
    return cardCVC;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getCoupon() {
    return coupon;
  }
  public String getExpiration(){
    return expiration;
  }

  public void setCardCVC(String cardCVC) {
    this.cardCVC = cardCVC;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public void setCoupon(String coupon) {
    this.coupon = coupon;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }
}
