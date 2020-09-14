import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinesveiperTest {
    @Test
    void shouldShowEmptyMineField(){
    assertArrayEquals(new String[]{ "000", "000"}, displayMinefield(new String[] {"...", "..."}));
    }

    @Test
    void shouldShowNumberOfRows(){
        assertArrayEquals(new String[] {"000", "000", "000"}, displayMinefield(new String[] {"...", "...", "..."}));
    }

    @Test
    void shouldShowNumberOfColumns(){
        assertArrayEquals(new String[] {"0000"}, displayMinefield(new String[] {"...."}));
    }

    @Test
    void itShowsMines(){
        assertArrayEquals(new String[] {"***"}, displayMinefield(new String[] {"***"}));
    }

    @Test
    void isShowsHintsOnRowOfMine(){
        assertArrayEquals(new String[] {"01*10"}, displayMinefield(new String[] {"..*.."}));
    }

    @Test
    void itShowsHintOnColOfMine(){
        assertArrayEquals(new String[] {"0", "1", "*", "1", "0"}, displayMinefield(new String[] {".", ".", "*", ".", "."}));
    }

    @Test
    void itShowsHintsAroundMine(){
        assertArrayEquals(new String[] { "111", "1*1", "111"}, displayMinefield(new String[] { "...", ".*.", "..."}));
    }

    @Test
    void itCountsMinesAroundCell(){
        assertArrayEquals(new String[] {"***", "*8*", "***"}, displayMinefield(new String[] {"***", "*.*", "***"}));
    }


    private String[] displayMinefield(String[] input){
        return new MineField(input).displayMinefield();
    }
}
