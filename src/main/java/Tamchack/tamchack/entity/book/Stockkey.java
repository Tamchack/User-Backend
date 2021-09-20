package Tamchack.tamchack.entity.book;

import Tamchack.tamchack.entity.store.Store;
import lombok.Builder;

import java.io.Serializable;

@Builder
public class Stockkey implements Serializable {

    private Store store;

    private Book book;

}
