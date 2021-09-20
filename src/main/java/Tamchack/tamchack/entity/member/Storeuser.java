package Tamchack.tamchack.entity.member;

import Tamchack.tamchack.entity.store.Store;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Storeuser {

    @Id
    private String id;

    private String password;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "store_id")
    private Store store;
}
