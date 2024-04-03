package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.StatoOrdine;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;

    @Setter(AccessLevel.NONE)
    private LocalTime oraAcquisizione;

    private double costoCoperto;
    private double spesaTotale;
    private Tavolo tavolo;
    private List<Item> itemList;

    //    CONSTRUCTORS
    public Ordine(int numeroOrdine, StatoOrdine statoOrdine, Tavolo tavolo, List<Item> itemList, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.tavolo = tavolo;
        this.itemList = itemList;
        this.costoCoperto = costoCoperto;
        setRandomCoperti();
        calcoloSpesaTotale();
        setOraAcquisizione();
    }

    //    METHODS
    public void setRandomCoperti() {
        Random random = new Random();
        this.numeroCoperti = random.nextInt(1, this.tavolo.getCopertiMax() + 1);
    }

    public void calcoloSpesaTotale() {
        this.spesaTotale = this.numeroCoperti * this.costoCoperto + this.itemList.stream().mapToDouble(Item::getPrice).sum();
    }

    public void setOraAcquisizione() {
        this.oraAcquisizione = LocalTime.now();
    }
}
