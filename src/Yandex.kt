import java.util.*

class Yandex : YandexImp {

    var arrayListCostumer = arrayOfNulls<Costumer>(100)
    var arrayListDriver = arrayOfNulls<Driver>(100)
    var count = 0
    var read = Scanner(System.`in`)
    override fun addCostumer() {
        println("Nameni kiriting:")
       val name=read.next()
        println("Tel raqamni kiriting:")
        val numberTel = read.nextInt()
        println("Locatsiyani kiriting:")
        val location = read.next()
        val costumer = Costumer(name, numberTel, location,0,false)
        arrayListCostumer[count++] = costumer
    }


    override fun deleteCostumer() {
        println("Delete Nameni kiriting:")
        val deleteName = read.next()
        var isdelete = false
        var index = -1
        for (i in arrayListCostumer.indices) {
            if (arrayListCostumer[i]?.name == deleteName) {
                isdelete = true
                index = i
                break
            }
        }
        if (isdelete) {
            for (i in index until count) {
                arrayListCostumer[i] = arrayListCostumer[i + 1]
            }
            arrayListCostumer[count - 1] = null
            count--
            println(" Costumer uchirildi!!!")
        } else {
            println("Costumer Uchirilmadi!!!")
        }
    }
    override fun allCostumer() {
        if (count == 0) {
            println("Costumer topilmadi!!!")
        } else {
            for (i in 0 until count) {
                println(arrayListCostumer[i]!!.name + " " + arrayListCostumer[i]?.numberTel + " " + arrayListCostumer[i]?.location)
            }
        }

    }

    override fun addDriver() {
        println("Nameni kiriting:")
       val name =  read.next()
        println("Mashina raqamini kiriting:")
        val carNumber = read.nextInt()
        println("Tel raqamni kiriting:")
        val numberTel =  read.nextInt()
        println("Locatsiyani kiriting:")
         val location = read.next()
        val driver = Driver(name, carNumber, numberTel, location)
        arrayListDriver[count++] = driver

    }
    override fun deleteDriver() {
        println("Delete Nameni kiriting:")
        val deleteName = read.next()
        var isdelete = false
        var index = -1
        for (i in arrayListDriver.indices) {
            if (arrayListDriver[i]?.name == deleteName) {
                isdelete = true
                index = i
                break
            }
        }
        if (isdelete) {
            for (i in index until count) {
                arrayListDriver[i] = arrayListDriver[i + 1]
            }
            arrayListDriver[count - 1] = null
            count--
            println(" Driver uchirildi!!!")
        } else {
            println("Driver Uchirilmadi!!!")
        }

    }

    override fun allDriver() {
        if (count == 0) {
            println("Driver topilmadi!!!")
        } else {
            for (i in 0 until count) {
                println(arrayListDriver[i]!!.name + " " + arrayListDriver[i]?.numberTel + " " + arrayListDriver[i]?.location)
            }

        }

    }

    override fun roadPrice():Int {
        println("Yo'l narxi 1 km = 1400 so'm")
        println("Manzilgacha bo'lgan taxminiy masofani kiriting:")
        val roadprice = read.nextInt()
        return roadprice*1400
    }

    override fun getCostumer(){
        allCostumer()


    }
    override fun getTaxi() {
        var  a =  roadPrice()
        println("Manzilgacha eltib qo'yish $a so'm")
        println("Taksiga buyurtma berasizmi \n"+"1->Ha\n"+"2->Yo'q")
        var n = read.nextInt()
        when(n){
            1->{

            }
            2->{

            }
        }

    }
}