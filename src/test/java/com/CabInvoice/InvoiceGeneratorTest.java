package com.CabInvoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    // for step 1
    @Test
    public void given_DistanceAndTime_ShouldReturn_TotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 5.0; //distance in kilometers
        int time = 10; //time in minutes
        double fare = invoiceGenerator.calculatefare(distance, time); //Total fare calculations
        Assertions.assertEquals(60 , fare);
    }
    @Test
    public void givenMultipleRides_shouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0 , 5),
                new Ride(5.0 , 10)};
        double fare = invoiceGenerator.calculatefare(rides);
        Assertions.assertEquals(85, fare);
    }
}
