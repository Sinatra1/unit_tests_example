package com.vladislav.shumilov.unit.tests.example.utils

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule
import org.mockito.kotlin.never
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import org.mockito.quality.Strictness

private const val ONE_ITEM_COUNT = 1

class GalleryUtilsTest {

    @get:Rule
    val mockitoRule: MockitoRule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS)

    @Mock
    private lateinit var numberUtils: NumberUtils

    @InjectMocks
    private lateinit var galleryUtils: GalleryUtils

    @Test
    fun `When 1 number are passed to the gallery and want to print only even numbers then the printItem method is not called`() {
        whenever(numberUtils.isEven(ONE_ITEM_COUNT)).thenReturn(false)

        galleryUtils.showOnlyEvenItems(ONE_ITEM_COUNT)

        verify(numberUtils, never()).printItem()
    }
}