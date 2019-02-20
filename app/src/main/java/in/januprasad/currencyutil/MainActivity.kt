package `in`.januprasad.currencyutil

import `in`.januprasad.bdlibs.BigDecimalUtils.createCurrency
import `in`.januprasad.bdlibs.toIndianRupee
import `in`.januprasad.bdlibs.toIndianRupeeWithUnit
import `in`.januprasad.bdlibs.toUSDollar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener {

            val text = price.text.toString()
            result.text = createCurrency(text).toIndianRupee()!!.appendStart(getString(R.string.without_inr_unit))
            result_inr.text = createCurrency(text).toIndianRupeeWithUnit()!!.appendStart(getString(R.string.with_inr_unit))
            result_dollar.text = createCurrency(text).toUSDollar()!!.appendStart(getString(R.string.without_dollar_unit))

        }

    }
}
