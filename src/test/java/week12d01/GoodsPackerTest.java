package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsPackerTest {

    @Test
    void packGoodsTest() {
        GoodsPacker goodsPacker = new GoodsPacker();
        int [][] types = {{7, 160}, {3, 90}, {2, 15}};

        assertEquals(555, goodsPacker.packGoods(types, 20));
    }
}