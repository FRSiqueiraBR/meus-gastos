package br.com.frsiqueira.meusgastos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import br.com.frsiqueira.meusgastos.dto.Expense
import kotlinx.android.synthetic.main.activity_create_expense.*

class CreateExpense : AppCompatActivity() {

    private val paymentMethods = arrayOf("Debito", "Credito", "Dinheiro")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_expense)

        val spinnerArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, paymentMethods)
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spn_payment_method.adapter = spinnerArrayAdapter

        btn_save_expense.setOnClickListener {
            Expense(null, exp_decription.text.toString(), 0.0, spn_payment_method.selectedItem.toString())
        }
    }
}
