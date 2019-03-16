import java.util.*;
import java.util.List;

class Driver {
    public static void main(String[] args) {

        try {

            System.out.println("\n"+"************************Object Cloning***********************");
            //Creating address object as customer has reference to it
            Address<String, Integer> address = new Address("Texas", "Houston", "Harris", 77085);

            //Creating customer object
            Customer oldObj = new Customer(1, "485-256-4897", "Uhcl@gmail.com", address);

            //Clone method to copy Customer Objects//
            //Cloning the customer object to new object
            Customer newObj = (Customer) oldObj.clone();


            System.out.println("Old Object parameters are:");
            System.out.println(oldObj.getId());
            System.out.println(oldObj.getPhone());
            System.out.println(oldObj.getEmail());
            System.out.println(oldObj.getAddress());

            System.out.println("\n" + "New Object parameters after cloning are:");
            System.out.println(newObj.getId());
            System.out.println(newObj.getPhone());
            System.out.println(newObj.getEmail());
            System.out.println(newObj.getAddress());

            System.out.println("\n"+"*********************Comaparable(With number)**********************");
            //Creating a list of order objects
            Order[] orderArray = new Order[5];
            orderArray[0] = new Order("A10", "2/23/2019", "2/23/2019", 20, address, OrderStatus.Delivered);
            orderArray[1] = new Order("C10", "2/23/2019", "2/23/2019", 20, address, OrderStatus.Hold);
            orderArray[2] = new Order("B10", "2/23/2019", "2/23/2019", 20, address, OrderStatus.New);
            orderArray[3] = new Order("K10", "2/23/2019", "2/23/2019", 20, address, OrderStatus.Delivered);
            orderArray[4] = new Order("E10", "2/23/2019", "2/23/2019", 20, address, OrderStatus.Hold);

            //Sorting order objects using comparable
            Arrays.sort(orderArray);
            for (Order s : orderArray) {
                System.out.print("\n" + s.toString());
            }
            System.out.println("\n");
            System.out.println("\n"+"*********************Name Comparator(With name)*******************");

            //Creating objects for supplier as product contains supplier
            Supplier supplier1 = new Supplier("AbcCompany", "PearLand");
            Supplier supplier2 = new Supplier("cdeCompany", "cleaveLand");
            Supplier supplier3 = new Supplier("fghCompany", "clearLake");

            //Creating an array to store products
            Product[] productArray = new Product[5];
            productArray[0] = new Product("P90", "ZProductOne", supplier1);
            productArray[1] = new Product("P00", "AProductOne", supplier2);
            productArray[2] = new Product("P11", "GProductOne", supplier3);
            productArray[3] = new Product("P02", "CProductOne", supplier2);
            productArray[4] = new Product("P16", "BProductOne", supplier1);

            //Sorting Product objects using comparator based on their id(String)
            Arrays.sort(productArray, Product.NameComparator);
            for (Product s : productArray) {
                System.out.print("\n" + s.toString());
            }
            System.out.println("\n");
            System.out.println("\n"+"*********************Bounded Types*******************");

            //Using Bounded generic type paasing the object of webuser
            User<WebUser> webUser = new User<WebUser>(new WebUser());
            //Calling the method dorunTest by User extending webUser
            webUser.doRunTest();

            //Using Bounded generic type paasing the object of webuser
            User<StudentUser> studentUser = new User<StudentUser>(new StudentUser());
            //Calling the method dorunTest by StudentUser extending webUser
            studentUser.doRunTest();

            //Using Bounded generic type paasing the object of webuser
            User<StaffUser> staffUser = new User<StaffUser>(new StaffUser());
            //Calling the method dorunTest by StaffUser extending webUser
            staffUser.doRunTest();

            System.out.println("\n"+"*********************Wild Cards(Upper)*******************");

            //Creating a list of Account objects
            List<Account> accountList = new ArrayList<>();
            Account accountObj1 = new Account("AID01", address, true, new java.util.Date(02 / 25 / 2019), new java.util.Date(05 / 25 / 2019), address);
            Account accountObj2 = new Account("AID02", address, false, new java.util.Date(01 / 25 / 2016), new java.util.Date(02 / 25 / 2019), address);
            Account accountObj3 = new Account("AID03", address, true, new java.util.Date(05 / 25 / 2010), new java.util.Date(02 / 25 / 2019), address);
            Account accountObj4 = new Account("AID04", address, false, new java.util.Date(01 / 25 / 2015), new java.util.Date(02 / 25 / 2019), address);

            //Adding objects to account list
            accountList.add(accountObj1);
            accountList.add(accountObj2);
            accountList.add(accountObj3);
            accountList.add(accountObj4);

            Address<String, Integer> newaddress = new Address("California", "Milpitas", "Harris", 77089);

            //Creating a list of Account objects
            List<ParentAccount> parentaccountList = new ArrayList<>();
            ParentAccount parentaccountObj1 = new ParentAccount("PAID01", address, true, new java.util.Date(02 / 25 / 2019), new java.util.Date(05 / 25 / 2019));
            ParentAccount parentaccountObj2 = new ParentAccount("PAID02", address, false, new java.util.Date(01 / 25 / 2016), new java.util.Date(02 / 25 / 2019));
            ParentAccount parentaccountObj3 = new ParentAccount("PAID03", address, true, new java.util.Date(05 / 25 / 2010), new java.util.Date(02 / 25 / 2019));
            ParentAccount parentaccountObj4 = new ParentAccount("PAID04", address, false, new java.util.Date(01 / 25 / 2015), new java.util.Date(02 / 25 / 2019));

            //Adding objects to account list
            parentaccountList.add(parentaccountObj1);
            parentaccountList.add(parentaccountObj2);
            parentaccountList.add(parentaccountObj3);
            parentaccountList.add(parentaccountObj4);

            //Method which has a list whose object class extending a class to implemet upper wild card
            //Calling through subtype
            accountObjectArray(accountList);

            //Method which has a list whose object class extending a class to implemet upper wild card
            //Calling through supertype
            accountObjectArray(parentaccountList);

            System.out.println("\n"+"*********************Wild Cards(Lower)*******************");

            //Creating a list of Account objects
            Collection<CashPayment> cashPayments = new ArrayList<CashPayment>();
            CashPayment cashPayment1 = new CashPayment("CASHPMNT01", new java.util.Date(02 / 25 / 2016), "150", "paidcash");
            CashPayment cashPayment2 = new CashPayment("CASHPMNT21", new java.util.Date(02 / 25 / 2018), "190", "Paidcash");
            CashPayment cashPayment3 = new CashPayment("CASHPMNT87", new java.util.Date(02 / 25 / 2011), "190", "Paidcash");
            CashPayment cashPayment4 = new CashPayment("CASHPMNT00", new java.util.Date(02 / 25 / 2014), "190", "Paidcash");

            //Adding objects to cashpayments list
            cashPayments.add(cashPayment1);
            cashPayments.add(cashPayment2);
            cashPayments.add(cashPayment3);
            cashPayments.add(cashPayment4);

            //Creating a list of Payment objects
            Collection<Payment> payments = new ArrayList<Payment>();
            Payment payment1 = new Payment("PMNT01", new java.util.Date(02 / 25 / 2019), "190", "Paid");
            Payment payment2 = new Payment("PMNT21", new java.util.Date(02 / 25 / 2018), "1000", "Paid");
            Payment payment3 = new Payment("PMNT87", new java.util.Date(02 / 25 / 2011), "19", "Paid");
            Payment payment4 = new Payment("PMNT00", new java.util.Date(02 / 25 / 2014), "200", "Paid");

            //Adding objects to payment list
            payments.add(payment1);
            payments.add(payment2);
            payments.add(payment3);
            payments.add(payment4);

            //Method which has a list whose object class supers a class to implement lower wild card
            //Calling through actual type
            paymentObjectArray(payments);
            //Method which has a list whose object class supers a class to implement upper wild card
            //Calling through supertype
            paymentObjectArray(cashPayments);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //A method implenting upper wildcard
    public static void accountObjectArray(List<? extends ParentAccount> list) {
        System.out.println("Using Upper wild card");
        System.out.println("Objects in list are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("\n");
            System.out.println("id is " + list.get(i).getId().toString());
            System.out.println("Billing Address is " + list.get(i).getBilling_address());
            System.out.println("Account State is " + list.get(i).getIsClosed().toString());
            System.out.println("Account closing date is " + list.get(i).getClosed().toString());
            System.out.println("Account Open date is " + list.get(i).getOpen().toString());
        }
    }

    //a method implenting lower wild card
    public static void paymentObjectArray(Collection<? super CashPayment> list) {
        System.out.println("Using Lower wild card");
        System.out.println("Objects in list are:");
        Iterator<? super CashPayment> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}
