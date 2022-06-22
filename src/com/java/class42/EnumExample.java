package com.java.class42;

import java.util.HashMap;
import java.util.Map;

public class EnumExample {
    public static void main(String[] args) {
        System.out.println("Opening banking input");
        Map<String, String> dataOnInputPage = enterDetailsOnInputPage();
        System.out.println("Click on transfer button");
        System.out.println("Validate review page is displayed");
        String reviewPageFromAcc = "434354365432";
        String reviewPageToAcc = "87654325674";
        String reviewPageAmount = "100";
        System.out.println(reviewPageFromAcc.equals(dataOnInputPage.get(InputPageFieldNames.FROM_ACCOUNT.toString())));
        System.out.println(reviewPageToAcc.equals(dataOnInputPage.get(InputPageFieldNames.TO_ACCOUNT.toString())));
        System.out.println(reviewPageAmount.equals(dataOnInputPage.get(InputPageFieldNames.AMOUNT.toString())));
    }

    public static Map<String, String> enterDetailsOnInputPage(){
        Map<String,String> dataOnInputPage = new HashMap<String,String>();
        String fromAcc = "434354365432";
        dataOnInputPage.put(InputPageFieldNames.FROM_ACCOUNT.toString(),fromAcc);

        System.out.println("Enter from account : "+fromAcc);
        String toAcc = "87654325674";
        dataOnInputPage.put(InputPageFieldNames.TO_ACCOUNT.toString(),toAcc);

        String amount = "100";
        System.out.println("Enter amount "+amount);
        dataOnInputPage.put(InputPageFieldNames.AMOUNT.toString(), amount);
        return dataOnInputPage;
    }


}
