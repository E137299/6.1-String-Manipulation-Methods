import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest{

    @Test
    public void testReverse1() {
        String rev = Main.reverseString("hello");
        assertEquals(rev,"olleh");
    }

    @Test
    public void testReverse2() {
        String rev = Main.reverseString("Austin");
        assertEquals(rev,"nitsuA");
    }

    @Test
    public void testIsPalindrome1() {
        boolean pal = Main.isPalindrome("never odd or even");
        assertEquals(pal, true);
    }

    @Test
    public void testIsPalindrome2() {
        boolean pal = Main.isPalindrome("Austin");
        assertEquals(pal, false);
    }

    @Test
    public void testConvertToPigLatin1() {
        String pig = Main.convertToPigLatin("Can you help me?");
        assertEquals(pig, "Ancay ouyay elphay emay?");
    }

    @Test
    public void testConvertToPigLatin2() {
        String pig = Main.convertToPigLatin("Am I winning?");
        assertEquals(pig, "Amyay Iyay inningway?");
    }

    @Test
    public void testConvertToShorthand1() {
        String pig = Main.convertToShorthand("Are you going to the park for fun and games?");
        assertEquals(pig, "Ar u gng 2 th prk 4 fn & gms?");
    }

    @Test
    public void testConvertToShorthand2() {
        String pig = Main.convertToShorthand("I could use lunch and a nap. How about you?");
        assertEquals(pig, "I cld us lnch & a np. Hw abt u?");
    }
    
}