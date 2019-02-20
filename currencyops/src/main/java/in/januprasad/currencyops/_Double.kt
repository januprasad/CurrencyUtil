package `in`.januprasad.currencyops

import java.text.DecimalFormat

/**
 * Created by januprasad on 20,February,2019
 */
val PATTERN = "###.##"

fun Double.tailZeros(): String? {
    val decimalFormat = DecimalFormat(PATTERN)
    return decimalFormat.format(this)
}