package adapter;

public class RunAdapterExample {
    public static void main(String[] args) {
        //Object for XPay
        XPay xpay=new XPayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("MaxWarner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);
        PayD payD=new XPayToPayDAdapter(xpay);
        testPayD(payD);

    }
    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
