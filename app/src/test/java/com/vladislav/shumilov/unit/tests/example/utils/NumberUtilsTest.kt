package com.vladislav.shumilov.unit.tests.example.utils

import org.junit.Assert
import org.junit.Before
import org.junit.Test

private const val EVEN_NUMBER = 2
private const val ODD_NUMBER = 1

class NumberUtilsTest {

    private lateinit var numberUtils: NumberUtils

    @Before
    fun setUp() {
        //Arrange
        numberUtils = NumberUtils()
    }

    @Test
    fun `When an even number is passed to the isEven method then it returns true`() {
        //Act
        val result = numberUtils.isEven(EVEN_NUMBER)

        //Assert
        Assert.assertTrue(result)
    }

    @Test
    fun `When an odd number is passed to the isEven method then it returns false`() {
        //Act
        val result = numberUtils.isEven(ODD_NUMBER)

        //Assert
        Assert.assertFalse(result)
    }

    @Test
    fun `When the isEven method is called then the getDivisionOnTwoReminder method is called only onece `() {
        //Act
        val result = numberUtils.isEven(ODD_NUMBER)

        //Assert
        Assert.assertFalse(result)
    }
}