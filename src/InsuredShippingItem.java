public class InsuredShippingItem extends ShippingItem {
  private double insuredAmount;
  
  public InsuredShippingItem(double w, double insAmt) {
    /* TO BE IMPLEMENTED IN PART B */
    super(w);
    this.insuredAmount = insAmt;
  }

  @Override
  public double getCost() {
    /* TO BE IMPLEMENTED IN PART C */
    return insuredAmount + getCost();
  }
  
  public void addMoreInsurance(double amt) {
    insuredAmount += amt;
  }
}