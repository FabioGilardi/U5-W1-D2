package com.epicode.U5D1.entities;

import com.epicode.U5D1.U5D1Application;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;
    @Autowired
    @Qualifier("ordine2")
    private Ordine ordine;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);
        Logger logger = ctx.getBean(Logger.class);
        menu.printMenu();
        logger.info("---ORDINE---");
        logger.info(" ");
        logger.info("Numero ordine: " + ordine.getNumeroOrdine());
        logger.info("Tavolo dell'ordine: " + ordine.getTavolo());
        logger.info("Coperti dell'ordine: " + ordine.getNumeroCoperti());
        logger.info("Stato dell'ordine: " + ordine.getStatoOrdine());
        logger.info("Ora di acquisizione: " + ordine.getOraAcquisizione());
        logger.info("Piatti ordinati: " + ordine.getItemList());
        logger.info("Spesa totale: " + ordine.getSpesaTotale() + "€");
    }
}
