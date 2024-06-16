package com.vladislav.shumilov.unit.tests.example.utils

internal class GalleryUtils(private val numberUtils: NumberUtils) {

    fun showOnlyEvenItems(itemsCount: Int) {
        for (i in 1..itemsCount) {
            if (numberUtils.isEven(i)) {
                numberUtils.printItem()
            }
        }
    }
}