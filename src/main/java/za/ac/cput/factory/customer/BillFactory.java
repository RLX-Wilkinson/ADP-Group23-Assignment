package za.ac.cput.factory.customer;

import za.ac.cput.entity.customer.Bill;
import za.ac.cput.util.GenericHelper;

public class BillFactory
{
    public static Bill build(double subTotal, double tax, double total)
    {
        String billID = GenericHelper.generateID();

        Bill bill = new Bill.Builder().setBillID(billID)
                .setSubTotal(subTotal).setTax(tax).setTotal(total).build();
        return bill;
    }
}
