package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void contextLoads() {

    }
    @Test
    void testInvoiceDaoSave() {
        // given
        Product product1 = new Product("chair");
        Product product2 = new Product("table");

        Item item1 = new Item(new BigDecimal(50.00), 3, new BigDecimal(150.00));
        Item item2 = new Item(new BigDecimal(200.00), 1, new BigDecimal(200.00));
        Item item3 = new Item(new BigDecimal(300.00), 2, new BigDecimal(600.00));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);

        Invoice invoice1 = new Invoice("FVH12345");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        //when
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //then
        assertNotEquals(0, invoice1Id);

        //cleanUp
        try {
            invoiceDao.deleteById(invoice1Id);
        } catch (Exception e) {
            //do nothing
        }

    }

}
