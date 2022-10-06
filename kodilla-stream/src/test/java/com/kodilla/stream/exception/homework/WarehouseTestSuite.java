package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTestSuite {

    @Test
    public void testDoesOrderExist()throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("15"));
        //when
        Order order = warehouse.getOrder("12");
        //then
        assertEquals(new Order("12"),order);
    }
    @Test
    public void testShouldNotFindOrder(){
        //given
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class,()-> warehouse.getOrder("Jajko"));
    }
}