package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // SELECT * from clienti where name = 'Mario';  ES 1

        // select name, last_name from clienti where extract(year from date_of_birth) = 1982; ES 2

        // select * from invoices where vat = 20; ES 3

        // select * from products where extract(year from activation_date) = 2017 and being_produced = 'true' and being_sold = 'true'; ES 4

        // select * from invoices join clienti on clienti.client_number = invoices.client_id where amount < '1000'; ES 5

        // select invoice_number , amount , vat , invoice_date , providers.denomination from invoices  join providers on invoices.provider_number = providers.provider_number; ES 6

        // select extract(year from invoice_date) as years, count(*) as invoice_number from invoices where vat = 20 group by extract(year from invoice_date) order by years ; ES 7

        // select extract(year from invoice_date ) as years, count(*) as counter, sum(amount) as invoice_sum from invoices group by extract(year from invoice_date) order by years; ES 8 



        }
    }
}