package adapter;

public class XPayToPayDAdapter implements PayD{
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    private final XPay xPay;

    public XPayToPayDAdapter(XPay xPay) {
        this.xPay = xPay;
        setProps();
    }


    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setProps() {
        setCardOwnerName(this.xPay.getCustomerName());
        setCustCardNo(this.xPay.getCreditCardNo());
        setCardExpMonthDate(this.xPay.getCardExpMonth() + "/" + this.xPay.getCardExpYear());
        setCVVNo(this.xPay.getCardCVVNo().intValue());
        setTotalAmount(this.xPay.getAmount());
    }
}
