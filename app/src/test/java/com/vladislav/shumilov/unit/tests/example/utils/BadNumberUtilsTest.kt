package com.vladislav.shumilov.unit.tests.example.utils

import org.junit.Assert
import org.junit.Before
import org.junit.Test

private const val EVEN_NUMBER = 2
private const val ODD_NUMBER = 1

class BadNumberUtilsTest {

    private lateinit var numberUtils: NumberUtils

    @Before
    fun setUp() {
        //Arrange
        numberUtils = NumberUtils()
    }

    @Test
    fun `When an even number is passed to the isEven method then it returns true`() {
        //Act
        val evenResult = numberUtils.isEven(EVEN_NUMBER)
        val oddResult = numberUtils.isEven(ODD_NUMBER)

        //Assert
        Assert.assertTrue(evenResult)
        Assert.assertFalse(oddResult)
    }
}