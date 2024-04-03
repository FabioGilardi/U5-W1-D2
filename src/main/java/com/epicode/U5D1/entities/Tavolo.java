package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.StatoTavolo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tavolo {
    private int numeroTavolo, copertiMax;
    private StatoTavolo statoTavolo;
}

