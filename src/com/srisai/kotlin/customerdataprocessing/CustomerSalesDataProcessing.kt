package com.srisai.kotlin.customerdataprocessing

import java.io.File

fun main(args: Array<String>) {

    var lineCount: Int = 0

    File("/Users/jayakar/Git-Repo/SrisaiKotlinSamples/src/com/srisai/kotlin/customerdataprocessing/sales_data_sample.csv").forEachLine {
        if (lineCount == 0) {
            lineCount++
            return@forEachLine
        }

        var tokens = it.split(",")
        var customers = Customer(
                customerName = tokens[13],
                address = Address(
                        tokens[15],
                        tokens[16],
                        tokens[17],
                        tokens[18],
                        tokens[19],
                        tokens[20],
                        tokens[21]
                ),
                phoneNo = tokens[14],
                contactFirstName = tokens[22],
                contactLastName = tokens[23],
                orders = Order(
                        orderNo = tokens[0].toInt(),
                        quantity = tokens[1].toInt(),
                        orderStatus = tokens[6],
                        orderDate = tokens[4],
                        sales = tokens[5],
                        products = Product(
                                productCode = tokens[12],
                                productName = tokens[10],
                                price = tokens[2].toDouble()
                        )

                )

        )

        println(customers)
    }
}

data class Customer(
        val customerName: String,
        val address: Address,
        val phoneNo: String,
        val contactFirstName: String,
        val contactLastName: String,
        val orders: Order
)

data class Address(
        val address1: String,
        val address2: String,
        val city: String,
        val state: String,
        val postalCode: String,
        val country: String,
        val territory: String
)

data class Order(
        val orderNo: Int,
        val quantity: Int,
        val orderStatus: String,
        val orderDate: String,
        val sales: String,
        val products: Product
)

data class Product(
        val productCode: String,
        val productName: String,
        val price: Double
)