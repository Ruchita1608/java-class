package org.example;

import org.junit.jupiter.api.Test;

import static org.example.HappyLlamas.areTheLlamasHappy;
import static org.junit.jupiter.api.Assertions.*;

class HappyLlamasTest {
    @Test
    public void testNormalTrampoline10() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 10;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertFalse( result , "10 Llamas w/ Normal Trampolines should be Unhappy!" );
    }

    @Test
    public void testNormalTrampoline25() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 25;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "25 Llamas w/ Normal Trampolines should be happy!" );
    }

    @Test
    public void testNormalTrampoline24() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 24;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "24 Llamas w/ Normal Trampolines should be happy!" );
    }
    @Test
    public void testNormalTrampoline10true() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 10;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertFalse( result , "10 Llamas w/ Bouncy Trampolines should be Unhappy!" );
    }

    @Test
    public void testNormalTrampoline25true() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 25;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = HappyLlamas.areTheLlamasHappy(isNasaFabric,numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "25 Llamas w/ Bouncy Trampolines should be happy!" );
    }

    @Test
    public void testNormalTrampoline24true() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 24;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "24 Llamas w/ Bouncy Trampolines should be happy!" );
    }

    @Test
    public void testNormalTrampoline50true() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 50;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertFalse( result , "50 Llamas w/ Bouncy Trampolines should be Unhappy!" );
    }

    @Test
    public void testNormalTrampoline42true() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 42;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "42 Llamas w/ Bouncy Trampolines should be happy!" );
    }

    @Test
    public void testNormalTrampoline42() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 42;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "42 Llamas w/ Bouncy Trampolines should be happy!" );
    }

    @Test
    public void testNormalTrampoline50() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 50;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertFalse( result , "50 Llamas w/ Bouncy Trampolines should be Unhappy!" );
    }
}