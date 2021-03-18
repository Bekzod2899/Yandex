import java.util.*

fun main() {

    val read = Scanner(System.`in`)
    val yandex = Yandex()
    while (true) {
        println("1->Driver\n" + "2->Customer\n")
        val n = read.nextInt()
        when (n) {
            1 -> {
                println("1->AddDriver\n" + "2->DeleteDriver\n" + "3->AllDriver")
                val m = read.nextInt()
                when (m) {
                    1 -> {
                        yandex.addDriver()
                    }
                    2 -> {
                        yandex.deleteDriver()
                    }
                    3 -> {
                        yandex.allDriver()
                    }
                }
            }
            2 -> {
                println("1->AddCustomer\n" + "2->DeleteCustomer\n" + "3->AllCustomer\n"+"4->RoadPrice")
                when (read.nextInt()) {

                    1 -> {
                        yandex.addCostumer()
                    }
                    2 -> {
                        yandex.deleteCostumer()
                    }
                    3 -> {
                        yandex.allCostumer()
                    }
                    4->{
                        yandex.roadPrice()
                    }
                }
            }
        }
    }
}