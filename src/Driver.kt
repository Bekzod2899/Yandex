class Driver {
    var name = ""
    var carNumber = 0
    var numberTel = 0
    var location = ""
    var money = 0

    constructor(name: String, carNumber: Int, numberTel: Int, location: String) {
        this.name = name
        this.carNumber = carNumber
        this.numberTel = numberTel
        this.location = location
    }

    override fun toString(): String {
        return "Driver(name='$name', carNumber=$carNumber, numberTel=$numberTel, location=$location)"
    }

}