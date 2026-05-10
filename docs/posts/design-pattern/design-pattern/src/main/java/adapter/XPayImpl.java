package adapter;

public class XPayImpl implements XPay {
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;
    
    @Override
    public String getCreditCardNo() {
        return this.creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public String getCardExpMonth() {
        return this.cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.cardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return this.cardCVVNo;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
