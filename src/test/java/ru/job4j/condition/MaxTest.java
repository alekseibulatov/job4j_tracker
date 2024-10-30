package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void maxFourOrTwoIsFour() {
        Max max = new Max();
        int expected = 4;
        assertThat(max.max(4, 2)).isEqualTo(expected);
    }

    @Test
    void maxFourOrTwoOrSixIsSix() {
        Max max = new Max();
        int expected = 6;
        assertThat(max.max(4, 2, 6)).isEqualTo(expected);
    }

    @Test
    void maxThreeOrTwoOrSevenOrElevenIsEleven() {
        Max max = new Max();
        int expected = 11;
        assertThat(max.max(3, 2, 7, 11)).isEqualTo(expected);
    }
}