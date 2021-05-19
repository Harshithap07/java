class InvoiceAmount{
public static void main(String args[]){
    int invoiceAmount = 30000;
    int inoviceAmount;
if(invoiceAmount<10000){
float gst=10000*0.10f;
float invoiceBillWithGST=invoiceAmount+gst;
System.out.println("invoiceAmount");
}
else if(invoiceAmount>10000 && invoiceAmount<=20000){
    float gst=20000*0.15f;
        int discount = 15;
    float invoiceBillWithGST=10000+(discount-15)*20000;
    System.out.println("invoiceAmount2");
}
else if(invoiceAmount>20000 && invoiceAmount<=30000){
    float gst=30000*0.18f;
        int discount = 18;
    float invoiceBillWithGST=20000+(discount-18)*30000;
    System.out.println("invoiceAmount3");
}
else if(invoiceAmount>30000){
    float gst=30000*0.20f;
    float invoiceBillWithGST=invoiceAmount+gst;
System.out.println("invoiceAmount4");
}
}
}