package Tamchack.tamchack.entity.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Store {

    @Id
    private int id;

    private String name;

    private String address;

    private String timezone;

    private String number;

    private boolean report;

    private double lat;

    private double lng;
}
