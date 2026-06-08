package com.example.kaidasubirserver.domain.item.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Table
public class Item {

    @Id

    @Setter
    private int Wkey;

    @Setter
    private int Akey;

    @Setter
    private int Skey;

    @Setter
    private int Dkey;

}
