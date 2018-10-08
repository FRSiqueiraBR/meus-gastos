package br.com.frsiqueira.meusgastos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_create_expense.*

class CreateExpense : AppCompatActivity() {

    val paymentMethods = arrayOf("Debito", "Credito", "Dinheiro")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_expense)

        val spinnerArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, paymentMethods)
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spn_payment_method.adapter = spinnerArrayAdapter
    }
}
