package `in`.januprasad.currencyops

import java.math.BigDecimal
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

/**
 * Created by januprasad on 20,February,2019
 */
fun BigDecimal.justFormat(): String? {
    val decimalFormat = DecimalFormat("##,##,###.00")
    return decimalFormat.format(this.toDouble())
}

fun BigDecimal.toIndianRupee(): String? {
    return toIndianRupeeWithUnit()!!.replace("₹", "")
}

fun BigDecimal.toIndianRupeeWithUnit(): String? {
    val indiaLocale = Locale("en", "IN")
    val india = NumberFormat.getCurrencyInstance(indiaLocale)
    return india.format(this.toDouble())
}

fun BigDecimal.toUSDollar(): String? {
    val us = NumberFormat.getCurrencyInstance(Locale.US)
    return us.format(this.toDouble())
}

fun BigDecimal.appendUnit() = "${"$"}$this"

