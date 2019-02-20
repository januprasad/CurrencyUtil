package `in`.januprasad.currencyops

import java.math.BigDecimal

/**
 * Created by januprasad on 20,February,2019
 */

object BigDecimalUtils {

    fun createCurrency(amount: Double): BigDecimal = if (amount % 1 == 0.0) MAKE_BD(amount, 0) else MAKE_BD(amount, 2)
    fun createCurrency(amount: String): BigDecimal {
        if (amount.isNullOrEmpty()) {
            return MAKE_BD("0", 0)
        }
        return if (amount.toDouble() % 1 == 0.0) MAKE_BD(amount, 0) else MAKE_BD(amount, 2)
    }

    fun getBigDecimal(amount: Double, precision: Int): BigDecimal = MAKE_BD(amount, precision)

    fun getBigDecimal(amount: String, precision: Int): BigDecimal = MAKE_BD(amount, precision)

    fun getBigDecimal(amount: Double, precision: Int, roundoffMode: Int): BigDecimal =
        MAKE_BD(amount, precision, roundoffMode)

    fun setScaleBigDecimal(bigDecimal: BigDecimal, precision: Int, roundoffMode: Int): BigDecimal =
        SET_SCALE_BD(bigDecimal, precision, roundoffMode)

    private fun MAKE_BD(amount: Double, precision: Int): BigDecimal =
        BigDecimal(amount).setScale(precision, BigDecimal.ROUND_HALF_UP)

    private fun MAKE_BD(amount: String, precision: Int): BigDecimal =
        BigDecimal(amount).setScale(precision, BigDecimal.ROUND_HALF_UP)

    private fun MAKE_BD(amount: Double, precision: Int, roundOffMode: Int): BigDecimal =
        BigDecimal(amount).setScale(precision, roundOffMode)

    private fun SET_SCALE_BD(bd: BigDecimal, precision: Int, roundOffMode: Int): BigDecimal =
        bd.setScale(precision, roundOffMode)

}
