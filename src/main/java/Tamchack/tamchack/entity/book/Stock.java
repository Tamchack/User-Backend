package Tamchack.tamchack.entity.book;

import Tamchack.tamchack.entity.store.Store;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Getter
@IdClass(Stockkey.class)
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

    @Id
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "store_id")
    private Store store;

    @Id
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "book_id")
    private Book book;

}
