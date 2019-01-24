/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/
package com.example.android.justjava;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox = (CheckBox)findViewById(R.id.whipped_cream_checkbox);
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        EditText nameEditText = (EditText) findViewById(R.id.name_edittext);
        String nameEdit = nameEditText.getText().toString();
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        boolean hasChocolate = chocolateCheckBox.isChecked();
        int price = calculatePrice(quantity,hasWhippedCream,hasChocolate);
        String priceMessage = createOrderSummary(price, hasWhippedCream,hasChocolate, nameEdit);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: "));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java order for "+ nameEdit);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * It needs to be public so they could us in xml
     * */
    public void increment(View view) {
        if(quantity==100){
            Toast.makeText(this, "You can't have more than 100 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if(quantity == 1){
            Toast.makeText(this, "You can't have less than 1 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        display(quantity);
    }

    private int calculatePrice(int quantity, boolean addWhippedCream, boolean addChocolate){
        int baseprice = 5;
        if(addWhippedCream){
            baseprice = baseprice +1;
        }
        if(addChocolate){
            baseprice = baseprice+2;
        }
        int price = quantity * baseprice;
        return price;

    }

    private String createOrderSummary(int price, boolean hasWhippedCream, boolean hasChocolate, String editName){
        String pricemessage = getString(R.string.order_summary_name, editName);
        pricemessage = pricemessage + "\nAdd whipped cream? " + hasWhippedCream;
        pricemessage = pricemessage + "\nAdd Chocolate? " + hasChocolate;
        pricemessage = pricemessage + "\nQuantity: " + quantity;
        pricemessage = pricemessage + "\nTotal: $" + price;
        pricemessage = pricemessage + "\n"+ getString(R.string.thankyou);
        return  pricemessage;
    }
}