package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @Test
    void testSolution01() {

        Integer result = Solution.search(new Integer[]{0,1}, 0);

        assertEquals(0, result);
    }

    @Test
    void testSolution02() {

        Integer result = Solution.search(new Integer[]{0,1,2,3,4,5,6}, 7);

        assertEquals(-1, result);
    }

    @Test
    void testSolutionExample01() {

        Integer result = Solution.search(new Integer[]{-1,0,3,5,9,12}, 9);

        assertEquals(9, result);
    }

    @Test
    void testSolutionExample02() {

        Integer result = Solution.search(new Integer[]{-1,0,3,5,9,12}, 2);

        assertEquals(-1, result);
    }

}