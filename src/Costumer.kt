class Costumer(var name: String, var numberTel: Int, var location: String,var money:Int, var isGetTaxi:Boolean = false) {


    override fun toString(): String {
        return "Costumer(name='$name', numberTel=$numberTel, location='$location')"
    }

}